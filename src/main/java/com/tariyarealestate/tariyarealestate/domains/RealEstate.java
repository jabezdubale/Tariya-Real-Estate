package com.tariyarealestate.tariyarealestate.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RealEstate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @NotNull(message = "Your User ID is required")
    @Column(nullable = false)
    private Long sellerId;

    @NotBlank(message = "Please insert the google location")
    @Column(nullable = false, unique = true)
    private String location;

    @NotBlank(message = "Write the type of Real-Estate?")
    @Column(nullable = false)
    private String houseType;

    @NotNull(message = "What is the price of the Real-Estate")
    @Column(nullable = false)
    private Double price;

    @NotBlank(message = "Specify as much detail about the Real-Estate as possible")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Specify the link containing all Verification Docs")
    @Column(nullable = false)
    private String verificationDocs;

    @NotNull(message = "verification status")
    @Column(nullable = false)
    private Long verificationStatus;

    @NotBlank(message = "Current status of the house")
    @Column(nullable = false)
    private String houseStatus;

}
