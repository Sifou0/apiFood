package com.application.service;

import com.application.model.ApiResponse;
import com.google.gson.Gson;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiService {
    private static final String API_URL = "https://world.openfoodfacts.org/api/v0/product/";

    private final HttpClient httpClient;
    private final String barcode;

    public ApiService(String barcode) throws Exception {
        this.httpClient = HttpClient.newHttpClient();
        this.barcode = barcode;
    }

    private JSONObject fetchData() {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL + this.barcode))
                .build();
        return httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(ApiService::parseJson).join();
    }

    private static JSONObject parseJson(String responseBody) {
        return new JSONObject(responseBody);
    }

    public static void main(String[] args) {
        try {
            ApiService apiService = new ApiService("3017624010701");
            System.out.println(apiService.fetchData().get("code"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
