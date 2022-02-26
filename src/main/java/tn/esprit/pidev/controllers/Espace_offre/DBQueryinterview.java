package tn.esprit.pidev.controllers.Espace_offre;


import tn.esprit.pidev.entities.Interview;

import java.sql.*;
import java.util.HashMap;

public class DBQueryinterview {

    public static HashMap<Integer, Interview> getLink() {
        Connection con = DBHelper.getConnection();
        HashMap<Integer,Interview> map2 = new HashMap<Integer,Interview>();

        Interview i;


        try {
            //new user added remove if error occur

            String query = "SELECT * FROM Interview,Job_Offer WHERE Job_Offer.interv_id_interview=Interview.id_interview;  ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()) {
                Integer id = rs.getInt("id_interview");
                String link = rs.getString("link");
                Date date = rs.getDate("date");
              String mail = rs.getString("mail");
                String description = rs.getString("description");
                String title = rs.getString("title");
               Time time= rs.getTime("time");
                String webSite= rs.getString("web_Site");
                Integer numTel= rs.getInt("num_Tel");



                i = new Interview(link,id,date,mail,description,title,time,webSite,numTel);



                map2.put(id,i);


            }
        }catch(Exception ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return map2;

    }

}
