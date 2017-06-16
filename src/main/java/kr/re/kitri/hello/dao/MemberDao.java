package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public interface MemberDao {

    void upDatePoint(Integer memberSeq);

    void CreateMember(Member member);

    List<Member> selectAllMember();
}
