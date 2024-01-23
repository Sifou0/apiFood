package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Nutriments{
    public double carbohydrates;
    public double carbohydrates_100g;
    public String carbohydrates_unit;
    public double carbohydrates_value;
    public int energy;
    public int energy_kcal;
    public int energy_kcal_100g;
    public String energy_kcal_unit;
    public int energy_kcal_value;
    public double energy_kcal_value_computed;
    public int energy_100g;
    public String energy_unit;
    public int energy_value;
    public double fat;
    public double fat_100g;
    public String fat_unit;
    public double fat_value;
    public int fruits_vegetables_legumes_estimate_from_ingredients_100g;
    public int fruits_vegetables_legumes_estimate_from_ingredients_serving;
    public double fruits_vegetables_nuts_estimate_from_ingredients_100g;
    public double fruits_vegetables_nuts_estimate_from_ingredients_serving;
    public int nova_group;
    public int nova_group_100g;
    public int nova_group_serving;
    public int nutrition_score_fr;
    public int nutrition_score_fr_100g;
    public double proteins;
    public double proteins_100g;
    public String proteins_unit;
    public double proteins_value;
    public double salt;
    public double salt_100g;
    public String salt_unit;
    public double salt_value;
    public double saturated_fat;
    public double saturated_fat_100g;
    public String saturated_fat_unit;
    public double saturated_fat_value;
    public double sodium;
    public double sodium_100g;
    public String sodium_unit;
    public double sodium_value;
    public double sugars;
    public double sugars_100g;
    public String sugars_unit;
    public double sugars_value;
}