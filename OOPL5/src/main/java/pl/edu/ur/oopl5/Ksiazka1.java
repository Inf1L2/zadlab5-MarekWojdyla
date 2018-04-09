package pl.edu.ur.oopl5;

public class Ksiazka1 {

    private String tytuł;
    private String autor;
    private int liczba_stron;
    private int rok_wydania;
    private int cena ;

    public String pobieramTytuł () 
    {
        return this.tytuł;
    }
    public String pobieramAutora ()
    {
        return this.autor;
    }
    public int pobieramLiczbaStron ()
    {
        return this.liczba_stron;
        
    }
    public int pobieram_Rok_Wydania ()
    {
        return this.rok_wydania;
    }
    public int pobieram_cena () 
    {
        return this.cena;
    }
    public void ustawTytuł (String tytuł) 
    {
        this.tytuł= tytuł;
    }
    public void ustawAutora (String autor)
    {
       this.autor = autor; 
    }
    public void ustawLiczbaStron (int liczba_stron)
    {
        this.liczba_stron = liczba_stron;
    }
     public void ustawRokWydania (int rok_wydania)
    {
        this.rok_wydania = rok_wydania;
    }
     public void ustawCena (int cena)
     {
         this.cena = cena;
     }
    
    
    public Ksiazka1 (String tytuł, String autor, int liczba_stron, int rok_wydania, int cena)
    {
       this.autor = autor; 
       this.liczba_stron =liczba_stron;
       this.tytuł = tytuł;
       this.rok_wydania = rok_wydania;
       this.cena = cena;
    }
     
   
            
}