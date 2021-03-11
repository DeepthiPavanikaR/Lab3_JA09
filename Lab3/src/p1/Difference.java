package p1;

public class Difference {
	public static int modifyNumber(int number1)
	{
		int diff = 0;
		String s = Integer.toString(number1);
		for(int i=0; i<(s.length()-1); i++ )
		{
			char ch = s.charAt(i);
			char ch2 = s.charAt(i+1);
			int a=Integer.parseInt(String.valueOf(ch));
			int a1=Integer.parseInt(String.valueOf(ch2));
			diff = a -a1;
			int diff1 = Math.abs(diff);
			StringBuffer sb=new StringBuffer("");
		    sb.append(diff1);
		    String str = sb.toString();
			int ap = Integer.valueOf(str);
			System.out.println(ap);
		}
		char ch3 = s.charAt(s.length()-1);
		int a2=Integer.parseInt(String.valueOf(ch3));
		return a2;
}
public static void main(String args[])
	 {
	    int n1=24786;
		System.out.print(modifyNumber(n1));
	   
	 }
}
