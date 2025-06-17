package com.mini.crm.event.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

    @RequestMapping("/crm/test-view")
    public String testView() {
        return "crm/test-view";
    }
}
