package com.springboot.mealkart.domain;


import com.springboot.mealkart.enumerate.SocialType;
import com.springboot.mealkart.enumerate.UserRole;
import com.springboot.mealkart.util.UtilMethod;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_USER")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class User {

    @Id
    @Column(name = "USER_UUID")
    private String userUuid;

    @Column(name = "USER_ROLE")
    private UserRole userRole;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "STREET_ADDRESS")
    private String streetAddress;

    @Column(name = "DETAIL_ADDRESS")
    private String detailAddress;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "SOCIAL_TYPE")
    private SocialType socialType;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "REFRESH_TOKEN")
    private String refreshToken;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;


    @Builder
    public User (String name,
                 String zipcode,
                 String streetAddress,
                 String detailAddress,
                 String phoneNumber,
                 String email,
                 String password,
                 String refreshToken,
                 SocialType socialType,
                 UserRole userRole,
                 LocalDateTime createDate,
                 LocalDateTime modifyDate) {
        this.userUuid = UtilMethod.createUUID();
        this.name = name;
        this.zipcode = zipcode;
        this.streetAddress = streetAddress;
        this.detailAddress = detailAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.refreshToken = refreshToken;
        this.socialType = socialType;
        this.userRole = userRole;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }
}
