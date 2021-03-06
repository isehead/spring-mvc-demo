package com.spring.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    // controller method to show initial HTML form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //controller method to process HTML form
    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // read form data and add data to the model
    @RequestMapping("/processFormV2")
    public String convertToUpperCase(HttpServletRequest request, Model model) {

        // read the request parameter from the HTML form
        String theName = request.getParameter("studentName");

        // convert data to all CAPS
        theName = theName.toUpperCase();

        // create the message
        String result = "Hello " + theName + "!";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

    @RequestMapping("/processFormV3")
    public String convertToUpperCaseV3(@RequestParam("studentName") String theName, Model model) {

        // convert data to all CAPS
        theName = theName.toUpperCase();

        // create the message
        String result = "RequestParam hello " + theName + "!";

        // add message to the model
        model.addAttribute("message", result);

        return "helloworld";
    }

}
