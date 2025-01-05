package com.springboot.mealkart.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "TB_PRODUCT_DETAIL")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class ProductDetail {
}
