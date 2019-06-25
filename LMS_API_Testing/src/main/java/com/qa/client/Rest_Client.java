package com.qa.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class Rest_Client {
	
	//1.GET Method
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpGet httpget = new HttpGet(url);// http get request
		CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget);//hit the GET URL
		
		return closeableHttpResponse;
	}



//2. POST Method

       public CloseableHttpResponse post(String url,String entityString,HashMap<String,String>headerMap) throws ClientProtocolException, IOException
{
	
    	   CloseableHttpClient httpClient=HttpClients.createDefault();
    	   HttpPost httppost = new HttpPost(url);//Http POST request
    	   httppost.setEntity(new StringEntity(entityString));//for payload
    	   
    	   //for headers:
    	   for(Map.Entry<String,String> entry:headerMap.entrySet()) {
    		   httppost.addHeader(entry.getKey(),entry.getValue());
    	   }
    	   
    	  
    	   CloseableHttpResponse closeableHttpResponse = httpClient.execute(httppost);
    	   return closeableHttpResponse;
    	   
}
}
