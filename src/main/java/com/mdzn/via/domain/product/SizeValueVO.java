package com.mdzn.via.domain.product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class SizeValueVO {

    private Long id;
    private String label;
    private Integer order;

    private Long sizeGroupId;

}
