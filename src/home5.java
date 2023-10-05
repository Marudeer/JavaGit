//laczenie stringow; operatory porownania, zmienne typu boolean

public class home5  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        String firstName = "Dupa";
        String lastName = "Zbita";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.length() < lastName.length());
        System.out.println(firstName.length() == lastName.length()); //operator przyrownania
        
    }
}

