package com.mdzn.via.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public abstract class BaseVO {

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
