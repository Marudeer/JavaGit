//Projekt1: Gra FizzBuzz;

public class _FizzBuzz  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        for (int i=1; i < 101; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println("FizzBuzz: " + i);
                continue;
            }
            else if (i % 3 == 0)
            {
                System.out.println("Fizz: " + i);
                continue;
            }
            else if (i % 5 == 0)
            {
                System.out.println("Buzz: " + i);
                continue;
            }

            System.out.println(i);

        }
    }
}

