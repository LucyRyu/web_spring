package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.ArticleDao;
import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 기능을 수행하는 클래스
 * 각 메소드는 해당 기능을 수행한다.
 */
@Service
public class ApiBbsService {
    @Autowired
    private ArticleDao dao;

    /**
     * 글쓰기
     * @param article
     */
    public void registArticle(Article article) {

        dao.insertArticle(article);
    }

    /**
     * 상세 글보기
     * @param articleId 글번호
     * @return 글
     */
    public Article viewArticle(String articleId) {
        return dao.selectArticleById(articleId);
    }

    /**
     * 전체 글보기
     */
    public List<Article> getArticles() {
        return dao.selectAllArticles();
    }

    /**
     * 글 수정
     * */
    public void modifyArticleId(String articleId, Article article) {
        dao.modifyArticleById(articleId,article);
    }


    /**
     * 글 삭제
     * */
    public Article deleteArticleId(String articleId){
        return dao.deleteArticleById(articleId);
    }


}
