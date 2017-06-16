package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class MemberDaoSpringJdbc implements MemberDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void upDatePoint(Integer memberSeq) {
        String query = "UPDATE member\n" +
                "SET point = point+10\n" +
                "WHERE member_seq = ?";
        jdbcTemplate.update(query,memberSeq);
    }

    public void CreateMember(Member member) {
        String query = "INSERT INTO member(userid, password, email, join_date)" +
                "VALUES (?,?,?,now());";

        jdbcTemplate.update(query,
                member.getUserId(),
                member.getPassword(),
                member.getEmail()
        );
    }


    @Override
    public List<Member> selectAllMember() {
        String query = "SELECT member_seq, userid, password, email, point, join_date FROM member;";

        return jdbcTemplate.query(query, (rs, i) -> {
            Member member = new Member();
            member.setMemberSeq(rs.getInt(1));
            member.setUserId(rs.getString(2));
            member.setPassword(rs.getString(3));
            member.setEmail(rs.getString(4));
            member.setPoint(rs.getInt(5));
            member.setJoinDate(rs.getDate(6));
            return member;
        });
    }


}
