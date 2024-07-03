package com.example.rough.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import lombok.Data;
import lombok.experimental.Delegate;

@Data
public class XMLTemplate{

    @Delegate
    private Template template = new Template();


    private class Template{

        @JacksonXmlProperty(localName = "content-metadata")
        private ContentMetadata contentMetadata = new ContentMetadata();

        @JacksonXmlProperty(localName = "recepients")
        private Recipients recipients = new Recipients();

        @JacksonXmlProperty(localName = "subject")
        private Subject subject = new Subject();

        @JacksonXmlProperty(localName = "body")
        private Body body = new Body();

        public void setContentMetadata(String type, String charSet, String templateName, String locale){
            this.contentMetadata.charSet.charset = charSet;
            this.contentMetadata.type.type = type;
            this.contentMetadata.templateName.templateName = templateName;
            this.contentMetadata.locale.locale = locale;
        }

        public void setRecipients(String from, String replyTo, String failTo){
            this.recipients.from.from = from;
            this.recipients.replyTo.replyTo = replyTo;
            this.recipients.failTo.failTo = failTo;
        }

        public void setSubject(String subject, String id){
            this.subject.localizable.content = subject;
            this.subject.localizable.id = id;
        }

        public void setBodyHtmlPart(String charSet, String contentType, String localizableId, String localizableContent){
            this.body.htmlPart.charset = charSet;
            this.body.htmlPart.contentType = contentType;
            this.body.htmlPart.content.localizable.id = localizableId;
            this.body.htmlPart.content.localizable.content = localizableContent;
        }

        public void setBodyTextPart(String charSet, String contentType, String localizableId, String localizableContent){
            this.body.textPart.charset = charSet;
            this.body.textPart.contentType = contentType;
            this.body.textPart.content.localizable.id = localizableId;
            this.body.textPart.content.localizable.content = localizableContent;
        }

        /*@JacksonXmlProperty(localName = "sendPriority")
        private SendPriority sendPriority;*/

    }


    private class ContentMetadata{

        @JacksonXmlProperty(localName = "type")
        private Type type = new Type();

        @JacksonXmlProperty(localName = "charSet")
        private Charset charSet = new Charset();

        @JacksonXmlProperty(localName = "templateName")
        private TemplateName templateName = new TemplateName();

        @JacksonXmlProperty(localName = "locale")
        private Locale locale = new Locale();

        private class Charset {
            @JacksonXmlText
            private String charset = "UTF-8";
        }

        private class Type {
            @JacksonXmlText
            private String type;
        }

        private class TemplateName {
            @JacksonXmlText
            private String templateName;
        }

        private class Locale {
            @JacksonXmlText
            private String locale;
        }

    }

    private class Recipients{

        @JacksonXmlProperty(localName = "from")
        private From from = new From();

        @JacksonXmlProperty(localName = "replyTo")
        private ReplyTo replyTo = new ReplyTo();

        @JacksonXmlProperty(localName = "failTo")
        private FailTo failTo = new FailTo();

        private class From {
            @JacksonXmlText
            private String from;
        }

        public class ReplyTo {
            @JacksonXmlText
            private String replyTo;
        }

        public class FailTo {
            @JacksonXmlText
            private String failTo;
        }

    }

    private class Subject{

        @JacksonXmlProperty(localName = "localizable")
        private Localizable localizable = new Localizable();

    }

    private class Localizable{

        @JacksonXmlProperty(isAttribute = true)
        private String id;

        @JacksonXmlText
        private String content;

    }

    private class Body{

        @JacksonXmlProperty(localName = "htmlPart")
        private Part htmlPart = new Part();

        @JacksonXmlProperty(localName = "textPart")
        private Part textPart = new Part();
    }

    private class Part{

        @JacksonXmlProperty(isAttribute = true)
        private String charset;

        @JacksonXmlProperty(isAttribute = true)
        private String contentType;

        @JacksonXmlProperty(localName = "content")
        private Content content = new Content();

    }

    private class Content{
        @JacksonXmlProperty(localName = "localizable")
        private Localizable localizable = new Localizable();
    }

}



