package APIs;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import helpers.Common;
import helpers.ConfigReader;

public class CreateOrder{
	public static String token, Admintoken, CustomerToken;
	public static RequestSpecification httpRequest;
	public static Response response;
	public static JsonPath jsonPathEvaluator;
	public static int StatusCode;
	public static List<String> Headerkey=new ArrayList<String>();
	public static List<String> Headervalue=new ArrayList<String>();
	public static Headers headers;
 
	
	public static int createOrder() {
		String bearer = "Bearer " + ConfigReader.getValue("BearerKey");
		
		Headerkey.add(ConfigReader.getValue("HeaderKey1"));
		Headerkey.add(ConfigReader.getValue("HeaderKey2"));
		Headerkey.add(ConfigReader.getValue("HeaderKey3"));
		
		Headervalue.add(ConfigReader.getValue("HeaderValue1"));
		Headervalue.add(bearer);
		Headervalue.add(ConfigReader.getValue("HeaderValue3"));
		
		headers=Common.createRequestHeader(Headerkey, Headervalue);
		/*Header h1 = new Header("API-Key", "ytxa9ppawphwyzraxqrn3uxg");
		Header h2 = new Header("Authorization", bearer);
		Header h3 = new Header("Content-Type", "application/json");
		List<Header> list = new ArrayList<Header>();
		list.add(h1);
		list.add(h2);
		list.add(h3);
		Headers header = new Headers(list);*/
		RestAssured.baseURI = ConfigReader.getValue("CreateOrderUrl");
		// LoggerHelper.log("Generate Token URL:" + RestAssured.baseURI);
		httpRequest = RestAssured.given();
		httpRequest.headers(headers);
		File file = new File("src\\test\\resources\\JsonFiles\\CustomJSONObject.json");
		//File file = new File(filePath);
		httpRequest.body(file);
		response = httpRequest.request(Method.POST);
		String AdminresponseBody = response.getBody().asString();
		System.out.println(AdminresponseBody);
		JsonPath js = response.jsonPath();
		int StatusCode = response.getStatusCode();
		System.out.println(StatusCode);
	    int orderId=js.get("orderID");
	    System.out.println("order id is"+orderId);
	    return orderId;

	}
}
