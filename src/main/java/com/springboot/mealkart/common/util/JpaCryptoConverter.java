package com.springboot.mealkart.common.util;

import jakarta.persistence.AttributeConverter;
import org.springframework.util.StringUtils;
// TODO 나중에 EncryptService 구현 필요
public class JpaCryptoConverter /*implements AttributeConverter<String, String> */{
    
    /*private final EncryptService encryptService;

    @Override
    public String convertToDatabaseColumn(String attribute) {
        return StringUtils.hasText(attribute) ? encryptService.encStr(attribute):attribute;
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return StringUtils.hasText(dbData) ? encryptService.decStr(dbData):dbData;
    }*/

}
