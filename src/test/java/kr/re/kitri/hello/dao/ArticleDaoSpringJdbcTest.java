package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:spring/applicationContext.xml",
                "classpath:spring/db.xml"
        }
        //배열로 알려줘야함.
)
public class ArticleDaoSpringJdbcTest {

        @Autowired
        private ArticleDaoSpringJdbc articleDao;

        @Test
        public void testinsertArticle(){
                Article article = new Article();
                article.setArticleId("8");
                article.setTitle("tt");
                article.setAuthor("ddddd");
                article.setContent("test case");
                articleDao.insertArticle(article);
        };
}
