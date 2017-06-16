package kr.re.kitri.hello.model;

import java.util.Date;

/**
 * Created by danawacomputer on 2017-06-16.
 */
public class Post {

    private Integer postSeq;
    private String title;
    private String content;
    private Date writeDate;
    private Integer memberSeq;

    public Post() {
    }

    public Integer getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(Integer postSeq) {
        this.postSeq = postSeq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    public Integer getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(Integer memberSeq) {
        this.memberSeq = memberSeq;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postSeq=" + postSeq +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writeDate=" + writeDate +
                ", memberSeq=" + memberSeq +
                '}';
    }
}
