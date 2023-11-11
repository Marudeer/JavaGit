//Tworzymy klase guest;

public class _PartyManag_Guest  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
        private String name;
        private String meal;
        private int phoneNumber;
        private boolean isVegan;

        public _PartyManag_Guest(String name, String meal, int phoneNumber, boolean isVegan)
        {
                this.name = name;
                this.meal = meal;
                this.phoneNumber = phoneNumber;
                this. isVegan = isVegan;
        }

        public String getName()
        {
                return name;
        }

        public String getMeal()
        {
                return meal;
        }

        public int getPhoneNumber()
        {
                return phoneNumber;
        }

        public boolean getIsVegan()
        {
                return isVegan;
        }

        public void displayGuestInfo()
        {
                System.out.println("Imię: " + name);
                System.out.println("Posiłek: " + meal);
                System.out.println(" Nr telefonu: " + phoneNumber);
                System.out.println("Czy weganin: " + isVegan);
        }
}

