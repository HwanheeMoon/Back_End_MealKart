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
@Table(name = "TB_CUSTOMER_MANAGE")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class CustomerManage {

    @Id
    @Column(name = "CUSTOMER_MANAGE_UUID")
    private String customerManageUuid;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "ATTACHMENT")
    private String attachment;

    // 셀러가 답변하는곳
    @Column(name = "ANWSER")
    private String answer;

    @Column(name = "PRODUCT_UUID")
    private String productUuid;

    // 접수(0), 처리중(1), 완료(2) => 상태 코드값
    @Column(name = "MANAGE_CD")
    private String manageCd;

    // 작성자 (구매자)
    @Column(name = "REG_ID")
    private String regId;

    // 수정자 (판매자) 상태코드  0일 경우 구매자도 수정 가능
    @Column(name = "LAST_ID")
    private String lastId;

    @Column(name = "USE_YN")
    private String useYn;

    @CreationTimestamp
    @Column(name = "REG_DT")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

    @Builder
    public CustomerManage (String title,
                           String content,
                           String attachment,
                           String answer,
                           String productUuid,
                           String regId,
                           String lastId,
                           LocalDateTime createDate,
                           LocalDateTime modifyDate) {
        this.customerManageUuid = UtilMethod.createUUID();
        this.title = title;
        this.content = content;
        this.attachment = attachment;
        this.answer = answer;
        this.productUuid= productUuid;
        this.manageCd = "0";
        this.regId = regId;
        this.lastId = lastId;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.useYn = "Y";
    }
}
