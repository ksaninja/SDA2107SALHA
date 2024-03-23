package day01;

import java.sql.*;
public class secondtry {




        public static void main(String[] args) throws SQLException {

            // 1- Create Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/work","root","12341234");

            // 2- Create Statement/Query
            Statement st = conn.createStatement();

            // 3- Execute Statement/Query
            // 4- Store results in ResultSet

            ResultSet rs = st.executeQuery("select * from personnel");

            // 5- Close Connection
            st.close();
            conn.close();
        }

    }

