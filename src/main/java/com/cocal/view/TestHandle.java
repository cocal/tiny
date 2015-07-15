package com.cocal.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cocal on 2015/7/15.
 */
@Controller
@RequestMapping("/t")
public class TestHandle {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
