package com.yisutech.base.cacliaoning.start.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/print")
    @ResponseBody
    public Object print() {
        JSONObject printJson = new JSONObject();
        printJson.put("name", "李宁");
        printJson.put("age", 35);
        printJson.put("message", "this is a user");
        return printJson;
    }
}
