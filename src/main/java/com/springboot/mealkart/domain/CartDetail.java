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
@Table(name = "TB_CART_DETAIL")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class CartDetail {
    @Id
    @Column(name = "CART_DETAIL_UUID")
    private String cartDetailUuid;

    @Column(name = "CART_UUID")
    private String cartUuid;

    @Column(name = "PRODUCT_UUID")
    private String productUuid;

    @Column(name = "COUNT")
    private Integer count;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public CartDetail (String cartUuid,
                       String productUuid,
                       Integer count,
                       LocalDateTime createDate,
                       LocalDateTime modifyDate) {
        this.cartDetailUuid = UtilMethod.createUUID();
        this.cartUuid = cartUuid;
        this.productUuid = productUuid;
        this.count = count;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.useYn = "Y";
    }
}
