import java.util.*;
class BinarySearchAlgorithm
{
	
	public static void main(String[] args)
	 {
	 	boolean foundB = true;
		int num[] = new int[5];
		int found = 0, search;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		for (int i = 0; i < num.length; i++ )
		 {
			num[i] = sc.nextInt();

		}
		System.out.print("Enter Number to search: ");
		search = sc.nextInt();
		for(int i = 0; i < num.length; i++ )
		 {
			if(num[i] == search)
			{
				found = found + 1;
			
			}
		}
		if(found == 1)

		 {
			System.out.println("Number Exist!");
		 }

		else
		{
			System.out.println("Number is not Exist");
		}

	}



}