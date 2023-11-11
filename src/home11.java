//HashSet -> w tej klasie nie ma mozliwosci duplikowania wartosci + nie jest zapewnione zachowanie kolejnosci
//wprowadzonych wartosci;

import java.util.HashSet;

public class home11  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
    
        //      Konfiguracja klasy
        HashSet<String> meals = new HashSet<>();

        meals.add("Pizza");
        meals.add("Burger");
        meals.add("Sushi");


        //      Znacznik startu sekwencji
       System.out.println("\n========Program Start========\n");

       for (String tekst : meals) 
       {
            System.out.println(tekst); 
       }
        //      Separator
       //System.out.println("\n=============================\n");

        //      Znacznik końca sekwencji
       System.out.println("\n=========Program End=========\n");
    }
}

