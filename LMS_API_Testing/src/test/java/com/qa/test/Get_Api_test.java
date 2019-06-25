package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.Rest_Client;

public class Get_Api_test extends TestBase {

	TestBase testbase;
	String serviceurl;
	String apiurl;
	String url ;
	Rest_Client rest_Client;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	
	public void setUp() throws ClientProtocolException, IOException {
		testbase = new TestBase();
		 serviceurl = prop.getProperty("URL");
		 apiurl = prop.getProperty("serviceURL");
		 url = serviceurl+apiurl; 
		
	}
	
	@Test(priority=1)
	public void getAPITest() throws ClientProtocolException, IOException {
		
		rest_Client = new Rest_Client();
		closeableHttpResponse =rest_Client.get(url);
		
		//To get & print the status code
			int statusCode=closeableHttpResponse.getStatusLine().getStatusCode();
			System.out.println("Status Code--->" + statusCode);
			
			
			Assert.assertEquals(statusCode,RESPONSE_STATUS_CODE_200, "Status code is not 200");
			
			
			
			//To get complete entire string
			String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
			
			//To convert the complete string to JSON
//			JSONObject responseJson =  new JSONObject(responseString);
			JSONArray responseJson =  new JSONArray(responseString);
			 
			System.out.println("Response JSON from API--->" +responseJson);
			
		    //To get all Header values
			Header[] headersArray = closeableHttpResponse.getAllHeaders();
			HashMap<String,String> allHeaders = new HashMap<String,String>();
			
			for(Header header :headersArray) {
				allHeaders.put(header.getName(),header.getValue());
			}
			System.out.println("Headers Array---->" +allHeaders);
		} 
	}

