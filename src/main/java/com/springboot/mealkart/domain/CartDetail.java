package com.springboot.mealkart.domain;

import com.springboot.mealkart.common.domain.BaseDomain;
import com.springboot.mealkart.common.util.UtilMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Persistable;
import org.springframework.util.StringUtils;

@Entity
@Table(name = "TB_CART_DETAIL")
@Getter
@IdClass(CartDetailPK.class)
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class CartDetail extends BaseDomain implements Persistable<CartDetailPK> {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CART_UUID")
    private Cart cartUuid;

    @Id
    @Column(name = "CART_DETAIL_UUID")
    private String cartDetailUuid;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_UUID")
    private Product productUuid;

    // 수량
    @Column(name = "COUNT")
    private Integer count;

    @Column(name = "USE_YN", columnDefinition = "CHAR(1)")
    private String useYn;

    @PrePersist
    public void prePersist() {
        this.useYn = StringUtils.isEmpty(this.useYn) ? "Y" : this.useYn;
    }

    @PreUpdate
    public void PreUpdate() {
        this.useYn = StringUtils.isEmpty(this.useYn) ? "Y" : this.useYn;
    }

    @Builder
    public CartDetail (Cart cartUuid,
                       Product productUuid,
                       Integer count) {
        this.cartDetailUuid = UtilMethod.createUUID();
        this.cartUuid = cartUuid;
        this.productUuid = productUuid;
        this.count = count;
    }
    @Override
    public CartDetailPK getId(){
        return CartDetailPK.builder()
                .CartUuid(this.cartUuid.getCartUuid())
                .CartDetailUuid(this.cartDetailUuid)
                .build();

    }
    @Override
    public boolean isNew() {
        return getCreateDate() == null;
    }

}
