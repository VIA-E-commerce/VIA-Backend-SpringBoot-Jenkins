package com.mdzn.via.domain.order;

import com.mdzn.via.domain.BaseVO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode(callSuper = false)
public class OrderVO extends BaseVO {

    private Long id;

    // 주문 정보
    private Long totalPrice;
    private Long paymentReal;

    private String purchaser;
    private String purchaserPhone;
    private String purchaserEmail;

    // 배송 정보
    private String recipient;
    private String recipientPhone;
    private String postalCode;
    private String shippingAddress;
    private String message;
    private OrderStatus status;
    private LocalDateTime arrivedAt;

    // 결제 정보
    private PaymentMethod paymentMethod;
    private String merchantUid;
    private LocalDateTime paidAt;

    // 연관 관계
    private Long userId;

}
