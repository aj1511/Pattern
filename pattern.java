import java.util.*;
public class pattern {
	public static void main(String[] args) {
	
	int x,n,i=5,y=1;
	for (x=1;x<i;x++)
	{
		for(n=1;n<=x;n++) {
			System.out.print(y+" ");
			y++;}
		System.out.println();
	}
	for(x=i;x>=1;x--)
	{
		for(n=x;n>=1;n--) 
		
			{
			System.out.print(y+" ");
			y++;}
		System.out.println();
	}
	}
}
