//package com.ipin.hx.service;
//
//import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * Created by janze on 7/5/18.
// */
//@Service
//public class HxService {
//
//
//    @Resource
//    private RestTemplate restTemplate;
//
//    @Resource
//    private DiscoveryClient discoveryClient;
//
//
//    @Bean
//    public RestTemplate getRestTemplate(RestTemplateBuilder restTemplateBuilder){
//        return new RestTemplateBuilder().build();
//    }
//
//
//    @HystrixCommand(fallbackMethod = "fallBack")
//    public String usage(){
//
//        List<ServiceInstance> list = discoveryClient.getInstances("service-provider");
//        String serviceProviderUrl = list.get(0).getUri().toString();
//
//        ResponseEntity<String> res = restTemplate.getForEntity(serviceProviderUrl + "/service-instances/usage", String.class);
//        String uasge = res.getBody();
//        return uasge;
//    }
//
//    public String fallBack(){
//        return "We are so sorry that the service provider is down.";
//    }
//
//
//
//}
