package simplePrograms;

public class Calculator {
	public void cal(int n, int x, int y) 
	{ 
		int res = 0;
		switch(n)
		{
			case (1):
			{
				res = x+y;
				break;
			}
			case (2):
				{
					res = x-y;
				break;
				}
			case (3):
			{
				res = x*y;
				break;
			}
			case (4):
			{
				if(y!=0) {
				res = x/y;
				}
				else {
					System.out.println("Divison by 0 not possible");
				}
				break;	
			}
			default: 
			{
				System.out.println("Enter a valid choice");
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		System.out.println("Menu");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiple");
		System.out.println("4.Divide");
	obj.cal(4, 5, 0);	
	}
}
