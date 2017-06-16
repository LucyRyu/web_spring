package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;

import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public interface PostDao {
    void insertPost(Post post);

    List<Post> selectAllPost();
}
