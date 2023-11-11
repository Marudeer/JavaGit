//Struktury danych: tablice;


public class home9  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
        /*
        String[] names = new String[4];
        
        names[0] = "Mariusz";
        names[1] = "Dominik";
        names[2] = "Kasia";
        names[3] = "Asia";

        */
        String[] names = {"Mariusz", "Dominik", "Kasia", "Asia", "Dupa"};
        names[2] = "Rafal";

        /*
        for (int i = 0; i <names.length; i++)
        {
            System.out.println(names[i]);
        }

*/
        for (String name: names) //dla każdego elementu tablicy "names" stwórz zmienną typu string o nazwie
                                //"name" i wykonaj to, co pętla FOR ma w instrukcji.
        {
            System.out.println(name);
        }

    }
}

