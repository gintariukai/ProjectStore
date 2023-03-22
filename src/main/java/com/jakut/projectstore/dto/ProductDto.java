package com.jakut.projectstore.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //duomenis kurie sukurs tendencija
@Builder //igalins dizaino modeli product
@AllArgsConstructor //kurs konstruktorius
@NoArgsConstructor
public class ProductDto {

    private String title;

}
