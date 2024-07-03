package com.example.rough.service;

import com.example.rough.dto.EmailXmlContent;
import com.example.rough.dto.Template;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-25T16:41:21+0530",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class XMLMapperImpl extends XMLMapper {

    @Override
    Template mapTranslationInfoToTemplate(EmailXmlContent content) {
        if ( content == null ) {
            return null;
        }

        Template template = new Template();

        template.setContentMetadata( emailXmlContentToContentMetadata( content ) );
        template.setRecipients( emailXmlContentToRecipients( content ) );
        template.setSubject( emailXmlContentToSubject( content ) );

        template.setBody( mapToBody(content) );

        return template;
    }

    @Override
    Template.Body mapToBody(EmailXmlContent content) {
        if ( content == null ) {
            return null;
        }

        Template.Body body = new Template.Body();

        body.setPart( xmlBodyParts(content) );

        return body;
    }

    protected Template.ContentMetadata emailXmlContentToContentMetadata(EmailXmlContent emailXmlContent) {
        if ( emailXmlContent == null ) {
            return null;
        }

        Template.ContentMetadata contentMetadata = new Template.ContentMetadata();

        contentMetadata.setTemplateName( emailXmlContent.getTemplateName() );
        contentMetadata.setLocale( emailXmlContent.getSourceLocale() );

        contentMetadata.setCharset( com.example.rough.dto.Constants.CHAR_SET );
        contentMetadata.setType( com.example.rough.dto.Constants.CONTENT_METADATA_TYPE );

        return contentMetadata;
    }

    protected Template.Recipients emailXmlContentToRecipients(EmailXmlContent emailXmlContent) {
        if ( emailXmlContent == null ) {
            return null;
        }

        Template.Recipients recipients = new Template.Recipients();

        recipients.setFrom( emailXmlContent.getFrom() );
        recipients.setReplyTo( emailXmlContent.getReplyTo() );
        recipients.setFailTo( emailXmlContent.getFailTo() );

        return recipients;
    }

    protected Template.LocalizableWithText emailXmlContentToLocalizableWithText(EmailXmlContent emailXmlContent) {
        if ( emailXmlContent == null ) {
            return null;
        }

        Template.LocalizableWithText localizableWithText = new Template.LocalizableWithText();

        localizableWithText.setTextContent( emailXmlContent.getSubject() );

        return localizableWithText;
    }

    protected Template.Subject emailXmlContentToSubject(EmailXmlContent emailXmlContent) {
        if ( emailXmlContent == null ) {
            return null;
        }

        Template.Subject subject = new Template.Subject();

        subject.setLocalizable( emailXmlContentToLocalizableWithText( emailXmlContent ) );

        return subject;
    }
}
