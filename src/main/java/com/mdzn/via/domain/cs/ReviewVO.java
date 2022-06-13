package com.mdzn.via.domain.cs;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class ReviewVO extends BaseVO {

    private Long id;

    private String content;
    private String imageUrl;
    private Integer rating;

    private Long userId;
    private Long productId;
}
