package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Part{

    @JacksonXmlProperty(isAttribute = true)
    private String charset;

    @JacksonXmlProperty(isAttribute = true)
    private String contentType;

    @JacksonXmlProperty(localName = "content")
    private Content content;
}
