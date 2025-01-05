package com.springboot.mealkart.domain;

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
@Table(name = "TB_SELLER")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Seller {

    @Id
    @Column(name = "SELLER_UUID")
    private String sellerUuid;

    @Column(name = "BRAND_NAME")
    private String brandName;

    @Column(name = "SELLER_NUMBER")
    private String sellerNumber;

    @Column(name = "DELIVERY_FEE")
    private Integer deliveryFee;

    @Column(name = "USER_UUID")
    private String userUuid;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public Seller (Integer deliveryFee,
                   String brandName,
                   String sellerNumber,
                   String userUuid,
                   LocalDateTime createDate,
                   LocalDateTime modifyDate){
        this.sellerUuid = UtilMethod.createUUID();
        this.sellerNumber = sellerNumber;
        this.brandName = brandName;
        this.deliveryFee = deliveryFee;
        this.userUuid = userUuid;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }
}
