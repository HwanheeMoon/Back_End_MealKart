package com.springboot.mealkart.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SocialType {

    TYPE_GOOGLE("구글"),
    TYPE_NAVER("네이버"),
    TYPE_KAKAO("카카오");

    private String socialType;

}
