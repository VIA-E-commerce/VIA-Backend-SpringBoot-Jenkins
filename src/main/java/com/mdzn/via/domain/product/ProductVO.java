package com.mdzn.via.domain.product;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ProductVO extends BaseVO {

    private Long id;

    // 상품 정보
    private String name;
    private String description;
    private Integer retailPrice;
    private Integer sellingPrice;
    
    // 상품 통계
    private Integer salesVolume;
    private Integer reviewCount;
    private Integer wishCount;

    // 옵션
    private Boolean display;
    private Boolean onSale;

    // 연관 관계
    private Long categoryId;

}
