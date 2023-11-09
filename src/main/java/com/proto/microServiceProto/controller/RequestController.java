package com.proto.microServiceProto.controller;


import com.proto.microServiceProto.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/proto")
public class RequestController {

    @Autowired
    public RequestService requestService;


    @GetMapping("/getAll")
    public ResponseEntity getAllRequest(){
         return ResponseEntity.ok(requestService.getAllRequest()) ;
    }
}
