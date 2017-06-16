package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Post;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class MockPost {

    public List<Post> getPost() {
        List<Post> list = new ArrayList<>();

        Post a = new Post();
        a.setPostSeq(1);
        a.setTitle("test");
        a.setContent("testtttttttttt");
        a.setWriteDate(Date.from(Instant.now()));
        a.setMemberSeq(1);
        list.add(a);

        return list;
    }
}
