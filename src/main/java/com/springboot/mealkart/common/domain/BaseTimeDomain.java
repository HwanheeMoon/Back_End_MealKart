package com.springboot.mealkart.common.domain;


import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseTimeDomain {

    @CreatedDate
    @Column(name = "REG_DT", updatable = false)
    private LocalDateTime createDate;

    @LastModifiedDate
    @Column(name = "LAST_DT")
    private LocalDateTime modifyDate;

}
