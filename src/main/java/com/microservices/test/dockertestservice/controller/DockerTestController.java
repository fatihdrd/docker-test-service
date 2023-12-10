package com.microservices.test.dockertestservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/docker-test")
public class DockerTestController {

    private Logger logger =
            LoggerFactory.getLogger(DockerTestController.class);


    @GetMapping("/hello")
    public ResponseEntity<String> hello() {

        return new ResponseEntity<>("Hello1", HttpStatus.OK);
    }
}
