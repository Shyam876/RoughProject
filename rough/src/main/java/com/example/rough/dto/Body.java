package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Body{

    @JacksonXmlProperty(localName = "htmlPart")
    private Part htmlPart;

    @JacksonXmlProperty(localName = "textPart")
    private Part textPart;
}
