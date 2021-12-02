package com.spring.react.board.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class mainController {
    @CrossOrigin(origins = "http://localhost:3000") // cors되나..?
    @GetMapping("/api/main")
    public String main(){
                Date dt = new Date();
        return "현재 시각은 " + new Date() + " 입니다.";

    }

}
