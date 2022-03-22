package com.example.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(name = "prices", url = "${api.price}")
public interface Client {
    @RequestMapping(method = RequestMethod.GET)
    Map<String,String> getPrices();
}

