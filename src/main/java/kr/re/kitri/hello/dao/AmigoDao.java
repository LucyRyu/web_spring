package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class AmigoDao {

    @Autowired
    private DataSource dataSource;

    public void insertAmigo(Amigo amigo) {

        //1. connection 확보
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        //2. 쿼리문 생성- PreparedStatment 생성
        String query = "INSERT INTO amigo (amigo_name, hpnum, email) " +
                "VALUES (?,?,?);";

        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, amigo.getAmigoName());
            pstmt.setString(2, amigo.getHpNum());
            pstmt.setString(3, amigo.getEmail());

            pstmt.executeUpdate();

            //conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
