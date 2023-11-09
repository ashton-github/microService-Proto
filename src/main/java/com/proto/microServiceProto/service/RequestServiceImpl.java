package com.proto.microServiceProto.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class RequestServiceImpl implements RequestService {

    @Override
    public String getAllRequest() {
        return webClientRequest();
    }

    private String webClientRequest(){
        WebClient client = WebClient.create("http://localhost:8089");
        String result = client.get()
                .uri("/api/Typo/getRequest")
                .retrieve()
                .bodyToMono(String.class)
                .block();

        System.out.println(result);

        return result;
    }
}
