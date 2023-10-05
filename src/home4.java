//petla while
import java.util.Scanner;

public class home4  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Czesc\nPodaj swoj wiek: ");
        int age = scanner.nextInt();
        var name = "kamil";

        
        if (age >= 18)
        {
            System.out.println("Jestes pelnoletni");
        }
        else 
        {
            System.out.println("Nie jestes pelnoletni");
        }
    }
}

//slowa kluczowe Javy - na necie sa do znalezienia
