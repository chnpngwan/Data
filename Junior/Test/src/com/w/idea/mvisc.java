//package com.w.idea;
//
//import javax.swing.*;
//import javax.swing.text.BadLocationException;
//import javax.swing.text.Document;
//import javax.swing.text.SimpleAttributeSet;
//import javax.swing.text.StyleConstants;
//import java.applet.Applet;
//import java.awt.*;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseListener;
//import java.net.MalformedURLException;
//import java.util.TimerTask;
//import java.util.Vector;
//
///**
// * ClassName:mvisc
// * PackageName:com.w.idea
// * Description:
// *
// * @date:2022/6/18 13:03
// * @author: wangchunping
// */
//public class mvisc {
//
//    /*
//        音乐播放器类
//    */
//    class audioplay{
//        AudioClip adc;
//        URL url;
//        boolean adcFlag=false;//文件标志
//        boolean playFlag=false;//播放标志
//        void SetPlayAudioPath(String path){//设置路径
//            try{
//                url = new URL(path);
//                if(adcFlag==true){adc.stop();playFlag=false;}
//                adc = Applet.newAudioClip(url);
//                adcFlag=true;
//            }
//            catch (MalformedURLException e1) {
//                e1.printStackTrace();
//            }
//        }
//        void play(){    //播放音乐
//            adc.play();
//            playFlag=true;
//        }
//        void stop(){     //暂停音乐
//            adc.stop();
//            playFlag=false;
//        }
//    }
//
//    /*
//        图像界面类
//     */
//    class MyExtendsJFrame extends JFrame implements ActionListener, MouseListener {
//        //参数
//        final int width = 1280;//界面宽度1280
//        final int height = 836;//界面高度836
//        final int tool_width = 42;//图标大小
//
//        //工作成员
//        audioplay audioPlay;//音乐播放器
//        Timer nTimer;//定时器
//        String MusicName;//音乐名
//        String playFile;//文件路径
//        String playFileName;//文件名
//        String playFileDirectory;//文件的具体目录
//        int MusicTime;//当前时间
//        Vector vt = new Vector();//播放队列
//        Vector vtime = new Vector();//时间队列
//        int flagway = 0;//播放方式 0->循环播放 1->顺序播放 2->随机播放
//
//        //控件
//        JLabel background;//背景
//        JButton buttonPlay;//播放按钮
//        JButton buttonOpenFile;//打开文件按钮
//        JTextPane textLyrics;//歌词
//        JLabel playTime;//进度条
//        JList listPlayFile;//播放列表
//        JButton buttonNext;//下一首
//        JButton buttonPre;//上一首
//        JLabel backgroundPlay;//播放图片
//        JTextArea textMusic;//音乐名
//        JList listPlayFileTime;//音乐播放时间
//        JButton buttonShowList;//播放列表
//        JTextArea musictitle;//歌曲名
//        JButton buttonWay;//播放方式
//        JTextArea TimeCount;//显示当前播放时间
//        JLabel gifwave;//动态波形
//        JLabel giflight;//动态荧光棒
//
//	/*
//		歌词
//	*/
//
//        //飘洋过海
//        String[] sLyrics1 = {//{4,7,10,12,16,22,26,29,31,35,39,42,48,52}
//                "记忆它总是慢慢的累积\n",//4
//                "在我心中无法抹去\n",//7
//                "为了你的承诺\n",	//10
//                "我在最绝望的时候\n",//12
//                "都忍着不哭泣\n",//16
//                "陌生的城市啊\n",//22
//                "熟悉的角落里\n",//26
//                "也曾彼此安慰\n",//29
//                "也曾相拥叹息\n",//31
//                "不管将会面对什么样的结局\n",//35
//                "在漫天风沙里望着你远去\n",//39
//                "我竟悲伤得不能自己\n",//42
//                "多盼能送君千里\n",//45
//                "直到山穷水尽\n",//48
//                "一生和你相依"//52
//        };
//
//        //山外小楼夜听雨
//        String[] sLyrics2 = {
//                "芙蓉花又栖满了枝头 \n",
//                "亲何蝶雅留\n",
//                "票白如江水向东流入\n" ,
//                "望断门前隔岸的杨柳 \n",
//                "寂寞仍不休\n",
//                "我无言让眼泪长流\n",
//                "我独酌山外小阁楼\n",
//                "听一夜相思愁\n",
//                "醉后让人烦忧心事雅收\n",
//                "山外小阁楼我乘一叶小舟\n",
//                "放思念随风漂流\n",
//                "我独坐山外小阁楼\n" ,
//                "窗外渔火如豆\n",
//                "江畔晚风拂柳诉尽离愁\n",
//                "当月色暖小楼是谁又在弹奏\n",
//                "那一曲思念常留\n"
//        };
//
//
//        //我和我的祖国
//        String[] sLyrics3 = {//{1,6,10,15,19,24,28,32,50,59}
//                "我和我的祖国\n",
//                "一刻也不能分割\n",
//                "无论我走到哪里\n",
//                "都流出一首赞歌\n",
//                "我歌唱每一座高山\n",
//                "我歌唱每一条河\n",
//                "袅袅炊烟，小小村落\n",
//                "路上一道辙\n",
//                "你用你那母亲的脉搏和我诉说\n"
//        };
//
//
//        /*
//            初始化界面
//        */
//        public MyExtendsJFrame(){
//            audioPlay=new audioplay();  //音乐播放对象
//            setTitle("星星播放器");
//            setBounds(160,100,1300,880);
//            //setBounds(160,100,1300,880);
//            setLayout(null);//排版方式
//            init();   //初始化
//            setVisible(true);//设置界面可见
//            setDefaultCloseOperation(EXIT_ON_CLOSE);//默认退出方式
//        }
//        void init(){//界面的初始化
//		/*
//			界面背景设置
//		*/
//            Icon img=new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\r.jpg");//界面背景
//            background = new JLabel(img);
//            background.setBounds(0,0,width,height);//设置位置
//            getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));//设为最底层
//            ((JPanel)getContentPane()).setOpaque(false); //控件透明
//
//		/*
//			播放按钮设置
//		*/
//            buttonPlay=new JButton();//播放按钮
//            buttonPlay.setBounds(width/2-tool_width/2,height-tool_width - 10,tool_width,tool_width); //设置位置
//            Icon icon=new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\3.jpg");//设置图标
//            buttonPlay.setIcon(icon);
//            buttonPlay.setBorderPainted(false);//消隐
//            buttonPlay.addActionListener(this);//添加监听器
//            add(buttonPlay);
//
//		/*
//			下一首按钮
//		*/
//            buttonNext = new JButton("");//下一首按钮
//            buttonNext.setBounds(width/2-tool_width/2+47, height-tool_width - 10, tool_width, tool_width);
//            icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\5.jpg");
//            buttonNext.setIcon(icon);
//            buttonNext.setBorderPainted(false);//消隐
//            buttonNext.addActionListener(this);
//            add(buttonNext);
//
//		/*
//			上一首按钮
//		*/
//            buttonPre = new JButton("");
//            buttonPre.setBounds(width/2-tool_width/2-40, height-tool_width - 12, tool_width-3, tool_width-3);
//            icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\e.jpg");
//            buttonPre.setIcon(icon);
//            buttonPre.setBorderPainted(false);//消隐
//            buttonPre.addActionListener(this);
//            add(buttonPre);
//
//		/*
//			播放方式按钮
//		*/
//            buttonWay = new JButton("");
//            buttonWay.setBounds(width/2-tool_width/2-90, height-tool_width - 10, tool_width-10, tool_width-10);
//            icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\er.jpg");
//            buttonWay.setIcon(icon);
//            buttonWay.setBorderPainted(false);//消隐
//            buttonWay.addActionListener(this);
//            add(buttonWay);
//
//		/*
//			文件打开按钮
//		*/
//            buttonOpenFile=new JButton("");//打开按钮
//            buttonOpenFile.setBounds(width-95,height-50,tool_width-10,tool_width-10); //设置位置
//            icon=new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\8.jpg"); //图标
//            buttonOpenFile.setIcon(icon);
//            buttonOpenFile.setBorderPainted(false);//消隐
//            buttonOpenFile.addActionListener(this);//添加监听器
//            add(buttonOpenFile);
//
//		/*
//			音乐播放背景
//		*/
////		icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\r.jpg");
////		backgroundPlay = new JLabel(icon);
////		backgroundPlay.setBounds(100, 120, 450, 450);
////		getLayeredPane().add(backgroundPlay);
//            //backgroundPlay.addMouseListener(this);//添加监听器
//
//		/*
//			动态的GIF波形
//		*/
//
//            icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\un.gif");
//            gifwave = new JLabel(icon);
//            gifwave.setBounds(-10,height-133,width-20,50);	  	//设置大小
//            add(gifwave);
//            gifwave.setVisible(true);
//
//
//		/*
//			时间条
//		*/
//
////		icon=new ImageIcon(".//Imag//time.jpg");     //时间条
////		playTime = new JLabel(icon);
////		playTime.setBounds(0,height-77,width,3);	  	//设置大小
////		add(playTime);
//
//		/*
//            设置时间显示
//         */
//            TimeCount = new JTextArea("00:00");
//            TimeCount.setBounds(width/2-350,height-45,80,20);
//            TimeCount.setForeground(Color.white);
//            TimeCount.setFont(new Font("楷体",1,20));
//            TimeCount.setOpaque(false);
//            add(TimeCount);//添加时间计数监听器
//
//		/*
//			音乐列表按钮
//		*/
//            buttonShowList = new JButton("");
//            buttonShowList.setBounds(width-60,height-50,tool_width-10,tool_width-10);
//            buttonShowList.setIcon(new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\28.jpg"));
//            buttonShowList.setBorderPainted(false);//消隐
//            buttonShowList.addActionListener(this);
//            add(buttonShowList);
//
//		/*
//			歌词
//		*/
//            textLyrics=new JTextPane();   //歌词
//            textLyrics.setBounds(width/2+300,height/2-200,250,300);//设置位置
//            textLyrics.setForeground(Color.white);//前置颜色
//            textLyrics.setOpaque(false);
//            add(textLyrics);
//            textLyrics.setText("这是歌词");//歌词内容
//            textLyrics.setFont(new Font("楷体",1,20));
//
//		/*
//			歌名
//		*/
//
//            musictitle = new JTextArea("歌名");
//            musictitle.setBounds(width/2+300,height/2-200-50,300,100);
//            musictitle.setForeground(Color.white);
//            musictitle.setOpaque(false);
//            musictitle.setFont(new Font("楷体",1,30));
//            add(musictitle);
//
//		/*
//			音乐列表
//		*/
//
//            listPlayFile=new JList();	  //音乐列表
//            listPlayFile.setBounds(width-300,height-300,200,150); //设置位置
//            listPlayFile.setOpaque(false);
//            listPlayFile.setFont(new Font("楷体",1,20));
//            listPlayFile.setBackground(new Color(0, 0, 0, 0));//设置背景
//            listPlayFile.setForeground(Color.white);
//            add(listPlayFile);
//            listPlayFile.addMouseListener(this);//添加监听器
//
//		/*
//			音乐播放时间
//		*/
//            listPlayFileTime = new JList();
//            listPlayFileTime.setBounds(width-300+200,height-300,150,150);
//            listPlayFileTime.setOpaque(false);
//            listPlayFileTime.setFont(new Font("楷体",1,20));
//            listPlayFileTime.setBackground(new Color(0, 0, 0, 0));
//            listPlayFileTime.setForeground(Color.white);
//            add(listPlayFileTime);
//        }
//
//        /*
//            时间计数器
//         */
//        public void timerFun(int musicTime)
//        {
//            MusicTime = musicTime;//当前音乐播放需要的时间
//            if (nTimer != null) {//计数器如果在走则停下来
//                nTimer.cancel();
//            }
//            //重新创建一个时间对象
//            nTimer = new Timer();
//            nTimer.schedule(new TimerTask()//内部类
//            {
//                int PlayTime = 0;
//                public void run()//时间走
//                {
//                    PlayTime ++;//+1s
//                    if (PlayTime >= MusicTime) {//播放结束
//                        nTimer.cancel();
//                        //int flagway = 0;//播放方式 0->循环播放 1->顺序播放 2->随机播放
//                        if(flagway==0&&vt.size()!=0){//0->循环播放
//                            audioPlay.play();
//                            timerFun(MusicTime);
//                        }
//                        else if(flagway==1&&vt.size()!=0){//1->顺序播放
//                            int position = vt.lastIndexOf(playFileName);
//                            position = (position+1)%(vt.size());//通过取余获得下一个音乐的位置
//                            playFileName=(String)vt.get(position);
//                            playFile = playFileDirectory + playFileName;
//                            audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                            audioPlay.play();//播放下一首音乐
//                            File file = new File(playFile);
//                            int nMusicTime = (int)file.length() / 1024 / 173;//文件播放需要的时间
//                            timerFun(nMusicTime);
//                        }
//                        else if(flagway==2){
//                            int position = vt.lastIndexOf(playFileName);
//                            int choose = 0;
//                            do{//随机选中一个不同的音乐
//                                choose = (int)(Math.random() * vt.size());
//                            }while(position==choose);
//                            playFileName=(String)vt.get(choose);
//                            playFile = playFileDirectory + playFileName;
//                            audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                            audioPlay.play();//播放下一首音乐
//                            File file = new File(playFile);
//                            int nMusicTime = (int)file.length() / 1024 / 173;//文件播放需要的时间
//                            timerFun(nMusicTime);
//                        }
//                    }
//
//				/*
//					更换音乐播放图片(随机)
//				*/
//                    final int N = 10;//10张背景图
//                    if(PlayTime%6==0){
//                        int choose = (int)(Math.random()*N)+1;
//                        Icon picture = new ImageIcon("C:\\Users\\11784\\Desktop\\其他"+choose+".jpg");
//                        backgroundPlay.setIcon(picture);
//                        System.out.println("选择图片"+choose);
//                    }
//
//				/*
//					显示当前播放时间
//				*/
//                    int Second = PlayTime % 60;//秒
//                    int Minute = PlayTime / 60;//分钟
//
//                    String sSecond = "";//秒钟字符串
//                    String sMinute = "";//分钟字符串
//                    if (Second < 10) {//低于2位添加0
//                        sSecond = "0" + Second;
//                    }
//                    else{
//                        sSecond = "" + Second;
//                    }
//                    if (Minute < 10) {//低于2位添加0
//                        sMinute = "0" + Minute;
//                    }
//                    else{
//                        sMinute = "" + Minute;
//                    }
//                    String sPlayTime = sMinute + ":" + sSecond;
//                    System.out.println(sPlayTime);
//                    TimeCount.setText(sPlayTime);//更新当前播放时间
//                    playTime.setBounds(50,height-77, width * PlayTime / MusicTime , 3);
//
//				/*
//					歌词显示
//				*/
//                    textLyrics.setText("");//歌词清空
//                    //确定是哪个台词
//                    //1->飘洋过海 2->山外小楼夜听雨 3->我和我的祖国
//                    int flag = 0;
//                    if(playFileName.equals("飘洋过海.mp3")){
//                        flag = 1;
//                        System.out.println("播放飘洋过海歌词");
//                    }
//                    else if(playFileName.equals("山外小楼夜听雨.mp3")){
//                        flag = 2;
//                        System.out.println("播放山外小楼夜听雨歌词");
//                    }
//                    else if(playFileName.equals("我和我的祖国.mp3")){
//                        flag = 3;
//                        System.out.println("播放我和我的祖国歌词");
//                    }
//
//                    //逐行扫描歌曲,对应时间段的歌词高亮
//                    if(flag == 1){//飘洋过海
//                        int []breaktime = {1,5,8,11,13,17,23,27,30,32,36,40,43,45,49,53};
//                        final int MAX = 12;//最多显示12行
//                        //确定时间段
//                        int position = 0;
//                        for (int i = 0; i < sLyrics1.length; i++)
//                        {
//
//                            for(position = 0;position <sLyrics1.length-1 ;position++){
//                                if(PlayTime<breaktime[0]){
//                                    break;
//                                }
//                                if(PlayTime>=breaktime[position]&&PlayTime<=breaktime[position+1]-1){
//                                    break;
//                                }
//                            }
//                            System.out.println("当前播放位置"+position);
//                            SimpleAttributeSet attrSet = new SimpleAttributeSet();
//                            StyleConstants.setFontFamily(attrSet, "隶书");
//                            StyleConstants.setFontSize(attrSet,20);
//                            int over =  position-MAX;//越过的歌词
//                            System.out.println("越界"+over);
//                            try
//                            {
//                                Document doc = MyExtendsJFrame.this.textLyrics.getDocument();//获得歌词内容
//                                StyleConstants.setForeground(attrSet, Color.yellow);//当前歌词高亮
//                                StyleConstants.setBold(attrSet, true);//加粗
//                                if(PlayTime>=breaktime[i]&&PlayTime<=breaktime[i+1]-1){
//                                    doc.insertString(doc.getLength(), sLyrics1[i], attrSet);//当前歌词高亮
//                                    System.out.println(sLyrics1[i]);
//                                }
//                                else{//不在当前歌词普通显示
//                                    StyleConstants.setForeground(attrSet, Color.white);
//                                    StyleConstants.setBold(attrSet, false);
//                                    if(over>=0&&i-over<=0){//越界
//                                        continue;
//                                    }
//                                    doc.insertString(doc.getLength(), sLyrics1[i], attrSet);
//                                }
//                            }
//                            catch (BadLocationException localBadLocationException) {}
//                        }
//                    }
//                    else if(flag == 2){//山外小楼夜听雨
//                        //设置断点
//                        int []breaktime = {17,21,25,30,35,39,44,49,53,59,66,72,76,81,87,94,100};
//                        final int MAX = 12;//最多显示12行
//                        //确定时间段
//                        int position = 0;
//
//                        for (int i = 0; i < sLyrics2.length; i++)
//                        {
//
//                            for(position = 0;position <sLyrics2.length-1 ;position++){
//                                if(PlayTime<breaktime[0]){
//                                    break;
//                                }
//                                if(PlayTime>=breaktime[position]&&PlayTime<=breaktime[position+1]-1){
//                                    break;
//                                }
//                            }
//                            System.out.println("当前播放位置"+position);
//                            SimpleAttributeSet attrSet = new SimpleAttributeSet();
//                            StyleConstants.setFontFamily(attrSet, "隶书");
//                            StyleConstants.setFontSize(attrSet,20);
//                            int over =  position-MAX;//越过的歌词
//                            System.out.println("越界"+over);
//                            try
//                            {
//                                Document doc = MyExtendsJFrame.this.textLyrics.getDocument();//获得歌词内容
//                                StyleConstants.setForeground(attrSet, Color.yellow);//当前歌词高亮
//                                StyleConstants.setBold(attrSet, true);//加粗
//                                if(PlayTime>=breaktime[i]&&PlayTime<=breaktime[i+1]-1){
//                                    doc.insertString(doc.getLength(), sLyrics2[i], attrSet);//当前歌词高亮
//                                    System.out.println(sLyrics2[i]);
//                                }
//                                else{//不在当前歌词普通显示
//                                    StyleConstants.setForeground(attrSet, Color.white);
//                                    StyleConstants.setBold(attrSet, false);
//                                    if(over>=0&&i-over<=0){//越界
//                                        continue;
//                                    }
//                                    doc.insertString(doc.getLength(), sLyrics2[i], attrSet);
//                                }
//                            }
//                            catch (BadLocationException localBadLocationException) {}
//                        }
//                    }
//                    else if(flag == 3){//我和我的祖国
//                        int []breaktime = {1,6,10,15,19,24,28,32,50,59};
//                        final int MAX = 12;//最多显示12行
//                        //确定时间段
//                        int position = 0;
//                        for (int i = 0; i < sLyrics3.length; i++)
//                        {
//
//                            for(position = 0;position <sLyrics3.length-1 ;position++){
//                                if(PlayTime<breaktime[0]){
//                                    break;
//                                }
//                                if(PlayTime>=breaktime[position]&&PlayTime<=breaktime[position+1]-1){
//                                    break;
//                                }
//                            }
//                            System.out.println("当前播放位置"+position);
//                            SimpleAttributeSet attrSet = new SimpleAttributeSet();
//                            StyleConstants.setFontFamily(attrSet, "隶书");
//                            StyleConstants.setFontSize(attrSet,20);
//                            int over =  position-MAX;//越过的歌词
//                            System.out.println("越界"+over);
//                            try
//                            {
//                                Document doc = MyExtendsJFrame.this.textLyrics.getDocument();//获得歌词内容
//                                StyleConstants.setForeground(attrSet, Color.yellow);//当前歌词高亮
//                                StyleConstants.setBold(attrSet, true);//加粗
//                                if(PlayTime>=breaktime[i]&&PlayTime<=breaktime[i+1]-1){
//                                    doc.insertString(doc.getLength(), sLyrics3[i], attrSet);//当前歌词高亮
//                                    System.out.println(sLyrics3[i]);
//                                }
//                                else{//不在当前歌词普通显示
//                                    StyleConstants.setForeground(attrSet, Color.white);
//                                    StyleConstants.setBold(attrSet, false);
//                                    if(over>=0&&i-over<=0){//越界
//                                        continue;
//                                    }
//                                    doc.insertString(doc.getLength(), sLyrics3[i], attrSet);
//                                }
//                            }
//                            catch (BadLocationException localBadLocationException) {}
//                        }
//                    }
//
//                }
//            }, 0L, 1000L);
//        }
//
//        /*
//            重写监听器
//        */
//        @SuppressWarnings("unchecked")//忽略警告
//	/*
//		鼠标按下动作
//	*/
//        public void actionPerformed(ActionEvent e){
//		/*
//			打开音乐文件
//		*/
//            if (e.getSource() == buttonOpenFile)
//            {
//                FileDialog openFile = new FileDialog(this, "音乐文件夹");//文件夹窗体
//                openFile.setVisible(true);//设为可见
//                if(openFile.getFile()!=null){//有选中的
//                    playFileName = openFile.getFile();//获得选中的文件名（我和我的祖国.wav）
//                }
//                else{//没有选中的，直接退出
//                    return;
//                }
//                System.out.println(playFileName);
//
//                this.playFileDirectory = openFile.getDirectory();//文件的具体目录C:\Users\LittleStar\Desktop\音乐播发器\Music\
//                System.out.println(playFileDirectory);
//                playFile = playFileDirectory + playFileName;//目录+文件名=指定文件
//
//                audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                audioPlay.stop();//暂停当前播放
//
//                //播放需要的时间
//                File file = new File(playFile);
//                int iMusicTime = (int)file.length() / 1024 / 173;
//                int iSecond = iMusicTime % 60;
//                int iMinute = iMusicTime / 60;
//
//                if(!vt.contains(playFileName)){//如果该音乐不在目录
//                    vt.add(playFileName);
//                    System.out.println("添加音乐"+playFileName);
//                    listPlayFile.setListData(vt);//将播放列表更新
//                    vtime.add(iMinute + ":" + iSecond);
//                    listPlayFileTime.setListData(vtime);
//                }
//            /*
//				播放该音乐
//			*/
//                audioPlay.SetPlayAudioPath("file:" + this.playFile);
//                audioPlay.play();
//                musictitle.setText(this.playFileName);
//                Icon icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\3.jpg");//将按钮改为暂停
//                buttonPlay.setIcon(icon);
//                backgroundPlay.setVisible(true);
//                int nMusicTime = (int)file.length() / 1024 / 173;//计算播放时间
//                timerFun(nMusicTime);//启动时间
//            }
//
//		/*
//			点击播放音乐
//		*/
//            if (e.getSource() == buttonPlay) {
//                if (!audioPlay.playFlag)//如果当前没有播放
//                {
//                    if(vt.size()!=0){//播放播放队列不为空
//                        if(listPlayFile.getSelectedValue() != null){//如果列表音乐有选中的
//                            playFile = playFileDirectory + listPlayFile.getSelectedValue().toString();//设置播放音乐为选中的音乐
//                        }
//                        else{//没有选中的
//                            playFile = playFileDirectory + listPlayFile.getModel().getElementAt(0).toString();//选中第一首音乐
//                            listPlayFile.setSelectedIndex(0);//第一首音乐选中
//                        }
//                        audioPlay.stop();//关闭之前的
//                        audioPlay.SetPlayAudioPath("file:" + playFile);//设置当前播放路径
//                        audioPlay.play();//播放
//                        Icon icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\3.jpg");
//                        buttonPlay.setIcon(icon);
//                        backgroundPlay.setVisible(true);
//                        File file = new File(this.playFile);
//                        int nMusicTime = (int)file.length() / 1024 / 173;
//                        timerFun(nMusicTime);
//                    }
//                    else{//当前播放队列为空
//                        System.out.println("没有音乐可以播放");
//                    }
//                }
//                else//当前为音乐播放状态转为暂停
//                {
//                    audioPlay.stop();
//                    nTimer.cancel();
//                    Icon icon = new ImageIcon("C:\\Users\\11784\\Desktop\\其他\\3.jpg");
//                    this.buttonPlay.setIcon(icon);
//                    this.backgroundPlay.setVisible(false);
//                    //this.nTimer.cancel();
//                }
//            }
//		/*
//			是否显示音乐列表
//		*/
//            if(e.getSource() == buttonShowList){
//                System.out.println("是否显示音乐列表");
//                if (listPlayFile.isVisible())
//                {
//                    System.out.println("关闭音乐列表");
//                    listPlayFile.setVisible(false);
//                    listPlayFileTime.setVisible(false);
//                }
//                else
//                {
//                    System.out.println("显示音乐列表");
//                    listPlayFile.setVisible(true);
//                    listPlayFileTime.setVisible(true);
//                }
//            }
//		/*
//			播放下一首
//		*/
//            if(e.getSource() == buttonNext){
//                if(vt.size()!=0){
//                    //寻找当前播放的位置
//                    int position = vt.lastIndexOf(playFileName);
//                    //System.out.println("当前位置"+position+"当前音乐数量"+vt.size());
//                    position = (position+1)%(vt.size());//通过取余获得下一个音乐的位置
//                    //System.out.println("当前位置"+position+"当前音乐数量"+vt.size());
//                    //System.out.println(vt.get(position));
//                    playFileName=(String)vt.get(position);
//                    playFile = playFileDirectory + playFileName;
//                    musictitle.setText(playFileName);
//                    audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                    audioPlay.play();//播放下一首音乐
//                    File file = new File(playFile);
//                    int nMusicTime = (int)file.length() / 1024 / 173;//文件播放需要的时间
//                    timerFun(nMusicTime);
//                }
//                else{
//                    System.out.println("没有音乐可以播放");
//                }
//            }
//		/*
//			播放上一首
//		*/
//            if(e.getSource() == buttonPre){
//                if(vt.size()!=0){
//                    //寻找当前播放的位置
//                    int position = vt.lastIndexOf(playFileName);
//                    position = (vt.size()+position-1)%(vt.size());//通过取余获得下一个音乐的位置
//                    System.out.println("当前位置"+position+"当前音乐数量"+vt.size());
//                    System.out.println(vt.get(position));
//                    playFileName=(String)vt.get(position);
//                    playFile = playFileDirectory + playFileName;
//                    musictitle.setText(playFileName);
//                    audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                    audioPlay.play();//播放下一首音乐
//                    File file = new File(playFile);
//                    int nMusicTime = (int)file.length() / 1024 / 173;//文件播放需要的时间
//                    timerFun(nMusicTime);
//                }
//                else{
//                    System.out.println("没有音乐可以播放");
//                }
//            }
//
//		/*
//			设置播放方式
//		*/
//            if(e.getSource()==buttonWay){
//                //0->循环播放 1->顺序播放 2->随机播放
//                if(flagway==0){//循环播放切换到顺序播放
//                    flagway = 1;
//                    System.out.println("顺序播放");
//                    Icon icon = new ImageIcon(".//Imag//unloop.jpg");
//                    buttonWay.setIcon(icon);
//                }
//                else if(flagway == 1){//顺序播放切换到随机播放
//                    flagway = 2;
//                    System.out.println("随机播放");
//                    Icon icon = new ImageIcon(".//Imag//rand.jpg");
//                    buttonWay.setIcon(icon);
//                }
//                else if(flagway == 2){//随机播放切换到循环播放
//                    flagway = 0;
//                    System.out.println("循环播放");
//                    Icon icon = new ImageIcon(".//Imag//loop.jpg");
//                    buttonWay.setIcon(icon);
//                }
//            }
//        }
//
//
//        //鼠标点击触发事件
//        public void  mouseClicked(MouseEvent e){
//            if (e.getClickCount() == 2) {
//			/*
//				点击音乐播放列表两次
//			*/
//                if(e.getSource()==listPlayFile){
//                    int n =vt.size();//播放列表的音乐数
//                    if (n != 0)//如果有音乐
//                    {
//                        if (listPlayFile.getSelectedValue() != null) {//选中了一个音乐
//                            playFileName = listPlayFile.getSelectedValue().toString();
//                            playFile = playFileDirectory + playFileName;//播放文件设为选中的文件
//                        }
//                        else {//未选中则选中第一个
//                            playFileName = listPlayFile.getModel().getElementAt(0).toString();
//                            playFile = playFileDirectory + playFileName;
//                        }
//
//                        audioPlay.SetPlayAudioPath("file:" + playFile);//设置播放路径
//                        audioPlay.play();//播放
//
//                        musictitle.setText(listPlayFile.getSelectedValue().toString());//设置音乐名
//                        Icon icon = new ImageIcon(".//Imag//stop.jpg");//播放按钮转换为暂停
//                        buttonPlay.setIcon(icon);
//                        backgroundPlay.setVisible(true);
//
//                        File file = new File(playFile);
//                        int nMusicTime = (int)file.length() / 1024 / 173;//文件播放需要的时间
//                        timerFun(nMusicTime);
//                    }
//                }
//            }
//        }
//
//        //用不到的接口
//        public void mousePressed(MouseEvent e){}
//        public void mouseReleased(MouseEvent e){}
//        public void mouseEntered(MouseEvent e){}
//        public void  mouseExited(MouseEvent e){}
//
//
//    }
//
//
//
//
//    public class MusicPlay {
//        public static void main(String[] args) {
//            MyExtendsJFrame frame=new MyExtendsJFrame();
//        }
//    }
//
//}
