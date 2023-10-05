//deklaracja zmiennych
import java.util.Scanner;

public class home2 { //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
    
    public static void main(String[] args) { //dla petli glownej musi byc main
        System.out.println("Czesc Damian");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Czesc " + name);
    }
}
