
package pl.edu.ur.oopl5;


public class Stos {
     double[] tab;
    int firstFree;
 
   
    public Stos(int n) {
        tab = new double[n];
        firstFree = 0;
    }
 
    
    int getMaximumStossSize() {
        return tab.length;
    }
 
    boolean isEmpty() {
        if (firstFree == 0) {
            return true;
        } else
            return false;
    }
 
    
    int getSize() {
        return firstFree;
    }
 
    
    void Push(double E) throws ArrayIndexOutOfBoundsException {
        if (firstFree < tab.length) {
            tab[firstFree] = E;
            firstFree++;
 
        } else {
            throw new ArrayIndexOutOfBoundsException(
                    "Przepełnienie stosu, operacja nie powiodła się");
        }
    }
 
  
    double Pop() throws IndexOutOfBoundsException {
        if (firstFree <= 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }
 
        double temp = tab[firstFree - 1];
        firstFree--;
        return temp;
    }
 
   
    void display() throws IndexOutOfBoundsException {
        if (firstFree == 0) {
            throw new IndexOutOfBoundsException(
                    "Stos jest pusty, operacja nie powiodła się");
        }
 
        int temp = firstFree - 1;
        do {
            System.out.println(tab[temp]);
            temp--;
        } while (temp > -1);
 
    }
 
    
    void multiPop(int k) {
        if (k < firstFree) {
            for (int i = k; i > 0; i--) {
                System.out.println(Pop());
            }
        }
    }
 
    // Metoda czyszcząca stos
    void clear() {
        for (int i = 0; i < firstFree; i++) {
            tab[i] = 0.0;
 
        }
 
        firstFree = 0;
    }
 
    public static void main (String[] args){
        int  MaxSize = 0;
        Stos stos1 = new Stos(100);
        System.out.println("Dodano Liczby do stosu");
        stos1.Push(10);
        stos1.Push(23);
        stos1.display();
        System.out.println("Zdejmuje ze stosu");
        stos1.multiPop(2);
        stos1.display();
        System.out.println("Dodano Liczby do stosu");
        stos1.Push(10);
        stos1.Push(23);
        stos1.display();
        System.out.println("Czyszcze");
        stos1.clear();
        stos1.display();
    }
    
}
