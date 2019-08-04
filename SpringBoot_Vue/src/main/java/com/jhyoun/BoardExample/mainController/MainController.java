package com.jhyoun.BoardExample.mainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {

    @RequestMapping("/")
    public String goMain() {
        return "index";
    }

    @RequestMapping("/hi")
    public String hi() {
        return "hiPage";
    }
}
