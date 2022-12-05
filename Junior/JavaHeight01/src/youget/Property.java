package youget;

import java.net.HttpURLConnection;

import javax.net.ssl.HttpsURLConnection;

public interface Property {
	public abstract void setProperty(HttpsURLConnection https);
	public abstract void setProperty(HttpURLConnection https);

}

