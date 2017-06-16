package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Member;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class MockMember {
    public List<Member> getPost() {
        List<Member> list = new ArrayList<>();

        Member a = new Member();
        a.setMemberSeq(1);
        a.setUserId("first");
        a.setPassword("1234");
        a.setEmail("test@co.kr");
        a.setPoint(10);
        a.setJoinDate(Date.from(Instant.now()));
        list.add(a);

        return list;
    }

}
