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
@Table(name = "TB_PAYMENT")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Payment {

    @Id
    @Column(name = "PAYMENT_UUID")
    private String paymentUuid;

    @Column(name = "ORDERING_UUID")
    private String orderingUuid;

    @Column(name = "USER_UUID")
    private String userUuid;

    @Column(name = "PAYMENT_AMT")
    private Integer paymentAmt;

    @Column(name = "PAYMENT_TYPE")
    private String paymentType;

    @Column(name = "REFUND_YN")
    private String refundYn;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public Payment (String orderingUuid,
                    String userUuid,
                    Integer paymentAmt,
                    String paymentType,
                    String refundYn,
                    LocalDateTime createDate,
                    LocalDateTime modifyDate) {
        this.paymentUuid = UtilMethod.createUUID();
        this.orderingUuid = orderingUuid;
        this.userUuid = userUuid;
        this.paymentType = paymentType;
        this.paymentAmt = paymentAmt;
        this.refundYn = refundYn;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }
}
