package com.springboot.mealkart.util;

import java.util.UUID;
import com.fasterxml.uuid.Generators;


public class UtilMethod {

    /**
     * UUID 생성
     * @return UUID
     */
    public static String createUUID() {

        //sequential uuid 생성
        UUID uuid = Generators.timeBasedGenerator().generate();
        String[] arrUuid = uuid.toString().split("-");
        String strUuid = arrUuid[2] + arrUuid[1] + arrUuid[0] + arrUuid[3] + arrUuid[4];

        StringBuffer sb = new StringBuffer(strUuid);
        sb.insert(8, "-");
        sb.insert(13, "-");
        sb.insert(18, "-");
        sb.insert(23, "-");
        uuid = UUID.fromString(sb.toString());

        return uuid.toString().toLowerCase();
    }

}
