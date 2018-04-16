
package pl.edu.ur.oopl5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;


public class Kalendarz {

     
    
   private int rok;
    private String miesiac;
    private String dzien;
    private int godzina;
    
    public int getrok()
    {
        return(rok);
    }
    public void setrok(int rok)
    {
        this.rok = rok;
    }
     public String getmiesiac()
    {
        return(miesiac);
    }
    public void setmiesiac(String miesiac)
    {
        this.miesiac = miesiac;
    }
    public String getdzien ()
    {
    return(dzien);    
    }
    public void setdzien(String dzien) 
    {
       this.dzien = dzien; 
    }
    public int setgodzin()
    {
        return(godzina);
    }
    public void getgodzina(int godzina)
    {
        this.godzina = godzina;
    }
    public Kalendarz(int rok, String miesiac, String dzien, int godzina)
    {
        this.rok =rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
        this.godzina = godzina;
    }
    public void biezacaData()
    {
       Date date = new Date(0);
      Instant instant = Instant.ofEpochMilli(date.getTime());
     LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
    }
    LocalTime localTime1 = LocalTime.now();
   
            
    
    
}
