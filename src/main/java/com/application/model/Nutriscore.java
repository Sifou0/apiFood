package com.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Nutriscore {
    public int energy;
    public int energy_points;
    public int energy_value;
    public int fiber;
    public int fiber_points;
    public int fiber_value;
    public double fruits_vegetables_nuts_colza_walnut_olive_oils;
    public int fruits_vegetables_nuts_colza_walnut_olive_oils_points;
    public double fruits_vegetables_nuts_colza_walnut_olive_oils_value;
    public String grade;
    public int is_beverage;
    public int is_cheese;
    public int is_fat;
    public int is_water;
    public int negative_points;
    public int positive_points;
    public double proteins;
    public int proteins_points;
    public double proteins_value;
    public double saturated_fat;
    public int saturated_fat_points;
    public double saturated_fat_value;
    public int score;
    public int sodium;
    public int sodium_points;
    public int sodium_value;
    public double sugars;
    public int sugars_points;
    public double sugars_value;
}
