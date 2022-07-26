/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session_3;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class DBConnect {

    Connection conn = null;

    public static Connection java_db() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\USER\\Documents\\NID_2\\CSE272_2021\\src\\com\\session_3\\empcsdb.sqlite");
//            JOptionPane.showMessageDialog(null, "Connection to database is successful");

            return conn;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
