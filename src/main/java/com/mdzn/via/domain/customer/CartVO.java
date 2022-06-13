package com.mdzn.via.domain.customer;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class CartVO extends BaseVO {

    private Long id;
    private Long userId;

}
