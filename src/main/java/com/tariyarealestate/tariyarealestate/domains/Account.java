package com.tariyarealestate.tariyarealestate.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @NotBlank(message = "Name is required")
    @Column(nullable = false)
    private String fullName;

    private String profilePicture = "https://images.pexels.com/photos/220453/pexels-photo-220453.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";

    @NotBlank(message = "Phone number is required")
    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Date of Birth is required")
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dob;

    @NotBlank(message = "Are you a Buyer or Seller?")
    @Column(nullable = false)
    private String permission;

    @NotBlank(message = "Pin is required")
    @Column(nullable = false)
    private String pin;

}
