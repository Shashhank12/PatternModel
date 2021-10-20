public class six 
{
  public static void main(String[] args) 
    {
        for(int i = 0; i < 4; i++) 
        {
            if(i % 3 == 0)
                for(int t = 0; t < 4; t++)
                    System.out.print("*");
                else 
                {
                    System.out.print("*");
                    for(int l = 0;l < 2;l++)
                        System.out.print(" ");
                    System.out.print("*");   
                }
            System.out.println();
        }
    }
}

