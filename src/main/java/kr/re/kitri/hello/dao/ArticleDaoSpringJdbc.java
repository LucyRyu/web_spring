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
    public Article selectArticleById(String articleId) {


        String query = "SELECT article_id, title, author, content " +
                "FROM article " +
                "WHERE article_id =?;";

        //람다식
        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Article article = new Article();
                    article.setArticleId(rs.getString(1));
                    article.setTitle(rs.getString(2));
                    article.setAuthor(rs.getString(3));
                    article.setContent(rs.getString(4));

                    return article;
                }, Integer.parseInt(articleId));

       /* jdbcTemplate.queryForObject(query, new RowMapper<Article>() {

            @Override
            public Article mapRow(ResultSet rs, int i) throws SQLException {

                Article article = new Article();
                article.setArticleId(rs.getString(1));
                article.setTitle(rs.getString(2));
                article.setAuthor(rs.getString(3));
                article.setContent(rs.getString(4));

                return article;
            }

        }, articleId);

        return null; */
    }


    @Override
    public List<Article> selectAllArticles() {
        String query = "SELECT article_id,title,author,content FROM article;";

        return jdbcTemplate.query(query, (rs, i) -> {
            Article article = new Article();
            article.setArticleId(rs.getString(1));
            article.setTitle(rs.getString(2));
            article.setAuthor(rs.getString(3));
            article.setContent(rs.getString(4));
            return article;
        });

        /*
        return jdbcTemplate.query(query, new RowMapper<Article>() {
            @Override
            public Article mapRow(ResultSet resultSet, int i) throws SQLException {
                Article article = new Article();
                article.setArticleId(resultSet.getString(1));
                article.setTitle(resultSet.getString(2));
                article.setAuthor(resultSet.getString(3));
                article.setContent(resultSet.getString(4));

                return article;
            }
        });
        */

    }

    //todo: 글수정
    @Override
    public void modifyArticleById(String articleId, Article article) {
        String query = "UPDATE article\n" +
                "SET title=?, author=?, content=?\n" +
                "WHERE article_id=?;";


        jdbcTemplate.update(query,

                article.getTitle(),
                article.getAuthor(),
                article.getContent(),
                Integer.parseInt(articleId)

        );


    }


    //todo: 글 삭제
    @Override
    public Article deleteArticleById(String articleId) {
        String query = "DELETE FROM article\n" +
                "WHERE article_id=?;";

        return jdbcTemplate.queryForObject(query,
                (rs, i) -> {
                    Article article = new Article();
                    article.setArticleId(rs.getString(1));

                    return article;
                }, Integer.parseInt(articleId));

    }
}
