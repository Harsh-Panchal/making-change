import java.io.*;
import java.util.*;
class editfile
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		String a = "y";
		int x;
		try
		{
			File f = new File("harsh.txt");
			RandomAccessFile rf = new RandomAccessFile(f,"rw");
			while(a.equals("y"))
			{
				for(int i=0;i<10;i++)
				{
					rf.seek(i*5);
					System.out.print(rf.readInt()+" ");
				}
				System.out.println("\nat which position ..?");
				x=input.nextInt();x--;
				rf.seek(x*5);
				rf.writeInt(input.nextInt());
				System.out.println("are u want to edit this ..?");
				a=input.next();
			}
		}
		catch(Exception e){}
	}
}