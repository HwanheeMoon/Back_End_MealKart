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
@Table(name = "TB_REVIEW")
@Getter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class Review {

    @Id
    @Column(name = "REVIEW_UUID")
    private String reviewUuid;

    @Column(name = "SCORE")
    private Float score;

    @Column(name = "CONTENT")
    private String content;

    @Column(name = "IMAGE")
    private String image;

    @Column(name = "PRODUCT_UUID")
    private String productUuid;

    // 작성자
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
    public Review (Float score,
                   String content,
                   String image,
                   String productUuid,
                   String userUuid,
                   LocalDateTime createDate,
                   LocalDateTime modifyDate) {
        this.reviewUuid = UtilMethod.createUUID();
        this.score = score;
        this.content = content;
        this.image = image;
        this.productUuid = productUuid;
        this.userUuid = userUuid;
        this.useYn = "Y";
        this.createDate = createDate;
        this.modifyDate = modifyDate;
    }
}
