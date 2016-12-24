package Session1;

//(if e to affected with original b value then calculate the e=a&b first and rest later)


public class Assignment_2 {

	public static void main(String args[])
	{
		int a=20;
		int b= a-- - --a;
		int c=a--;
		int d=a>>2;
		int e=a&b;
		System.out.println("Values are b="+b+" c="+c+" d="+d+ " e="+e);

	}
}
// other virsion is below
/*


public class Assignment_2 {

	public static void main(String args[])
	{
		int e=a&b;
		int a=20;
		int b= a-- - --a;
		int c=a--;
		int d=a>>2;
		
		System.out.println("Values are b="+b+" c="+c+" d="+d+ " e="+e);

	}
}
