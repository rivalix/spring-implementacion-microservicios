package com.wannacode.bookingmicroservice.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-microservice")
public interface StockClient {


    @RequestMapping("/api/stock/{code}")
    boolean stockAvailable(@PathVariable String code);
}
