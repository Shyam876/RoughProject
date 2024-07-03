package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

@Data
public class Content{
    @JacksonXmlProperty(localName = "localizable")
    private Localizable localizable;
}
