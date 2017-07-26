package com.aapay.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@EnableAutoConfiguration
public class IndexController {

    @GetMapping("index")
    String index(){
        return "hello index";
    }

}
