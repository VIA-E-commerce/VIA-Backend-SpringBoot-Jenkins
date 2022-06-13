package com.mdzn.via.domain.product;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class CategoryVO extends BaseVO {

    private Long id;
    private String name;
    private String code;

    private Long sizeGroupId;

}
