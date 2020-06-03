/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctrl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mayura Lakshan
 */
public class helper {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static DateFormat datetime = new SimpleDateFormat("HH:mm:ss");

    public static String getDate() {
        return dateFormat.format(new Date());
    }

    public static String getTime() {
        return datetime.format(new Date());
    }
    
    public static String getDate(Calendar d){
        return dateFormat.format(d.getTime());
    }

}
