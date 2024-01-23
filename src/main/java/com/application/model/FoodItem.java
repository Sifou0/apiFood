package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FoodItem {
    private String product_name;
    private String allergens;
    private String code;
    private String image_url;
    private int nova_group;
    private Nutriscore nutriscore;
    private Nutriments nutriments;

}
