
package pl.edu.ur.oopl5;


public class Pracownik {
    public String imie;
    public String nazwisko;
    public int wiek;
    public String Stanowisko;
    
    public Pracownik(String imie, String nazwisko,int wiek, String Stanowisko)
    {
        this.imie =imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.Stanowisko = Stanowisko;
    }
    
    public Pracownik(String imie, String nazwisko,int wiek)
    {
        this.imie =imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
       
    }
    public Pracownik(String imie, String nazwisko)
    {
        this.imie =imie;
        this.nazwisko = nazwisko;
        
       
    }
    public void pokazDane() 
    {
        System.out.println("Pracownik");
        System.out.println("imie :" + this.imie);
        System.out.println("nazwisko:" + this.nazwisko);
        System.out.println("wiek:" + this.wiek + "lat");
        System.out.println("Stanowisko:" + this.Stanowisko);
    }
}
