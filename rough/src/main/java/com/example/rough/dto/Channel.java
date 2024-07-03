/*************************************************************************
 * ADOBE CONFIDENTIAL ___________________
 * <p/>
 * Copyright 2021 Adobe Systems Incorporated All Rights Reserved.
 * <p/>
 * NOTICE: All information contained herein is, and remains the property of Adobe Systems
 * Incorporated and its suppliers, if any. The intellectual and technical concepts contained herein
 * are proprietary to Adobe Systems Incorporated and its suppliers and are protected by all
 * applicable intellectual property laws, including trade secret and copyright laws. Dissemination
 * of this information or reproduction of this material is strictly forbidden unless prior written
 * permission is obtained from Adobe Systems Incorporated.
 **************************************************************************/

package com.example.rough.dto;

import lombok.ToString;

import java.util.stream.Stream;

@ToString
public enum Channel {
    NOTIFICATION,
    WEB,
    EMAIL,
    SMS;

    public static Channel lookupChannel(String channel) throws Exception {
        return Stream.of(Channel.values())
                .filter(value -> channel.equalsIgnoreCase(value.name()))
                .findFirst()
                .orElseThrow(() -> new Exception("No matching channel found"));
    }
}
