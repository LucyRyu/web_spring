package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:spring/applicationContext.xml",
                "classpath:spring/db.xml"
        }
        //배열로 알려줘야함.
)
public class AmigoDaoTest {

    @Autowired
    private AmigoDao amigoDao;

    @Test
    public void testInsertAmigo() {
        Amigo amigo = new Amigo();
        amigo.setAmigoName("testDao");
        amigo.setHpNum("010-8888-7777");
        amigo.setEmail("test@test.com");
        amigoDao.insertAmigo(amigo);
    }


}
