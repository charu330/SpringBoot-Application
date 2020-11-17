package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello") /*@RequestMapping annotation ensures that HTTP GET requests to /hello are
     mapped to the sayHi() method. */
    public String sayHi()
    {
        return "hi";
    }
}
