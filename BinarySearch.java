import java.util.Scanner;


public class BinarySearch {
	public static void main(String[] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("輸入欲搜索數字!!!!");
		int input=scanner.nextInt();
		int limit= 2147483647;
		if(input>limit/2+1)
		{
			search(limit/2+1,limit,input,0);

		}
		else {
			search(1,limit/2,input,0);

		}
		
		
		
	}
	static void search(int b,int e,int o,int c)
	{
		c++;
		if(b==o)
		{
			System.out.print("找到了!,花了"+c+"次");
		}
		
		else if(o>((e-b)/2+b))
		{
			search((e-b)/2+b+1, e, o,c);
			
		}
		else {
			search(b+1, (e-b)/2+b, o,c);
		}
		
	}

}
