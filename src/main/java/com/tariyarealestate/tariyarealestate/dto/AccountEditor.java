package com.tariyarealestate.tariyarealestate.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Builder
@Data
public class AccountEditor {

    private Long editorID;
    private String editorName;
    private String editorPhone;
    private String editorEmail;
    @Temporal(TemporalType.DATE)
    private Date editorDOB;
    private String editorPermission;
    private String editorPin;


}

