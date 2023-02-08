package com.sap.apiconsume;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Hello {
 
    @GetMapping("/hello")
    public String hello(){
        return "Hellow world";
    }
    @GetMapping("/apicall")
    public String apiCall(){
        String url = "http://localhost:8080/hello";
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url, String.class);
        return result + "from Hello service";
    }
}
