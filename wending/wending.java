import java.util.*;
class wending
{
	private static int q=0;
	private static int m=10;
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the amount = ");
		int x = input.nextInt();
		int y = min(x);
		System.out.println(" y = "+y);
		display("",x,y,0,0);
	}
	static int min(int x)
	{
		//int d[]= {1,2,5,10,20,50,100,200,500,2000};
		int d[]=return_data.ret(x);
		int a[][] = new int[d.length][x+1];
		for(int i=0;i<d.length;i++)
		{
			a[i][0]=0;
			for(int j=1;j<=x;j++)
			{
				if (i==0 && j<d[i])
				{
					a[i][j]=9999;
				}
				else if(i==0)
				{
					a[i][j]=1+a[0][j-d[0]];
				}
				else if(j<d[i])
				{
					a[i][j]= a[i-1][j];
				}
				else
				{
					a[i][j]=min(a[i-1][j],1+a[i][j-d[i]]);
				}
			}
		}
		return a[(d.length)-1][x];
	}
	static int min(int b, int c)
	{
		if(b<=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	static void display(String s, int x,int y, int sum , int count)
	{
		String as;
		int[] aa = return_status.ret(x);
		if (sum<=x && count<=y && q==0)
		{
			if(sum==x && count==y)
			{
				q=1;
				pro(s,x);
			}
			else
			{
				if((sum+2000)<=x && aa[9]!=0)
				{
					as=s.concat("2000 ");
					display(as,x,y,sum+2000,count+1);
				}
				if((sum+500)<=x && aa[8]!=0)
				{
					as=s.concat("500 ");
					display(as,x,y,sum+500,count+1);
				}
				if((sum+200)<=x && aa[7]!=0)
				{
					as=s.concat("200 ");
					display(as,x,y,sum+200,count+1);
				}
				if((sum+100)<=x && aa[6]!=0)
				{
					as=s.concat("100 ");
					display(as,x,y,sum+100,count+1);
				}
				if((sum+50)<=x && aa[5]!=0)
				{
					as=s.concat("50 ");
					display(as,x,y,sum+50,count+1);
				}
				if((sum+20)<=x && aa[4]!=0)
				{
					as=s.concat("20 ");
					display(as,x,y,sum+20,count+1);
				}
				if((sum+10)<=x && aa[3]!=0)
				{
					as=s.concat("10 ");
					display(as,x,y,sum+10,count+1);
				}
				if((sum+5)<=x && aa[2]!=0)
				{
					as=s.concat("5 ");
					display(as,x,y,sum+5,count+1);
				}
				if((sum+2)<=x && aa[1]!=0)
				{
					as=s.concat("2 ");
					display(as,x,y,sum+2,count+1);
				}
				if((sum+1)<=x && aa[0]!=0)
				{
					as=s.concat("1 ");
					display(as,x,y,sum+1,count+1);
				}
			}
		}
		
	}
	static void pro(String s,int x)
	{
		 int a[]= new int[m];
		 String w = new String();
		 char c;
		 int j=0;
		 int b= s.length();
		 for(int i=0;i<b;i++)
		 {
			 c=s.charAt(i);
			if(c==' ')
			{
				j = Integer.parseInt(w);
				w="";
				if(j==2000)
					a[9]++;
				else if(j==500)
					a[8]++;
				else if(j==200)
					a[7]++;
				else if(j==100)
					a[6]++;
				else if(j==50)
					a[5]++;
				else if(j==20)
					a[4]++;
				else if(j==10)
					a[3]++;
				else if(j==5)
					a[2]++;
				else if(j==2)
					a[1]++;
				else if(j==1)
					a[0]++;
			}
			else
			{
				w=w.concat(Character.toString(c));
			}
		 }
		 int d[]= {1,2,5,10,20,50,100,200,500,2000};
		 int[] qa = return_status.ret(x);
		 for (int i=0;i<m;i++)
		 {
			// System.out.println(qa[i]);
			 if(qa[i]==1 && a[i]!=0)
			 {
				System.out.println("   " +d[i]+"  *  "+a[i] + "= "+(d[i]*a[i]));
			 }
		 }
	}
	
}