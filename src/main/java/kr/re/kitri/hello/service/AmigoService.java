package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.AmigoDao;
import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by danawacomputer on 2017-06-15.
 */
@Service
public class AmigoService {

    @Autowired
    private AmigoDao amigoDao;

    /*
    * 친구등록
    * @param Amigo
     */
    public void registAmigo(Amigo amigo) {

        amigoDao.insertAmigo(amigo);
    }



    /*
    * 등록완료
     */
}
