package com.springboot.mealkart.domain;

import com.springboot.mealkart.util.UtilMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_ORDERING")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Ordering {

    @Id
    @Column(name = "ORDER_UUID")
    private String orderUuid;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "RECEIVE_NAME")
    private String receiveName;

    @Column(name = "RECEIVE_ADDRESS")
    private String receiveAdd;

    @Column(name = "RECEIVE_PHONE")
    private String receivePhone;

    @Column(name = "TOTAL_PRICE")
    private BigInteger totalPrice;

    @Column(name = "USER_UUID")
    private String userUuid;

    @Column(name = "ORDERING_CD")
    private String orderingCd;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public Ordering (String message,
                    String receiveName,
                    String receiveAdd,
                    String receivePhone,
                    BigInteger totalPrice,
                    String userUuid,
                    String orderingCd,
                    LocalDateTime createDate,
                    LocalDateTime modifyDate) {
        this.orderUuid = UtilMethod.createUUID();
        this.message = message;
        this.receiveName = receiveName;
        this.receiveAdd = receiveAdd;
        this.receivePhone = receivePhone;
        this.totalPrice = totalPrice;
        this.userUuid = userUuid;
        this.orderingCd = orderingCd;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.useYn = "Y";
    }
}
