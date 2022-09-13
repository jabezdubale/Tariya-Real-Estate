package com.tariyarealestate.tariyarealestate.domains;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String fullName;

    @NotBlank(message = "Phone number is required")
    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @NotBlank(message = "Date of Birth is required")
    @Column(nullable = false)
    private String dob;

    @NotBlank(message = "Are you a Buyer or Seller?")
    @Column(nullable = false)
    private String permission;

    @NotNull(message = "Pin is required")
    @Column(nullable = false)
    private Integer pin;

}
