package com.mdzn.via.domain.customer;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class AddressVO extends BaseVO {

    private Long id;

    private String label;
    private String postalCode;
    private String address;
    private String addressDetail;

    private Boolean isDefault;

    private LocalDateTime usedAt;

    private Long userId;

}
