package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-15.
 */
public class Amigo {

    private Integer amigo_id;
    private String amigoName;
    private String hpNum;
    private String email;

    public Integer getAmigo_id() {
        return amigo_id;
    }

    public void setAmigo_id(Integer amigo_id) {
        this.amigo_id = amigo_id;
    }

    public String getAmigoName() {
        return amigoName;
    }

    public void setAmigoName(String amigoName) {
        this.amigoName = amigoName;
    }

    public String getHpNum() {
        return hpNum;
    }

    public void setHpNum(String hpNum) {
        this.hpNum = hpNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigo_id=" + amigo_id +
                ", amigoName='" + amigoName + '\'' +
                ", hpNum='" + hpNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
