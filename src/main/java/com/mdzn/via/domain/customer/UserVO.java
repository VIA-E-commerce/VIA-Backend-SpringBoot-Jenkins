package com.mdzn.via.domain.customer;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;


@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class UserVO extends BaseVO {

    private Long id;
    private String email;
    private String password;
    private String name;
    private String phone;
    private Integer point = 0;

    private UserRole role;
    private SNSProvider provider;
    private String snsId;
    private String refreshToken;

    private LocalDateTime deletedAt;

}
