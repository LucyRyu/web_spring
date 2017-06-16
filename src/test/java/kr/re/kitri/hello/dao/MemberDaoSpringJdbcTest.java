package kr.re.kitri.hello.dao;

/**
 * Created by danawacomputer on 2017-06-16.
 */

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:spring/applicationContext.xml",
                "classpath:spring/db.xml"
        }
)
        //배열로 알려줘야함.

public class MemberDaoSpringJdbcTest {


}
