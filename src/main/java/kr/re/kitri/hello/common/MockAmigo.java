package kr.re.kitri.hello.common;

import kr.re.kitri.hello.model.Amigo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-06-15.
 */
public class MockAmigo {
    public List<Amigo> getAmigo() {
        List<Amigo> list = new ArrayList<>();

        Amigo a = new Amigo();
        a.setAmigoName("박찬호");
        a.setHpNum("010-1234-5678");
        a.setEmail("cksgh@co.kr");
        list.add(a);

        a = new Amigo();
        a.setAmigoName("박세리");
        a.setHpNum("010-8888-7777");
        a.setEmail("tpfl@co.kr");
        list.add(a);

        return list;
    }
}
