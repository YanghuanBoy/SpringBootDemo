package com.example.controller.admin;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017-3-13.
 */
@Controller
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index(){
        return "admin/index";
    }
}
