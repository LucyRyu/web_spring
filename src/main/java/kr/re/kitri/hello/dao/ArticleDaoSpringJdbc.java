package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */

@Repository
public class ArticleDaoSpringJdbc implements ArticleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertArticle(Article article) {
        String query = "INSERT INTO article (article_id, title, author, content) " +
                "VALUES (?,?,?,?);";

        jdbcTemplate.update(query,
                Integer.parseInt(article.getArticleId()),
                article.getTitle(),
                article.getAuthor(),
                article.getContent()
        );
    }

    @Override
    public List<Article> selectAllArticles() {
        String query = "SELECT article_id, title, author, content FROM article;";

        return null;
    }

    @Override
    public Article selectArticleById(String articleId) {
        return null;
    }
}
