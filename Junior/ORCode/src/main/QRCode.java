package main;

import com.swetake.util.Qrcode;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * ClassName:QRCode
 * PackageName:main
 * Description:
 *
 * @date:2022/7/22 21:51
 * @author: wangchunping
 */
public class QRCode {
    class EncodeMode{
        public final static char N='N';
        public final static char A='A';
        public final static char B='B';

    }
    class ErrorCorrent{
        public final static char L='L';
        public final static char M='M';
        public final static char Q='Q';
        public final static char H='H';
    }
    public static boolean CreateQRCode(String content,String savePath,int version,String logoPath){
        // 创建生成二维码的对象
        Qrcode qrcode = new Qrcode();
        // 设置二维码的容错能力等级
        qrcode.setQrcodeErrorCorrect(ErrorCorrent.M);
        // N代表的是数字，A代表的是a-z,B代表的是其他字符
        qrcode.setQrcodeEncodeMode(EncodeMode.B);
        // 版本
        qrcode.setQrcodeVersion(version);

        // 设置验证码的大小
        int width = 67 + 12 * (version - 1);
        int height = 67 + 12 * (version - 1);
        // 定义缓冲区图片
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        // 设置画图工具
        Graphics2D gs = bufferedImage.createGraphics();
        // 设置二维码背景颜色
        gs.setBackground(Color.white);//lightGray
        // 设置颜色
        gs.setColor(Color.black);//cyan,green,red,black,pink
        // 清除画板内容
        gs.clearRect(0, 0, width, height);
        // 定义偏移量
        int pixoff = 2;

        // 填充的内容转化为字节数
        byte[] ctt;
        try {
            ctt = content.getBytes("utf-8");
            // 设置编码方式
            if (ctt.length > 0 && ctt.length < 120) {
                boolean[][] s = qrcode.calQrcode(ctt);
                for (int i = 0; i < s.length; i++) {
                    for (int j = 0; j < s.length; j++) {
                        if (s[j][i]) {
                            // 验证码图片填充内容
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);
                        }
                    }
                }
            }

            /* 判断是否需要添加logo图片 */
            if(logoPath != null){
                File icon = new File(logoPath);
                if(icon.exists()){
                    int width_4 = width / 4;
                    int width_8 = width_4 / 2;
                    int height_4 = height / 4;
                    int height_8 = height_4 / 2;
                    Image img = ImageIO.read(icon);
                    gs.drawImage(img, width_4 + width_8, height_4 + height_8,width_4,height_4, null);
                }else{
                }

            }

            // 结束写入
            gs.dispose();
            // 结束内存图片
            bufferedImage.flush();
            // 保存生成的二维码图片
            ImageIO.write(bufferedImage, "png", new File(savePath));

            return true;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }
    public static void main(String[] args) {
        String content = "要多开心的笑笑！！！！"; //二维码信息
        String savePath = "E:/csd.png";  //二维码图片保存位置和名称
        int version = 9;
        String logoPath = "E:/cndsLOGO.png"; //Logo图片
        boolean result = CreateQRCode(content, savePath, version, logoPath);
        if (result){
            System.out.println("\n二维码图片生成成功！");
        }else{
            System.out.println("\n二维码图片生成失败！");
        }
    }
}
