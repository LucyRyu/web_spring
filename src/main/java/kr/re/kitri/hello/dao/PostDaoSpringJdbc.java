package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
@Repository
public class PostDaoSpringJdbc implements PostDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertPost(Post post) {
        String query = "INSERT INTO post (post_seq, title, content, write_date, member_seq) " +
                "VALUES (?,?,?,?,?);";

        jdbcTemplate.update(query,
                post.getTitle(),
                post.getContent(),
                post.getWriteDate(),
                post.getMemberSeq()
        );
    }

    @Override
    public List<Post> selectAllPost() {
        String query = "SELECT post_seq, title, content, write_date, member_seq FROM post;";

        return jdbcTemplate.query(query, (rs, i) -> {
            Post post = new Post();
            post.setPostSeq(rs.getInt(1));
            post.setTitle(rs.getString(2));
            post.setContent(rs.getString(3));
            post.setWriteDate(rs.getDate(4));
            post.setMemberSeq(rs.getInt(5));
            return post;
        });
    }



}
