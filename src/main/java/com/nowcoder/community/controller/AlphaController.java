package com.nowcoder.community.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/alpha")
public class AlphaController {
    @RequestMapping("/hello")
    public  String  sayHello(){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String time =formatter.format(date);
        return   time;
    }
}
