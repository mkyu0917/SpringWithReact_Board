package com.spring.react.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class mainController {

    @GetMapping("/api/main")
    public String main(){

        return "현재 시각은 " + new Date() + " 입니다.";

    }

}
