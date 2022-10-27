
class Rectangle
{
    static void print_rectangle(int k, int l)
    {
        int a, b; //a vertical line , b horizontal line
        for (a = 1; a <= k; a++) 
		{
            
            for (b = 1; b <= l; b++) 
			{
                // over rows and columns positions
				// 1a is for left side 2a is for upper side b is for downward and anotther b is for right one
                if (a == 1 || a == k || b == 1 || b == l)
				{
                    System.out.print("*");
				}
                else
				{
                     System.out.print(" ");
				}
            }
            System.out.println();
        }
    }
 
    public static void main(String args[])
    {
        // Declaring and initializing rows and columns for square row = columns
        int rows = 8, columns = 22;
 
        print_rectangle(rows, columns);
    }
}