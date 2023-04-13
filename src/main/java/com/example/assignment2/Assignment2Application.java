package com.example.assignment2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {

	public static void main(String[] args) throws Exception{

		String url = "https://api.zippopotam.us/us/33162";

		// Building a request
		HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

		//getting the http client
		HttpClient httpClient = HttpClient.newBuilder().build();

		HttpResponse httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());


		JSONObject masterData = new JSONObject(httpResponse.body().toString());

			System.out.println("post code => " + masterData.get("post code"));
			System.out.println("country => " + masterData.get("country"));


		JSONArray placesArray = masterData.getJSONArray("places");
		JSONObject firstPlaceObj = placesArray.getJSONObject(0);

		System.out.println("Place Name => " + firstPlaceObj.get("place name"));
		System.out.println("Longitude => " + firstPlaceObj.get("longitude"));
		System.out.println("Latitude => " + firstPlaceObj.get("latitude"));
		System.out.println("State => " + firstPlaceObj.get("state"));
	}

}
