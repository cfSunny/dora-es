package com.pres.es.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author Dora
 * @date 2019/10/28 9:54
 **/
@RestController
public class IoController {

    private RestTemplate restTemplate=new RestTemplate();

    public void testRestTemplate(){
        String url="";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);

    }


}
