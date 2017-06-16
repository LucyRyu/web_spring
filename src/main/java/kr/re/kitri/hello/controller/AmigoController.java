package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.common.MockAmigo;
import kr.re.kitri.hello.model.Amigo;
import kr.re.kitri.hello.service.AmigoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import sun.management.Agent;

import java.util.List;

/**
 * /amigo .. 친구 전체보기
 * /amigo/regist (GET) .. 친구 등록 화면으로 이동
 * /amigo/regist (POST) .. 친구 등록
 * /amigo/{id} .. 친구 상세보기
 * /amigo/{id}/modify (GET) .. 친구 수정하기 화면으로 이동
 * /amigo/{id}/modify (POST) .. 친구 수정완료
 * /amigo/{id}/remove (GET) .. 친구 삭제하기 화면으로 이동
 * /amigo/{id}/remove (POST) .. 친구 삭제완료
 *
 */
@Controller
@RequestMapping("/amigo")
public class AmigoController {

    @Autowired
    private AmigoService service;

    @RequestMapping("")
    public ModelAndView viewAll() {

        //전체보기를 하기위한 데이터를 가져온다.
        MockAmigo mock = new MockAmigo();
        List<Amigo> list = mock.getAmigo();

        return new ModelAndView("amigo/view_all")
                .addObject("list", list);
    }
    @RequestMapping("/{amigo_id}")
    public ModelAndView viewDetail(@PathVariable String articleId) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("bbs/view_detail");
        mav.addObject("articleId", articleId);
        return mav;
    }

    @GetMapping("/regist")
    public String registAmigo() {
        return "amigo/regist";
    }


    @PostMapping("/regist")
    public ModelAndView doRegist(Amigo amigo) {

        service.registAmigo(amigo);

        return new ModelAndView("amigo/regist_ok").addObject("amigo",amigo);
    }
}
