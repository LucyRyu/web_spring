package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.MemberDao;
import kr.re.kitri.hello.dao.PostDao;
import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Service
public class MemberService {

    @Autowired
    private PostDao postDao;

    @Autowired
    private MemberDao memberDao;

    public void signUpMember(Member member) {
        memberDao.CreateMember(member);

    }
}
