package com.proto.microServiceProto.service;

import org.springframework.stereotype.Service;

@Service
public class RequestServiceImpl implements RequestService {

    @Override
    public String getAllRequest() {
        return "hello";
    }
}
