package com.qa.test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.base.TestBase;
import com.qa.client.Rest_Client;
import com.qa.data.Users;

import junit.framework.Assert;

public class Post_Api_test  extends TestBase{
	
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
	
	@Test
	public void postAPITest() throws JsonGenerationException, JsonMappingException, IOException {
		
		rest_Client = new Rest_Client();
		HashMap<String,String> headerMap = new HashMap<String,String>();
 		headerMap.put("Content-Type", "application/json");
		
		//jackson api:
 		
		ObjectMapper mapper = new ObjectMapper();
//		Users users = new Users("14","Term-4","qwer","2019-06-21","2019-07-31");
//		Users users = new Users("147","13","Discipline4","sfdg", "Active");
		
//		Users users = new Users("1","12","MindsNXT","Business Unit","Banglore");
		Users users = new Users("1","IR21","Course_Builder","2019-06-24","2019-07-31","MindsNXT");
		
		Users users1 =new Users("1","IR22","Grader","2019-06-24","2019-07-31","MindsNXT");
		Users users11 = new Users("1","IR23","Course_Builder","2019-06-24", "2019-07-31","MindsNXT");
		
		Users users111 = new Users("1","IR24","Course_Builder","2019-06-24","2019-07-31","MindsNXT");
		Users users1111 = new Users("1","IR25","Grader","2019-06-24","2019-07-31","MindsNXT");
		Users users11111 = new Users("1","IR26","Course_Builder","2019-06-24","2019-07-31","MindsNXT");
		
		Users users111111 = new Users("1","IR27","Grader","2019-06-24","2019-07-31","MindsNXT");
		Users users1111111= new Users("1","IR28","Course_Builder","2019-06-24","2019-07-31","MindsNXT");
		Users users11111111= new Users("1","IR29","Grader","2019-06-24", "2019-07-31","MindsNXT");
		
		Users users111111111= new Users("1","IR30","Course_Builder","2019-06-24","2019-07-31","MindsNXT");
		
		
		
		
		//object to json file:
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users.json"), users);
		
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users1.json"),users1);
		
		
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users11.json"),users11);
		
		
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users111.json"),users111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users1111.json"),users1111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users11111.json"),users11111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users111111.json"),users111111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users1111111.json"),users1111111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users11111111.json"),users11111111);
		mapper.writeValue(new File("C:\\Users\\Nxt\\eclipse-workspace\\LMS_API_Testing\\src\\main\\java\\com\\qa\\data\\users111111111.json"),users111111111);
		
		
		//object to json in string
		String usersJsonString = mapper.writeValueAsString(users);
				System.out.println(usersJsonString);
		
		
		
		String usersJsonString1 = mapper.writeValueAsString(users1);
		System.out.println(usersJsonString1);
		
		
		String usersJsonString11 = mapper.writeValueAsString(users11);
		
		System.out.println(usersJsonString11);
		
String usersJsonString111 = mapper.writeValueAsString(users111);
		
		System.out.println(usersJsonString111);
		

         String usersJsonString1111 = mapper.writeValueAsString(users1111);
		
		    System.out.println(usersJsonString1111);
		
		
         String usersJsonString11111 = mapper.writeValueAsString(users11111);
		
		System.out.println(usersJsonString11111);
		
		
		
       String usersJsonString111111 = mapper.writeValueAsString(users111111);
		
		System.out.println(usersJsonString111111);
		
		
String usersJsonString1111111 = mapper.writeValueAsString(users1111111);
		
		System.out.println(usersJsonString1111111);
		
		
		
String usersJsonString11111111 = mapper.writeValueAsString(users11111111);

		
		System.out.println(usersJsonString11111111);
		

String usersJsonString111111111 = mapper.writeValueAsString(users111111111);
		
		System.out.println(usersJsonString111111111);
		
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString, headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString1, headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString11,headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString111,headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString1111,headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString11111,headerMap);
		
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString111111,headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString1111111,headerMap);
		
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString11111111,headerMap);
		
		closeableHttpResponse= rest_Client.post(url, usersJsonString111111111,headerMap);
		
		
		//1.Status code
	    int statusCode= closeableHttpResponse.getStatusLine().getStatusCode();
		Assert.assertEquals(statusCode,testbase.RESPONSE_STATUS_CODE_200);
		
		
		
		//2.JSON string is correct or not
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
		
	    JSONObject responseJson = new JSONObject(responseString);
//		JSONArray responseJson =  new JSONArray(responseString);
		System.out.println("The response from API is:" +responseJson);

	}
	
}
