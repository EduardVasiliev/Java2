package Main;

import Service.MainService;
import entities.Coffee;
import entities.Size;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 *
 * @author Eduard Vasiliev
 */
public class Main {
    public static void main(String[] args) {
        MainService ms = new MainService();
        
        Coffee c = new Coffee();
        c.setSize(Size.MEDIUM);
        c.setDate(Date.valueOf(LocalDate.now()));
        
        ms.adaugaCafea(c);
       
       
        
    }
}
