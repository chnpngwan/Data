package youget;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import youget.allProperty.douyins;
import youget.allProperty.putong;

public class WebGet {

	public static String getrealurl(String str)
    {
	    HttpURLConnection httpURLConnection;
	    HttpsURLConnection conn;
        try {
            URL url = new URL(str);
            trustAllHosts();
            if (url.getProtocol().toLowerCase().equals("https")) {

                conn=(HttpsURLConnection)url.openConnection();
                conn.setHostnameVerifier(DO_NOT_VERIFY);
                httpURLConnection=conn;
            }//不验证主机证书
            else
            	httpURLConnection=(HttpURLConnection)url.openConnection();
            douyins d=new allProperty().new douyins();
            d.setProperty(httpURLConnection);
            String urls=httpURLConnection.getHeaderField("location");
            System.out.println("跳转至："+urls);
            httpURLConnection.disconnect();
            return urls;
        } catch (MalformedURLException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }
	public static void search(String name,List<PT> outs)
	{
		String html="https://www.hifini.com/search-";
		String t=null;
		try {
			t = URLEncoder.encode(name, "utf-8");
			t=t.replace('%', '_');
			html+=t;
			t=null;
			html+=".htm";
		} catch (UnsupportedEncodingException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		putong d=new allProperty().new putong();
		t=get_https(html, d, 200, false, false);
		List<String> all=findall(t,"<a href=\"thread-","</a>");
		t=null;
		for(String i:all)
		{
			String h[]=i.split(".htm\">");
			h[1]=h[1].replaceAll("<span class=\"text-danger\">", "");
			h[1]=h[1].replaceAll("</span>", "");
			PT ts=new PT(h[1],"https://www.hifini.com/thread-"+h[0]+".htm");
			outs.add(ts);
		}
	}
	public static List<String> findall(String code,String starts,String ends)
    {
        List<String> temp=new ArrayList<String>();
        int start=0;
        int end=0;
        while(true)
        {
            start=code.indexOf(starts,end);
            if(start==-1)
                break;
            start+=starts.length();
            end=code.indexOf(ends,start);
            temp.add(code.substring(start,end));
            end+=ends.length();
        }
        return temp;
    }
	private static String path="F:\\desktop\\1.m4a";
	public static void you_get(String url,String filepath)
	{
		String urls=getmusicurl(url);
//		System.out.print(urls);
//		if(true)
//		return;
		download(urls, filepath);
	}
	public static String getmusicurl(String url)
	{
		putong d=new allProperty().new putong();
		String html=get_https(url,d,200,true,false);
		d=null;
		int start=html.indexOf("url: \'")+6;
		int end=html.indexOf("\'", start);
		String h=html.substring(start, end);
		html=null;
		//System.out.println(h);
		if(h.charAt(0)=='h')
		{
			try {
				String k[]=h.split("music/");
				k[0]+="music/";
				h=URLEncoder.encode(k[1], "utf-8");
				//h=h.replaceAll("+", "%20");
				h=k[0]+h;
				k=null;
				h=h.replace("+", "%20");
			} catch (UnsupportedEncodingException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			return h;
		}
		else
			return "https://www.hifini.com/"+h;
	}
	public static void download(String url,String filepath)
	{
		if(filepath!=null)
		path=filepath;
		douyins d=new allProperty().new douyins();
		WebGet.get_https(url,d,200,false,true);
		d=null;
	}
	public static String get_https(String urls,Property pro,int tag,boolean flag,boolean download)
	{

	    HttpURLConnection https;
	    HttpsURLConnection httpssl;
		try {
			URL url = new URL(urls);
			trustAllHosts();//信任所有的主机
			if (url.getProtocol().toLowerCase().equals("https")) {
				httpssl=(HttpsURLConnection) url.openConnection();
				httpssl.setHostnameVerifier(DO_NOT_VERIFY);//不验证主机证书
				https=httpssl;
			}
			else
				https=(HttpURLConnection) url.openConnection();
			https.setRequestMethod("GET");
			pro.setProperty(https);
			https.setConnectTimeout(2000);
			int ttts=https.getResponseCode();
			if(ttts==302)
			{
				return get_https(getrealurl(urls), pro, tag, flag, download);
			}
			else if(ttts!=404&&ttts!=502)
			{
				InputStream IS=https.getInputStream();
				byte[] bt=new byte[1024];
				int len=0;
				FileOutputStream ttt = null;
				if(download)
				{
					System.out.println("开始下载："+urls);
				ttt=new FileOutputStream(path);
				}
				ByteArrayOutputStream BS=new ByteArrayOutputStream();
				int all=0;
				while((len=IS.read(bt))!=-1)
				{
					if(flag)
					{
					if(all>6144)
					{
					BS.write(bt, 0, len);
					}
					all+=len;
					if(all>8192)
						break;
					}
					else
					{
						BS.write(bt, 0, len);
					}

					if(download)
						ttt.write(bt,0,len);
				}
				IS.close();

				if(download)
				{
					ttt.close();
					return null;
				}
				String h=new String(BS.toByteArray(),"UTF-8");
				BS.close();
				BS=null;
				return h;
			}
			else
			{
				System.out.println("error:"+urls);
				throw new Exception("连接服务器失败！");
			}
			
			
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			System.out.println(path);
			e.printStackTrace();
		} 
		return null;
	}
	public static void trustAllHosts() {
	    final String TAG = "trustAllHosts";
	    // 閸掓稑缂撴穱鈥叉崲缁狅紕鎮婇崳锟?
	    TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
	 
	        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
	            return new java.security.cert.X509Certificate[]{};
	        }
	 
	        public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	            //System.out.println(TAG+"checkClientTrusted");
	        }
	 
	        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
	            //System.out.println(TAG+"checkServerTrusted");
	        }
	    }};
	 
	    // Install the all-trusting trust manager
	    try {
	        SSLContext sc = SSLContext.getInstance("TLS");
	        sc.init(null, trustAllCerts, new java.security.SecureRandom());
	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	    } catch (Exception e) {
	        //e.printStackTrace();
	    }
	}
	final static HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
		 
	    public boolean verify(String hostname, SSLSession session) {
	        return true;
	    }	
	};
}



