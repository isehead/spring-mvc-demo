package com.spring.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DuplicateController {

    @RequestMapping("/showForm")
    public String displayTheForm(){
        return "helloworld-form";
    }

}
