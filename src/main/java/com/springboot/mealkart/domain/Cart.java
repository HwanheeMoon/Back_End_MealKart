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
@Table(name = "TB_CART")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Cart {

    @Id
    @Column(name = "CART_UUID")
    private String cartUuid;

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
    public Cart (String userUuid,
                 LocalDateTime createDate,
                 LocalDateTime modifyDate) {
        this.cartUuid = UtilMethod.createUUID();
        this.userUuid = userUuid;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }
}
