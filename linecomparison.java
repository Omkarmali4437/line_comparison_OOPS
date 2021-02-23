import java.util.Scanner;

public class linecomparison {
	public int length() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter x1 co-ordinate: ");
		int x1=scan.nextInt();
		System.out.println("Enter y1 co-ordinate: ");
		int y1=scan.nextInt();
		System.out.println("Enter x2 co-ordinate: ");
		int x2=scan.nextInt();
		System.out.println("Enter y2 co-ordinate: ");
		int y2=scan.nextInt();
		int length=(int)Math.sqrt((Math.pow(x2-x1,2)) + (Math.pow(y2-y1,2)));
		return length;
	}
	public void compare(int firstline,int secondline){
		String first=Integer.toString(firstline);
		String second=Integer.toString(secondline);
		int com=first.compareTo(second);
		if(com>=1)
		{
			System.out.println("First line length is greater than Second line");
		}
		else if(com<0)
		{
			 System.out.println("Second line length is greater than First line");

		}
	}

	public static void main(String[] args){
		System.out.println("Welcome to Line Comparison Problem using OOPS concept");
		linecomparison lc=new linecomparison();
		int firstline=lc.length();
		System.out.println("Lenth of first line is: "+firstline);
		int secondline=lc.length();
		System.out.println("Lenth of first line is: "+secondline);

		lc.compare(firstline,secondline);
	}
}
