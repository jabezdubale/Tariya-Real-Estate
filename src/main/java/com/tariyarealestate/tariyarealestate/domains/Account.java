package com.tariyarealestate.tariyarealestate.domains;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    private String fullName;

    private String phone;

    private String email;

    private String DOB;

    private String permission;

    private Integer pin;

}
