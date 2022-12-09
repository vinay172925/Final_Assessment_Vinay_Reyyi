package TestCase;

import static io.restassured.RestAssured.given;

import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ApiTestCase_Get {
	ResponseSpecification res;
	RequestSpecification req_spec;
	String str=" ";
	
	@BeforeClass
	public void setSpecification() {
		res=RestAssured.expect();
		res.statusLine("HTTP/1.1 200 OK");
		res.contentType(ContentType.JSON);
		
	}
	@Test(priority=1)
	public void getBanners_valid(){
		
		RestAssured.baseURI="http://arcadia.pisystindia.com/";
		
		Response resp=given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
		System.out.println("Banner output:"+resp.body().asPrettyString());
		
		JSONObject obj=new JSONObject(resp.body().asPrettyString());
		
		JSONArray arr=obj.getJSONArray("payload");
}
	
	@Test(priority=2)
	public void getBanners_invalid(){
		
		RestAssured.baseURI="http://arcadia.pisystindia.in";
		
		Response resp=given().header("Authorization",str).when().get("api/getBanner").then().contentType(ContentType.JSON).extract().response();
		System.out.println("Banner output:"+resp.body().asPrettyString());
		
		JSONObject obj=new JSONObject(resp.body().asPrettyString());
		
		JSONArray arr=obj.getJSONArray("payload");
}
}
