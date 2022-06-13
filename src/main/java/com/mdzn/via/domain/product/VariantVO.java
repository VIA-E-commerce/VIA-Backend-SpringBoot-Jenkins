package com.mdzn.via.domain.product;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class VariantVO extends BaseVO {

    private Long id;

    private Integer quantity;
    private Boolean hide;

    private Long productId;
    private Long colorId;
    private Long sizeValueId;

}
