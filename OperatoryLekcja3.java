
package operatorylekcja3;


public class OperatoryLekcja3 {

    public static void main(String[] args) {
       
        /*
        Operatory - to znaki służące do operowania na zmiennych 
        
        OPERATORY ARYTMETYCZNE 
        + dodawnie liczb oraz łączenie Stringów
        - odejmowanie
        * mnożenie
        / dzielenie 
        
        = przypisywanie wartości
        +=
        
        ++ inkrementacja - powiększ o 1 
        -- dekrementacja zmniejsza o 1 
        
        y++ Post inkrementacja
        y-- Post dekrementacja 
        
        ++y Pre inkrementacja
        --y Pre dekrementacja
        
        % reszta z dzielenia ;
        
        */
        
        int a = 5;
        System.out.println(a);
        a = a + 2;//dodaj do a 2
        System.out.println(a);
        a *= 4;// pomnóż a przez 4
        System.out.println(a);
        ///////////////////////////////////////////////////////
        /*
            OPERATOR RELACJI Porównania
            
            = - przypisanie
            == - porównania
            != - różne
            <= - mniejsze równe
            >= - wieksze równe
        
        */
        
        boolean isTrue  = 4 == 4;
        
        System.out.println(isTrue);
        
        isTrue = 4 == 8;
        
        System.out.println(isTrue1);
        
        if(4==8)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        ///////////////////////////////////////////////////////
        /*
            OPERATORY LOGICZNE
            ! - negacja
            !(true)- false
            !(false)- true
            
            && - koniunkcja to i to spełnia warunek
            || - alternatywa to albo to spełnia warunek
        */
        
        int aa = 5, 
            bb = 5,
            cc = 7;    
        if (!(aa==bb))
        {
            System.out.println("Tak");
        }
        else
        {
            System.out.println("Nie");
        }
        
        
        /*
            OPERATORY BITOWE
        
            0 - false 1 - true
            & - iloczyn bitowy
            | - suma bitowa 
            ^ - XOR exclusive OR
            x << 1 - przesunięcie w lewo o 1
            x >> 2 - przesunmęcie w prawo o 2
        
        */
        System.out.println(14&11);
        /*
        Iloczyn bitowy
            1 1 1 0 - 14
            1 0 1 1 - 11
            1 0 1 0 - tam gdzie 1 i 1 = 1 gdzie 1 i 0 = 0 
             
         
         Suma bitowa 
            1 0 1 0 - 10
            1 0 1 1 - 11
            1 0 1 1 - 11- jezeli 1 i 1 = 1 jezeli 1 i 0 = 1 jezeli 0 i 0 = 0
            
         XOR
            1 0 1 0 - 10
            1 0 1 1 - 11
            0 0 0 1 - 1
        
        */
         System.out.println(10^11);
        
    }
    
}
