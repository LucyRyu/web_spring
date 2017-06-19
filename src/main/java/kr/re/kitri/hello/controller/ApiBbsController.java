package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.ApiBbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * /api/bbs ... (GET) 전체보기
 * /api/bbs/{articleId} ... (GET) 상세보기
 * /api/bbs ... (POST) 글쓰기
 * /api/bbs/{articleId} ... (PUT) 글수정
 * /api/bbs/{articleId} ... (DELETE) 글삭제
 */


//모든 response 가 json이라는 의미
// spring ver4.0 에서 추가된 가장 큰 변화
@RestController
@RequestMapping("/api")
public class ApiBbsController {

    @Autowired
    private ApiBbsService service;

    //todo: 전체보기
    @GetMapping("/bbs")
    public List<Article> viewAll(){
        List<Article> list = service.getArticles();
        return list;
    }

    //todo: 상세보기
    @GetMapping("/bbs/{articleId}")
    public Article viewDetail(@PathVariable String articleId){
        Article article = service.viewArticle(articleId);
        return article;
    }

    //todo: 글쓰기
    @PostMapping("/bbs")
    public ModelAndView regist(@RequestBody Article article){
        System.out.println(article);

        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/bbs/do_write");
        mav.addObject("article", article);

        return mav;
    }

    //todo: 글수정
    @PutMapping("/bbs/{articleId}")
    public ModelAndView modify(@PathVariable String articleId, @RequestBody Article article){
        System.out.println(article);

        service.modifyArticleId(articleId, article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/bbs/do_write");
        mav.addObject("article", article);

        return mav;
    }

    //todo: 글삭제
    @DeleteMapping("/bbs/{articleId}")
    public Article delete(@PathVariable String articleId){

        Article article = service.deleteArticleId(articleId);
        return article;
    }
}
