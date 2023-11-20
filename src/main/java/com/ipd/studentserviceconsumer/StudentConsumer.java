package com.ipd.studentserviceconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.*;


@RestController
public class StudentConsumer {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/consume")
    public String consumeData() {
        RestTemplate rt = new RestTemplate();
        List<ServiceInstance> list = discoveryClient.getInstances("STUDENT-PROVIDER");
        ResponseEntity<String> responseEntity = rt.getForEntity(list.get(0).getUri() + "provider/show", String.class);
        return "FROM CONSUMER=>" + responseEntity.getBody();
    }
}
