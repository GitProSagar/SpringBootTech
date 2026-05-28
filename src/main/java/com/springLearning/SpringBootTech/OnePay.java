package com.springLearning.SpringBootTech;

import org.springframework.stereotype.Component;

@Component
public class OnePay {

    public String pay() {
        String payment = "Onepay payment";
        System.out.println("Payment from :"+payment);
        return payment;
    }

}
