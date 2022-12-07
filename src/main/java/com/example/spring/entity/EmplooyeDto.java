package com.example.spring.entity;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmplooyeDto {
    private String name;
    private String surName;
    private String gender;
    private Date dateOfBirth;
    private String adress;


}
