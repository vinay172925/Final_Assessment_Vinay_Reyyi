package TestCase;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ApiTestCase_Post {
	ResponseSpecification res;
	RequestSpecification req_spec;
	JSONObject api_json;
	String str=" ";
	@BeforeClass
	public void setSpecification() {
		res=RestAssured.expect();
		res.statusLine("HTTP/1.1 200 OK");
		res.contentType(ContentType.JSON);
		
		InputStream datais=null;
		String file="data/api_json.json";
		datais=getClass().getClassLoader().getResourceAsStream(file);
		JSONTokener tokener=new JSONTokener(datais);
		api_json=new JSONObject(tokener);
	}
	
	@Test(priority=1)
	public void loginuser() {
	
		HashMap<String,String>params=new HashMap<String,String>();
		String un=api_json.getJSONObject("valid").getString("UN");
		String pas=api_json.getJSONObject("valid").getString("PW");
		
		
		params.put("username", "un");
		params.put("password","pas");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		System.out.println("Output is :"+resp.body().asPrettyString());
		JSONObject obj=new JSONObject(resp.body().asPrettyString());
		LinkedHashMap<String,Object> payload=resp.body().jsonPath().get("payload");
		System.out.println(payload);
	}
	
	@Test(priority=2)
	public void loginuser_invalid() {
		HashMap<String,String>params=new HashMap<String,String>();
		String ivun=api_json.getJSONObject("invalid").getString("UN");
		String ivpas=api_json.getJSONObject("invalid").getString("PW");
		
		params.put("username", "ivun");
		params.put("password","ivpas");
		RestAssured.baseURI="https://arcadia.pisystindia.com/";
		Response resp=given().when().contentType("application/json").body(params).post("api/login").then().contentType(ContentType.JSON).extract().response();
		
		System.out.println("Output is :"+resp.body().asPrettyString());
		JSONObject obj=new JSONObject(resp.body().asPrettyString());
		LinkedHashMap<String,Object> payload=resp.body().jsonPath().get("payload");
		//JSONArray arr=obj.getJSONArray("payload");
		System.out.println(payload);
		
		}
}