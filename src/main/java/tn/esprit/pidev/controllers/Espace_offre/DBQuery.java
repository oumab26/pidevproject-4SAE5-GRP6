package tn.esprit.pidev.controllers.Espace_offre;


import tn.esprit.pidev.entities.Interview;
import tn.esprit.pidev.entities.User;

import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import static ch.qos.logback.core.db.DBHelper.*;

public class DBQuery {

    public static HashMap<Integer, User> getEmail() {
        Connection con = DBHelper.getConnection();
        HashMap<Integer,User> map = new HashMap<Integer,User>();

Interview i;

        User u;
        try {
            //new user added remove if error occur

            String query = "SELECT * FROM User, Condidacy  WHERE User.id=Condidacy.id && Condidacy.status LIKE 'Accept' ;  ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                Integer id = rs.getInt("id");
                 String email = rs.getString("email");


                 u = new User(id,email);



                map.put(id,u);


            }
        }catch(Exception ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return map;

    }

}
