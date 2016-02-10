
public class Assignment2 {
	public static void main(String[] args)
	{
		int count=0;                            // Declaring the count as Integer datatype
		for(int d = 2 ;d < 1000000; d= d + 1)   // Intilaizing "for" loop
		{
			if(d % 9==0)
			{
				count= count + 1;
			}
		}
		int num = 0;
		for(int e = 2 ;e < 1000000; e= e + 1)   // Intilaizing "for" loop
		{
			if(e % 13==0)
			{
				num= num + 1;
			}
		}
		int dec =0;
		for(int f = 2 ;f < 1000000; f= f + 1)   // Intilaizing "for" loop
		{
			if(f % 27==0)
			{
				dec= dec + 1;
			}
		}
		int step = 0;
		for(int g = 2 ;g < 1000000; g= g + 1)   // Intilaizing "for" loop
		{
			if(g % 81==0)
			{
				step= step + 1;
			}
			
		}
		System.out.println("Total number of number divisible by 9 are :" + count);
		System.out.println("Total number of number divisible by 13 are :" + num);
		System.out.println("Total number of number divisible by 27 are :" + dec);
		System.out.println("Total number of number divisible by 81 are :" + step);
		int total= count + num + dec + step;
		System.out.println("Total number of number of numbers divisible by 9, 13,27 or "
				+ "81 are :" + total);
	}

}


