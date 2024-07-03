package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class Localizable{

    @JacksonXmlProperty(isAttribute = true)
    private String id;

    @JacksonXmlText
    private String subject;

}
