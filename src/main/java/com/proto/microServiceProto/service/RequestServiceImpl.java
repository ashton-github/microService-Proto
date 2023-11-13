package com.proto.microServiceProto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @Override
    public String getAllRequest() {
        return webClientRequest();
    }

    private String webClientRequest(){
        //WebClient client = WebClient.create("http://typo-service");
        //String result = client.get()
        String result = webClientBuilder.build().get()
                .uri("http://typo-service/api/Typo/getRequest")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(result);

        return result;
    }
}
