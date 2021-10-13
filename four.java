public class four {
    public static void main(String[] args)
    {
        for(int i  = 0; i < 9; i++)
        {
            for(int q = 8; q > i;q--) 
                System.out.print(" ");

            for(int l = 1; l < i;l++)
            {   
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            for(int m = 0; m < i;i++)
            { 
                System.out.print(" ");
                for(int n = 1; n < i;n++)
                {   
                    System.out.print("*");
                    System.out.print(" ");
                }
                    System.out.println();
                }
            }
            
        }
    }
}
