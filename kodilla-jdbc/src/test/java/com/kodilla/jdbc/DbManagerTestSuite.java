package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DbManagerTestSuite {
    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUser() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //G
        DbManager dbManager = DbManager.getInstance();
        // W
        String sqlQueryUsersPostCounter =
                "select users.FIRSTNAME, users.LASTNAME, count(*) as Post_Counter " +
                        "from  users join posts " +
                        "on posts.USER_ID = users.ID " +
                        "group by users.FIRSTNAME, users.LASTNAME " +
                        "having Post_Counter > 1 " +
                        "order by users.FIRSTNAME";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSQL = statement.executeQuery(sqlQueryUsersPostCounter);
        // T

        int counter = 0;
        while (resultSQL.next()){
            System.out.println(resultSQL.getString("users.FIRSTNAME") + ", " +
                    resultSQL.getString("users.LASTNAME") + " - numbers of posts: " +
                    resultSQL.getInt("Post_Counter"));
            counter ++;
        }
        resultSQL.close();
        statement.close();
        assertEquals(2,counter );

    }
}
