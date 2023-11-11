//Wykorzystujemy teorię w praktyce - aplikacja do zarządzania listą gości i posiłków na imprezie;

import java.util.*;
public class _PartyManag  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        //      Konfiguracja klasy
        _PartyManag_Party Party = new _PartyManag_Party();

        Scanner Scanner = new Scanner(System.in);

        int ChoosenType = 0;
        boolean ScanEnd = false;
        

        //      Znacznik startu sekwencji
System.out.println("\n========Program Start========\n");

        //      Otwarcie menu
        while(!ScanEnd)
        {
                System.out.println("\nWitaj w menu. Posiadasz do wyboru poniższe opcje: ");
                System.out.println("1. Wyświetl gości");
                System.out.println("2. Dodaj gościa");
                System.out.println("3. Wyświetl potrawy");
                System.out.println("4. Znajdź po numerze telefonu");
                System.out.println("5. Wyjście");
                System.out.println("\nTwoim wyborem jest: ");
                ChoosenType = Scanner.nextInt();


        //      Instrukcja switch w zalezności od zmiennej ChoosenType -> stary typ switch
                switch (ChoosenType) 
              {
                        case 1:
                                Party.displayGuests();
                                break;
                        case 2:
                                Party.addGuest();
                                break;                       
                        case 3:
                                Party.displayMeals();
                                break;
                        case 4:
                                Party.displayPhones();
                                break;
                        case 5:
                                System.out.println("Wybrano 5");
                                ScanEnd = true;
                                break;        
                        default:
                                System.out.println("Wybrano złą cyfrę");
                                break;
                }
        

         /*  Nowy typ switch -> od Javy 14
           switch (ChoosenType) {
                case 1 -> System.out.println("Wybrano 1");
                case 2 -> System.out.println("Wybrano 2");
                case 3 -> System.out.println("Wybrano 3");
                case 4 -> System.out.println("Wybrano 4");
                case 5 -> System.out.println("Wybrano 5");*/
        }

                        


        //      Separator       



        //      Znacznik końca sekwencji
System.out.println("\n=========Program End=========\n");
    }
}

