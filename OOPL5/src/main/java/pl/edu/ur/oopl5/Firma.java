
package pl.edu.ur.oopl5;
import java.util.Scanner;

public class Firma 
{
    Scanner scan = new Scanner(System.in);
    Pracownik [] prac;
     public String imie;
    public String nazwisko;
    public int wiek;
    public String Stanowisko;
    public Firma ()
    {
        this.prac = new Pracownik [100];
    }
    public void Wprowadzanie ()
    {
        for(int i =0; i<100; i++)
        {
          prac[i] = new Pracownik("","",0,"");
        }
       
        
    }
     public void DodajPracownika ()
        {
            int i=0;
         System.out.println("Podaj imie:");
         String a = scan.nextLine();
         System.out.println("Podaj nazwisko:");
         String b = scan.nextLine();
         System.out.println("Podaj wiek:");
         int c = scan.nextInt();
         System.out.println("Podaj Stanowisko:");
         String d = scan.next();
         prac[i]  = new Pracownik (imie,nazwisko,wiek,Stanowisko);
         i++;
        }
     public void ListaPracownikow()
     {
        for(int i = 0; i<100; i++)
        {
           
             System.out.println("Pracownik o numerze ["+i+"}");

            System.out.println("Imie: "+prac[i].imie);

            System.out.println("Nazwisko: "+prac[i].nazwisko);

            System.out.println("Numer indeksu: "+prac[i].wiek);

            System.out.println("Nazwa specjalizacji: "+prac[i].Stanowisko);

            
        } 
     }
     public void MenuApki()
     {
          while(true){
          int menu;
          System.out.println("1.dodanie  2.wyswietlenie  3.wyjscie");
          menu = scan.nextInt();
         
          if(menu == 1) 
          {
              Firma fir =  new Firma();
              fir.DodajPracownika();
          }else if (menu == 2)
          {
              Firma fir = new Firma ();
              fir.ListaPracownikow();
          }else if (menu == 3)
          {
            break;
          }
        
          }
          
     }
     

     public static void main (String[] args)
     {
         Firma fir = new Firma ();
         fir.MenuApki();

}
}
             
             
         
     
    

