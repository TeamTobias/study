package com.example.kakaopay.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Log4j2
public class PayController {

    @RequestMapping("/pay")
    public ModelAndView pay() {
        log.info("pay");
        return new ModelAndView("pay");
    }

    @RequestMapping("/pay/completed")
    public ModelAndView completed() {
        log.info("pay");
        return new ModelAndView("completed");
    }

    @PostMapping("/payments/complete")
    public HttpStatus complete(@RequestBody Object object) {
        System.out.println(object);
        log.info("--------------------------------------------------------------");
        log.info(object);
        return HttpStatus.OK;
    }

}
