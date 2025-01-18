package com.springboot.mealkart.common.domain;


import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
public abstract class BaseDomain extends BaseTimeDomain{

    @CreatedBy
    @Column(name = "REG_UUID", length = 40,  updatable = false)
    private String regId;


    @LastModifiedBy
    @Column(name = "LAST_UUID", length = 40)
    private String lastId;
}
