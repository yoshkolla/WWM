/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wwm;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import pojos.User;
import utils.Connection;
import utils.HibernateUtil;

/**
 *
 * @author Chamara
 */
public class WWM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Session s = Connection.getConnection();
        List<User> list = s.createCriteria(User.class).list();
        for (User u : list) {
            System.out.println(u.getName());
        }
    }
    
}
