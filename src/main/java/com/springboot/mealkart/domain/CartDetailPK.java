package com.springboot.mealkart.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@Embeddable
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartDetailPK implements Serializable {
    private String CartUuid;
    private String CartDetailUuid;
}
