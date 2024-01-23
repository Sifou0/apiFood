package com.application;

import com.application.model.FoodItem;
import com.application.service.ApiService;

public class Main {
    public static void main(String[] args) {
        try {
            ApiService apiService = new ApiService("3017624010701");
            FoodItem item = apiService.getFoodItem();
            System.out.println(item.toString());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}