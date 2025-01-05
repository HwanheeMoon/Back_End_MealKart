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
import org.springframework.data.relational.core.sql.In;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_ORDERING_DETAIL")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderingDetail {

    @Id
    @Column(name = "ORDER_DEATAIL_UUID")
    private String orderDetailUuid;

    @Column(name = "ORDER_UUID")
    private String orderUuid;

    @Column(name = "PRODUCT_UUID")
    private String productUuid;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "DELIVERY_CD")
    private String deliveryCd;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public OrderingDetail (String orderUuid,
                           String productUuid,
                           Integer price,
                           Integer quantity,
                           String deliveryCd,
                           LocalDateTime createDate,
                           LocalDateTime modifyDate) {
        this.orderDetailUuid = UtilMethod.createUUID();
        this.orderUuid = orderUuid;
        this.productUuid = productUuid;
        this.price = price;
        this.quantity = quantity;
        this.deliveryCd = deliveryCd;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.useYn = "Y";
    }
}
