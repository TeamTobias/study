package com.example.kakaopay.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponsePay {
    // tid: 결제 고유번호
    private String imp_uid;
    // merchant_uid: 주문번호
    private String merchant_uid;
    // paid_amount: 결제금액
    private String paid_amount;
    // apply_num: 카드 승인번호
    private String apply_num;
}
