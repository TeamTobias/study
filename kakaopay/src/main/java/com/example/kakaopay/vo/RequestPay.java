package com.example.kakaopay.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestPay {
    // pg: 결제수단
    private String pg;
    // pay_method: 결제수단
    private String pay_method;
    // merchant_uid: 주문번호
    private String merchant_uid;
    // name: 상품명
    private String name;
    // amount: 결제금액
    private String amount;
    // buyer_email: 구매자 이메일
    private String buyer_email;
    // buyer_name: 구매자 이름
    private String buyer_name;
    // buyer_tel: 구매자 전화번호
    private String buyer_tel;
    // buyer_addr: 구매자 주소
    private String buyer_addr;
    // buyer_postcode: 구매자 우편번호
    private String buyer_postcode;

}
