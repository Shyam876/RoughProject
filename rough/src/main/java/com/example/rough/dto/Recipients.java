package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class Recipients{

    @JacksonXmlProperty(localName = "from")
    private From from;

    @JacksonXmlProperty(localName = "replyTo")
    private ReplyTo replyTo;

    @JacksonXmlProperty(localName = "failTo")
    private FailTo failTo;

}

