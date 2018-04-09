
package pl.edu.ur.oopl5;


public class Bibloteka {
    
     public static void main (String [] args)
    {
     Ksiazka1 ksiazka =  new Ksiazka1 ("Rapsbery" ,"3rd Edition" , 344,1992,23);
     System.out.println("Przed zmiana ceny");
     System.out.println(ksiazka.toString());
     ksiazka.ustawCena(21);
     System.out.println("PO zmianie ceny");
     System.out.println(ksiazka.toString());
     
    }
}
