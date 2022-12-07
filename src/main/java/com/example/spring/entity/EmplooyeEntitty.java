package com.example.spring.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@Getter
@Setter

@Table(name = "Emplooyes")
public class EmplooyeEntitty {
    public EmplooyeEntitty(String name ,String surname, String gender,Date dateOFbirth,String adress){
        this.name= name;
        this.surname =surname;
        this.gender = gender;
        this.dateofbirth = dateOFbirth;
        this.adress = adress;
    }
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int  id;
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    @Column(name = "gender")
    private String gender;
    @Column(name = "dateofbirth")
    private Date dateofbirth;
    @Column(name = "adress")
    private String adress;



}
