package com.singam.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jeyanthasingam on 7/5/2017.
 */
@RestController
public class helloController {

    @RequestMapping("/")
    public static String Hello(){
        return "<h1>Hello World</h1>";
    }
}
