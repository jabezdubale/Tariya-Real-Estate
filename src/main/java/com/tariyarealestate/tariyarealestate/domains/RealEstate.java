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
//database must be updated
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;

    @NotNull(message = "Your User ID is required")
    @Column(nullable = false)
    private Long sellerId;

    @NotBlank(message = "Please insert the google Latitude location")
    @Column(nullable = false)
    private String locationLatitude;

    @NotBlank(message = "Please insert the google Longitude location")
    @Column(nullable = false)
    private String locationLongitude;

    @NotBlank(message = "Write the type of Real-Estate?")
    @Column(nullable = false)
    private String houseType;

    @NotNull(message = "What is the price of the Real-Estate")
    @Column(nullable = false)
    private Double price;

    private String rsPictures = "https://images.pexels.com/photos/1396132/pexels-photo-1396132.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1";

    @NotBlank(message = "Specify as much detail about the Real-Estate as possible")
    @Column(nullable = false)
    private String description;

    @NotBlank(message = "Specify the link containing all Verification Docs")
    @Column(nullable = false)
    private String verificationDocs;

    private Long verificationStatus = 0L;

    private String houseStatus = "Unsold";

}
