package com.example.rough.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailXmlContent {

    private String sourceLocale;

    private String from;

    private String replyTo;

    private String failTo;

    private String subject;

    private String textContent;

    private String htmlContent;

    private String templateName;

}
