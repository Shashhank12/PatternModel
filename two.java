public class two {
    public static void main(String[] args)
    {
        for(int i  = 0; i < 9; i++)
        {
            for(int q = 8; q > i;q--) 
                System.out.print(" ");

            for(int l = 1; l < i;l++)
            System.out.print("*");

            
            System.out.println();
        }
    }
}
