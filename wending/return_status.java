import java.io.*;
class return_status
{
	public static int[] ret(int y)
	{
		int[] status=new int[10];
		try
		{
			File f = new File("harsh.txt");
			RandomAccessFile rf = new RandomAccessFile(f,"r");
			int dx[]= {1,2,5,10,20,50,100,200,500,2000};
			int x,j=0;
			int a[];
			for(int i=9;i>=0;i--)
			{
				status[i]=0;
				rf.seek(i*5);
				x=rf.readInt();
				x=x*dx[i];
				if(x>=y)
				{
					status[i]=1;
					break;
				}
			}
			for(int i=9;i>0;i--)
			{
				if(status[i]==1)
				{
					status[i-1]=1;
				}
			}
			for(int i=0;i<10;i++)
			{
				rf.seek(i*5);
				if(rf.readInt()==0)
				{
					status[i]=0;
				}
			}
		}
		catch(Exception e){}
		return status;
	}
}