package com.example.assignment3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;

@SpringBootApplication
public class Assignment3Application {

		public static void main(String[] args) throws Exception{

			String url = "https://api.nationalize.io/?name=nathaniel";
	
			// Building a request
			HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
	
			//getting the http client
			HttpClient httpClient = HttpClient.newBuilder().build();
	
			HttpResponse httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
	

			JSONObject jsonObject = new JSONObject(httpResponse.body().toString());
            JSONArray countryArray = jsonObject.getJSONArray("country");

			for(int i=0;i<countryArray.length();i++){
				JSONObject countryObj = countryArray.getJSONObject(i);
				System.out.println("Country id =>" + countryObj.get("country_id"));
				System.out.println("Probability =>" + countryObj.get("probability"));
			}

	}

}
