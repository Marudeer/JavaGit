//Projekt2: Odgadywanie liczby wylosowanej przez komputer;

import java.util.Random;
import java.util.Scanner;
public class _RandNum  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        Random random = new Random();
        Scanner kutas = new Scanner(System.in);

        int numberToGuess = random.nextInt(100)+1;
        boolean wasNumberGuessed = false;

        while (!wasNumberGuessed)
        {
            System.out.println("Podaj liczbe: ");
            kutas.nextInt();
            
            if (kutas.nextInt() < numberToGuess)
            {
                System.out.println("Cyfra za mala, sprobuj ponownie.");
            }
            else if (kutas.nextInt() > numberToGuess)
                        {
                System.out.println("Cyfra za duza, sprobuj ponownie.");
            }
            else   
            {
                System.out.println("Brawo. :)");
                wasNumberGuessed = true;
            }
        }

    }
}

