//Dodawanie użytkowników - tworzymy naszą pierwszą klasę;

import java.util.*;
public class _PartyManag_Party  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
        private List<_PartyManag_Guest> guests = new ArrayList<>();
        private Set<String> meals = new HashSet<>();
        private Map<Integer, _PartyManag_Guest> phoneToGuest = new HashMap<>();
        Scanner Scanner = new Scanner(System.in);
        boolean firstTime = true;
       
        public void addGuest() 
        {
                if (!firstTime)
                {
                        Scanner.nextLine();
                }
                System.out.println("\nPodaj imie goscia: "); 
                String name = Scanner.nextLine();
                //System.out.println();
                
                System.out.println("Podaj preferowany posiłek: ");
                String meal = Scanner.nextLine(); 
                //System.out.println();
                
                System.out.println("Podaj numer telefonu: ");
                int phoneNumber = Scanner.nextInt(); 

                System.out.println("Czy wolisz posiłek weganski?: (true-TAK/false-NIE) ");
                boolean isVegan = Scanner.nextBoolean(); 
                
                _PartyManag_Guest GuestTest = new _PartyManag_Guest(name, meal, phoneNumber, isVegan);
                
                //zapisywanie do obiektów
                guests.add(GuestTest);
                meals.add(meal);
                phoneToGuest.put(phoneNumber, GuestTest);

                firstTime = false;

        }

        public void displayMeals()
        {
                for (String meal : meals) {
                        System.out.println(meals);
                }
        }

        public void displayPhones()
        {
                System.out.println("Podaj nr telefonu: ");
                Scanner.nextLine();
                String tekst = Scanner.nextLine();
                Integer phoneNumber = Integer.valueOf(tekst);
                _PartyManag_Guest Guest = phoneToGuest.get(phoneNumber);
                System.out.println("\nDane osoby: ");
                Guest.displayGuestInfo();
        }


        public void displayGuests()
        {
                for (_PartyManag_Guest tekst : guests) {
                        tekst.displayGuestInfo();
                        System.out.println();
                }
        }
}

