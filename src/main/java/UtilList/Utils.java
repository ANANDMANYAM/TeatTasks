package UtilList;

import StepDefinitions.Documentation;
import io.restassured.RestAssured;

public class Utils{		
		
		public int httpResponseCodeViaGet(String url) {
			return RestAssured.get(url).statusCode();
		}
		public int httpResponseCodeViaPost(String url) {
			return RestAssured.get(url).statusCode();
		}
public static void main(String[] args) {

	new Utils().httpResponseCodeViaGet("");

}

}
