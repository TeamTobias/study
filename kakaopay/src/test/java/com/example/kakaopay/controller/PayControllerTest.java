package com.example.kakaopay.controller;

import com.example.kakaopay.vo.RequestPay;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(PayController.class)
public class PayControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void complete() throws Exception {
        RequestPay requestPay = RequestPay.builder()
                .pg("KaKaopay")
                .pay_method("card")
                .merchant_uid("merchant_")
                .name("name")
                .amount("1000")
                .buyer_email("email")
                .buyer_name("name")
                .buyer_tel("tel")
                .buyer_addr("addr")
                .buyer_postcode("postcode")
                .build();

        mockMvc.perform(post("/payments/complete")
                .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON)
                .content(requestPay.toString()));


    }

}
