package com.mdzn.via.domain.order;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class OrderDetailVO extends BaseVO {

    private Long id;

    private Integer price;
    private Integer quantity;

    private Long variantId;
    private Long orderId;

}
