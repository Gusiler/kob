package com.gus.backend.controller.pk;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pk")
public class BotInfoController {

    @RequestMapping("/getBotInfo")
    public List<String> getBotInfo() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bb");
        return list;
    }
}
