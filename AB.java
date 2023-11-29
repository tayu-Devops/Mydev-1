package data;

public class AB implements IntrA, IntrB {
	double f=0;
	int i;

	@Override
	public void Display()
	{
		for ( i=1;i<=10;i++)
		{
			 f= f+(i/2);
			 System.out.println("\n\t Fibbanacci series :" +f);
		}
		
		System.out.println("\n\t Praveen is Louda");

	}

	public static void main(String[] args) {
		AB obj=new AB();
		obj.Display();

	}

}
