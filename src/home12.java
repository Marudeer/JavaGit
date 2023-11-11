//HashMap - trzymanie danych dla konkretnego klucza -> wartosci moga sie powtarzac, jednak klucz musi
//byc unikatowy

import java.util.HashMap;
import java.util.*;

public class home12 //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        //      Konfiguracja klasy
        HashMap<String, String> nameToMeal = new HashMap<>();

        nameToMeal.put("Mariusz", "Pizza");
        nameToMeal.put("Dominik", "Burger");
        nameToMeal.put("Kamil", "Burger");
        

        //      Znacznik startu sekwencji
System.out.println("\n========Program Start========\n");

       System.out.println("Sprawdzenie czy mapa jest pusta:");
       System.out.println("Wartość BOOL: " + nameToMeal.isEmpty());

        //      Odczytanie danych po kluczu
System.out.println("\n=============================\n"); 

       System.out.println("Odczytanie z HashMap danych:");
       System.out.println("Dla Mariusza wynik to: " + nameToMeal.get("Mariusz"));

        //      Zmiana danych
System.out.println("\n=============================\n"); 

       nameToMeal.put("Mariusz", "Salad");
       System.out.println("Sprawdzenie zachowania sie kodu po zmianie danych dla Mariusza z 'Pizza' na 'Salad':");
       System.out.println("Dla Mariusza wynik to: " + nameToMeal.get("Mariusz"));

        //      Kontrola dostępności konkretnych kluczy bądź wartości w HashMap:
System.out.println("\n=============================\n");  
        System.out.println("Kontrola dostępności konkretnych kluczy bądź wartości w MapHash.\nDostępne wartości to:");
        System.out.println("Czy jest klucz o nazwie 'Mariusz': " + nameToMeal.containsKey("Mariusz"));
        System.out.println("Czy jest wartość o nazwie 'Pizza': " + nameToMeal.containsKey("Pizza"));


        //      Odczytanie dostępnych wartości w HashMap:
System.out.println("\n=============================\n");  
        Collection<String> variables = nameToMeal.values();
        System.out.println("Kontrola dostępnych wartości dla kluczy w MapHash.\nDostępne wartości to:");
        for (String values : variables) {
            System.out.println("  " + values);
        }

        //      Odczytanie dostępnych kluczy:
System.out.println("\n=============================\n");  
       Set<String> keys = nameToMeal.keySet();
      
       System.out.println("Kontrola dostępnych kluczy w MapHash.\nDostępne klucze to:");
             
       for (String key : keys) {
                System.out.println("  " + key);
        }
       
       //      Czyszczenie mapy:
System.out.println("\n=============================\n"); 

       nameToMeal.clear();
       System.out.println("Czyszczenie mapy z danymi:");
       System.out.println("Wartość BOOL czy mapa jest pusta: " + nameToMeal.isEmpty());
       System.out.println("Dla Mariusza wynik to: " + nameToMeal.get("Mariusz"));

        //      Separator
        //System.out.println("\n=============================\n");

        //      Znacznik końca sekwencji
System.out.println("\n=========Program End=========\n");
    }
}

