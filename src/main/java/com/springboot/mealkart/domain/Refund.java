package com.springboot.mealkart.domain;

import com.springboot.mealkart.common.domain.BaseDomain;
import com.springboot.mealkart.common.util.UtilMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.util.StringUtils;

@Entity
@Table(name = "TB_REFUND")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Refund extends BaseDomain {

    @Id
    @Column(name = "REFUND_UUID")
    private String refundUuid;

    @Column(name = "ORDERING_UUID")
    private String orderingUuid;

    @Column(name = "PAYMENT_UUID")
    private String paymentUuid;

    @Column(name = "REASON")
    private String reason;

    // 판매자 답변 입력
    @Column(name = "ANWSER")
    private String answer;

    // 취소(001) , 반품(002)
    @Column(name = "REFUND_CD")
    private String refundCd;

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
    public Refund (String reason,
                   String answer,
                   String refundCd,
                   String orderingUuid,
                   String paymentUuid) {
        this.refundUuid = UtilMethod.createUUID();
        this.reason = reason;
        this.answer = answer;
        this.refundCd = refundCd;
        this.orderingUuid = orderingUuid;
        this.paymentUuid = paymentUuid;
    }

}
