package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlCData;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Template {

    @JacksonXmlProperty(localName = "content-metadata")
    private ContentMetadata contentMetadata = new ContentMetadata();

    @JacksonXmlProperty(localName = "recepients")
    private Recipients recipients = new Recipients();

    @JacksonXmlProperty(localName = "subject")
    private Subject subject = new Subject();

    @JacksonXmlProperty(localName = "body")
    private Body body = new Body();

    @Data
    public static class ContentMetadata {

        @JacksonXmlProperty(localName = "type")
        private String type;

        @JacksonXmlProperty(localName = "charset")
        private String charset;

        @JacksonXmlProperty(localName = "templateName")
        private String templateName;

        @JacksonXmlProperty(localName = "locale")
        private String locale;

    }

    @Data
    public static class Recipients {

        @JacksonXmlProperty(localName = "from")
        private String from;

        @JacksonXmlProperty(localName = "replyTo")
        private String replyTo;

        @JacksonXmlProperty(localName = "failTo")
        private String failTo;

    }

    @Data
    public static class Subject {

        @JacksonXmlProperty(localName = "localizable")
        private LocalizableWithText localizable = new LocalizableWithText();

    }

    @Data
    public static class LocalizableWithText {

        @JacksonXmlProperty(isAttribute = true)
        private String id;

        @JacksonXmlText
        private String textContent;

    }

    @Data
    private class LocalizableWithCData {

        @JacksonXmlProperty(isAttribute = true)
        private String id;

        @JacksonXmlText
        @JacksonXmlCData
        private String cdataContent;

    }

    @Data
    public static class Body {

        @JacksonXmlElementWrapper(useWrapping = false)
        private List<Part> part = new ArrayList<>();

    }

    @Data
    public class Part {

        @JacksonXmlProperty(isAttribute = true)
        private String charset;

        @JacksonXmlProperty(isAttribute = true)
        private String contentType;

        @JacksonXmlProperty(localName = "content")
        private Content content = new Content();

        public void setContent(String id, String localizableData) {
            this.content.localizable.id = id;
            this.content.localizable.cdataContent = localizableData;
        }

    }

    @Data
    public class Content {
        @JacksonXmlProperty(localName = "localizable")
        private LocalizableWithCData localizable = new LocalizableWithCData();
    }
}
