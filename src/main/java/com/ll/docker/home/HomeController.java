package com.ll.docker.home;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String showMain() {
        return "<h1>Hello, SB</h1>";
    }
}
