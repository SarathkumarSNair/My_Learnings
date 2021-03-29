import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

//invoke static methods enter manually
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.security.Provider;


import org.springframework.core.NestedCheckedException;

import File.Payload;
import groovyjarjarantlr4.v4.parse.GrammarTreeVisitor.tokenSpec_return;

public class Apitest {

	public static void main(String[] args) {
		// TO DO Auto-generated method stub
         //given - all input details
		 //when - submit the API (resource name = present in url , http method POST,GET etc)
		 //then - validate the response
		//begins with rest assured base URL
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body(Payload.AddPlace())
		.when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope", equalTo ("APP"))
		.header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		//assertthat is used to capture the assertion given
		//inorder to see how API got generated what is the input and response can be logged using the method
		//log().all()
		// in order to extract the data use extract().response().asstring - remove log from "then" and capture it using 
		// system.out.println()
		System.out.println(response);
		// parsing json
				JsonPath js=new JsonPath(response); 
				String placeid=js.getString("place_id");
				System.out.println(placeid);
				
			//PUT method - update place
				String newaddress = "ABC ching chang";
				given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body("{\r\n" + 
						"\"place_id\":\""+placeid+"\",\r\n" + 
						"\"address\":\""+newaddress+"\",\r\n" + 
						"\"key\":\"qaclick123\"\r\n" + 
						"}")
				.when().put("maps/api/place/update/json")
				.then().assertThat().log().all().statusCode(200)
				.body("msg", equalTo("Address successfully updated"));
				
				// GET method - not sending body and no need header
			String getresponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeid)
				.when().get("maps/api/place/update/json")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();
				
			// parsing json
				JsonPath js12=new JsonPath(getresponse);
				String actualaddress=js12.getString("address");
				System.out.println(actualaddress);
				
				//RestAssured will Provider assertion in java we nees junit , Testng
			}

		}

		