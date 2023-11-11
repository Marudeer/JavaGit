//Czym jest string[] args w metodzie main - ArrayList - tworzenie dynamiczne tablicy -> jest to klasa!!;

import java.util.ArrayList;
import java.util.Collections;

public class home10  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
       ArrayList<String> names = new ArrayList<>();
       names.add("Mariusz");
       names.add("Dawid");
       names.add("Błażej");


       names.add("Dupa");

       System.out.println("\n========= Program Start =========\n");

       for (String name: names) {
            System.out.println(name);
       }
       //      Sprawdzenie czy dane imiona są w systemie:
       System.out.println("\n========= =========\n");
       System.out.println("Sprawdzenie czy dane imiona są w systemie: ");
       System.out.println("Mariusz: " + names.contains("Mariusz"));
       System.out.println("Kupa:    " + names.contains("Kupa"));

       //       Wykorzystanie getera w celu wyciagniecia danych z ArrayList:
       System.out.println("\n========= =========\n");
       System.out.println("Wykorzystanie getera w celu wyciagniecia danych z ArrayList:");
       System.out.println("Pierwszy element w tablicy: " + names.get(0));

      //       Posortowanie alfabetycznie listy:
      System.out.println("\n========= =========\n");
      System.out.println("Posortowanie alfabetycznie listy:");
      Collections.sort(names);
      for (String name: names) 
        {
            System.out.println(name);
        }
       

       System.out.println("\n========= Program End =========\n");
    }
}

