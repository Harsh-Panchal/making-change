class return_data
{
	static public int[] ret(int y)
	{
		int a[] = return_status.ret(y);
		int dx[]= {1,2,5,10,20,50,100,200,500,2000};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				count++;
			}
		}
		int[] d =new int[count];
		count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				d[count++]=dx[i];
			}
		}
		return d;
	}
}