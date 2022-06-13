package com.mdzn.via.domain.cs;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class QuestionVO extends BaseVO {

    private Long id;

    private String title;
    private String content;
    private Boolean isPrivate;

    private Long userId;
    private Long productId;
}
