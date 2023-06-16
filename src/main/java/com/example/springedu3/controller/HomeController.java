package com.example.springedu3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "환영합니다~~~ HomeController 의 처리 결과입니다.";
    }
    @GetMapping("/user")
    public String user() {
        return "로그인을 하면 누구든 볼 수 있는 페이지 입니다.";
    }
    @GetMapping("/atype")
    public String aaa() {
        return "A 로서의 ROLE 이 부여된 사용자만 볼 수 있는 페이지 입니다.";
    }
    @GetMapping("/btype")
    public String bbb() {
        return "B 로서의 ROLE 이 부여된 사용자만 볼 수 있는 페이지 입니다.";
    }
    @GetMapping("/premium")
    public String ccc() {
        return "primium 로서의  권한(AUTH)이 부여된 사용자만 볼 수 있는 페이지 입니다.";
    }
}
