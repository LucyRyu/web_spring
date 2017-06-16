package kr.re.kitri.hello.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import kr.re.kitri.hello.model.Member;
import kr.re.kitri.hello.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * /member/signUp(GET)   ...회원가입화면
 * /member/signUp(POST)   ...회원가입
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService service;

    @GetMapping("/signUp")
    public String signUp(){

        return "/member/signUp";
    }

    @PostMapping("/signUp")
    public ModelAndView doSignUp(Member member){

        System.out.println(member);

        service.signUpMember(member);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/member/do_signUp");
        mav.addObject("member", member);

        return mav;
    }



}
