package simplePrograms;

public class compare {
	
	
	public void comp(int x,int y, int z) {
		
		if(x>y) {
			
			if(x>z) {
			System.out.println("X is greatest");
			}
			else
			{
				System.out.println("Z is greatest");
			}
		}
		
		else
		{
		   if(y>z)
		   {
			   System.out.println("Y is greatest");
		   }
		   else
		   {
			   System.out.println("Z is greatest");
		   }
			   
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		compare obj = new compare();
		obj.comp(15, 25, 10);
		
	}

}
