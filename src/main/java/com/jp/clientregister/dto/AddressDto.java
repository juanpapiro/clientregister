package com.jp.clientregister.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private Long id;
    private String zipcode;
    private String street;
    private String neighborhood;
    private String city;
    private String uf;
    private Integer number;

}
