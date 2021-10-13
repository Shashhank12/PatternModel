public class five {
    public static void main(String[] args) 
    {
	    for(int i = 1;i < 8;i++) 
			{
				for(int a = 8;a >= i; a--)
	      {
					System.out.print(" ");
	      }
				
				for(int q = 0;q < i;q++) {
					System.out.print("*");
					System.out.print(" ");
				}
					
					System.out.println();
			}
	    for(int i = 1;i < 7;i++) 
			{
				for(int a = 6;a >= 5-i; a--)
	      {
					System.out.print(" ");
	      }
				
				for(int q = 7;q > i;q--) {
					System.out.print("*");
					System.out.print(" ");
				}
					
					System.out.println();
			}
    }
}
