//break; oraz continue;

public class home8  //nazwa klasy glownej musi zgadzac sie z nazwa pliku, inaczej nie zadziala
{ 
    public static void main(String[] args) //dla petli glownej musi byc main
    {
      for (int i=1; i<=10; i++)
      {
          if (i==4)
          {
            continue;
          }
          if (i==7)
            {
              break;
            }
            System.out.println("Nr. " + i + ": Dupa ");
      }
    }
}

