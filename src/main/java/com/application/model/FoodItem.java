package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FoodItem {
    private String productName;
    private String allergens;
    private String code;
    private String imageUrl;
    private int novaGroup;
    private Nutriscore nutriscoreData;
    private Nutriments nutriments;

}
