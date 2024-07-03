package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class ContentMetadata{

    @JacksonXmlProperty(localName = "type")
    private Type type;

    @JacksonXmlProperty(localName = "charSet")
    private Charset charSet;

    @JacksonXmlProperty(localName = "templateName")
    private TemplateName templateName;

    @JacksonXmlProperty(localName = "locale")
    private Locale locale;

}

