//instrukcja if, warunki AND OR
import java.util.Scanner;

public class home3 { //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
    
    public static void main(String[] args) { //dla petli glownej musi byc main
    
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("Podaj imie: ");
        String nameLocal = scanner.nextLine();
        
            System.out.println("Czesc " + nameLocal);
        if (nameLocal.contains("du")&&nameLocal.contains("pa")||nameLocal.contains("apud"))
        {
            System.out.println("Jestes dupom.");
        }
        else if (!nameLocal.isEmpty()) 
        {  
            if (nameLocal.endsWith("a")){
               System.out.println("Jestes kobietom.");
            } 
            else if(nameLocal.startsWith("l")){
               System.out.println("Jestes lchujem");
            }
            else{
                System.out.println("Jestes mezczyznom.");
            }
        }
        else
        {
            System.out.println("Nie masz imienia lol");
        }
    }
}
