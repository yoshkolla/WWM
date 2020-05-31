/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import org.hibernate.Session;

/**
 *
 * @author Chamara
 */
public class Connection {

    private static Session conn;

    public static Session getConnection() {
        if (conn == null) {
            conn = HibernateUtil.getSessionFactory().openSession();
        }
        return conn;
    }
}
