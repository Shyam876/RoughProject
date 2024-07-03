package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

@Data
public class SendPriority{
    @JacksonXmlText
    private String sendPriority;
}
