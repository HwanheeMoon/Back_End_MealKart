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
import org.hibernate.ScrollableResults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_REFUND")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Refund {

    @Id
    @Column(name = "REFUND_UUID")
    private String refundUuid;

    @Column(name = "ORDERING_UUID")
    private String orderingUuid;

    @Column(name = "PAYMENT_UUID")
    private String paymentUuid;

    @Column(name = "REASON")
    private String reason;

    // 취소(001) , 반품(002)
    @Column(name = "REFUND_CD")
    private String refundCd;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public Refund (String reason,
                   String refundCd,
                   String orderingUuid,
                   String paymentUuid,
                   LocalDateTime createDate,
                   LocalDateTime modifyDate) {
        this.refundUuid = UtilMethod.createUUID();
        this.reason = reason;
        this.refundCd = refundCd;
        this.orderingUuid = orderingUuid;
        this.paymentUuid = paymentUuid;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }

}
