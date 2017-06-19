package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Article;
import kr.re.kitri.hello.service.BbsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 *  /bbs ..전체보기
 *  /bbs/{articleId} ..전체보기(15번 글)
 *  /bbs/{articleId} .. 상세보기(15번 글)
 *  /bbs/{articleId}/modify .. 수정(15번 글 수정)
 *  /bbs/{articleId}/remove .. 삭제(15번 글 삭제)
 *
 *  /bbs/write .. 글 작성화면 로딩
 *  /bbs/write/do .. 글 작성하기
 *
 */
@Controller
@RequestMapping("/bbs")
public class BbsController {

    @Autowired
    private BbsService service;

    /**\
     * 전체보기
     * @return
     */
    @RequestMapping("")
    public ModelAndView viewAll() {

        //전체보기를 하기위한 데이터를 가져온다.

        List<Article> list = service.getArticles();

        return new ModelAndView("bbs/view_all")
                .addObject("list",list);
    }

    /*
    * 글 전체보기 API 버전
    * /bbs/api .. 전체보기
    *
    * 1. @ResponseBody
    * 2. 리턴타입을 List<Article>을 리턴한다. 그러면 JSON으로 반환해 줄 것이다.
    */

    @RequestMapping("/api")
    @ResponseBody
    public List<Article> viewAllApi(){
        List<Article> list = service.getArticles();

        return list;
    }


    /*
    * 글 상세보기
    * @param articleId
     */
    @RequestMapping("/{articleId}")
    public ModelAndView viewDetail(@PathVariable String articleId) {

        Article article = service.viewArticle(articleId);
        return new ModelAndView("bbs/view_detail")
                .addObject("article",article);
    }

    @RequestMapping("/{articleId}/api")
    @ResponseBody // JSON으로 반환하겠다는 의미
    public Article viewDetailApi(@PathVariable String articleId){
        Article article = service.viewArticle(articleId);
        return article;
    }

    @GetMapping("/write")
    public String write() {
        return "bbs/write";
    }

    @PostMapping("/write")
    public ModelAndView doWrite(Article article) {

        /*
        String id = req.getParameter("articleId");
        String title = req.getParameter("title");
        String author = req.getParameter("author");
        String content = req.getParameter("content");

        Article article1 = new Article();
        article.setArticleId(id);
        article.setTitle(title);
        article.setAuthor(author);
        article.setContent(content);
        */

        System.out.println(article);

        service.registArticle(article);

        ModelAndView mav = new ModelAndView();
        mav.setViewName("/bbs/do_write");
        mav.addObject("article", article);

        return mav;
    }

    @PostMapping("/write/api")
    public String doWriteApi(@RequestBody Article article){

        service.registArticle(article);
        return "bbs/view_all";
    }

    /*@RequestMapping("/write/do")
    public String doWrite(HttpServletRequest request) {

        String articleId = request.getParameter("article_id");
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String content = request.getParameter("content");

        System.out.println(articleId);
        System.out.println(title);
        System.out.println(author);
        System.out.println(content);

        return "do_write";
    }*/


}

