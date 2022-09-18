package com.tariyarealestate.tariyarealestate.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RealEstateEditor {

    private Long editorRsId;
    private Long editorRsSellerId;
    private String editorRsLocation;
    private String editorRsHouseType;
    private Double editorRsPrice;
    private String editorRsDescription;
    private String editorRsVerificationDocs;
    private Long editorRsVerificationStatus;
    private String editorRsHouseStatus;
}