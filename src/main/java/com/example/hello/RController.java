package com.example.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value="name", defaultValue="World") String name) {
  
   	    final String uri = "http://localhost:9000/name";
    	     
    	    RestTemplate restTemplate = new RestTemplate();
    	    Hello2 result = restTemplate.getForObject(uri, Hello2.class);
    	     
    	    System.out.println(result);
          return new Hello(counter.incrementAndGet(),
                            String.format(template, name), result.getName());
    }
}