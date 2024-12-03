package com.suited.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author George Fitzpatrick
 */
@RestController
public class Controller {

    @GetMapping("/")
    public String greeting() {
        return "Hello World";
    }

}
