package kr.re.kitri.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "redirect:member/signUp";
    }

    @RequestMapping("/bs-sample")
    public String test() {
        return "bs_sample";
    }
}
