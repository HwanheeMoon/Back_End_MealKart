package com.springboot.mealkart.enumerate;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserRole {

    USER_ADMIN("관리자"),
    USER_SELLER("판매자"),
    USER_CUSTOMER("구매자");

    private String userRole;
}
