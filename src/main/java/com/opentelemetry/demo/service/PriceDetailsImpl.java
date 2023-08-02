package com.opentelemetry.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class PriceDetailsImpl implements PriceDetails{
    @Override
    public void calculatePrice() {
        getPriceForEachProduct();
        Random randI = new Random();
        int myRandInt = randI.nextInt(100);
        myRandInt = myRandInt+1;
        log.info("Calculating Accuracy");
        log.info("Accuracy = " + myRandInt);
    }

    public void getPriceForEachProduct(){
        log.info("product1 = 20");
    }
}
