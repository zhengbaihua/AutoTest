package hello;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }


}

