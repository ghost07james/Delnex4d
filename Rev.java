import java.util.*;

class Rev
{
	public static void main(String [] args)
{
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the String");
	String S = sc.nextLine();
	String Z = " ";
	for(int i=S.length()-1;i>=0;i--)
	{
		Z= Z+ S.charAt(i);
	}
	System.out.println("Reverse of the Input String is " + Z);
	int cons =0;
	int vow = 0;
	Z=Z.toLowerCase();
	for(int j=0;j<Z.length();j++)
	{
		if(Z.charAt(j)=='a' ||Z.charAt(j)=='e' ||Z.charAt(j)=='i' ||Z.charAt(j)=='o' ||Z.charAt(j)=='u' )
		{
			vow++;
		}
		else if (Z.charAt(j)=='b' ||Z.charAt(j)=='c' ||Z.charAt(j)=='d' ||Z.charAt(j)=='f' ||Z.charAt(j)=='g' ||Z.charAt(j)=='h' ||Z.charAt(j)=='j' ||Z.charAt(j)=='k' ||Z.charAt(j)=='l' ||Z.charAt(j)=='m' ||Z.charAt(j)=='n' ||Z.charAt(j)=='p' ||Z.charAt(j)=='q' ||Z.charAt(j)=='r' ||Z.charAt(j)=='s' ||Z.charAt(j)=='t' ||Z.charAt(j)=='v' ||Z.charAt(j)=='w' ||Z.charAt(j)=='x' ||Z.charAt(j)=='y' ||Z.charAt(j)=='z')
		{
			cons++;
		}
	}
	System.out.println("The number of vowels is " + vow +" and the number of consonants is "+cons );
}
}