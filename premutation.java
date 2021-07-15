package premutationofstring;

//Java program to check whether two strings are
//Permutations of each other
import java.util.*;
class premutation {

/* function to check whether two strings are
Permutation of each other */
static boolean arePermutation(String str1, String str2)
{
	// Get lenghts of both strings
	int n1 = str1.length();
	int n2 = str2.length();

	// If length of both strings is not same,
	// then they cannot be Permutation
	if (n1 != n2)
	return false;
	char ch1[] = str1.toCharArray();
	char ch2[] = str2.toCharArray();

	// Sort both strings
	Arrays.sort(ch1);
	Arrays.sort(ch2);


	// Compare sorted strings
	for (int i = 0; i < n1; i++)
	if (ch1[i] != ch2[i])
		return false;

	return true;
}
static boolean secondcase(String str3,String str4)
{

	int n3 = str3.length();
	int n4 = str4.length();

	// If length of both strings is not same,
	// then they cannot be Permutation
	if (n3 != n4)
	return false;
	char ch3[] = str3.toCharArray();
	char ch4[] = str4.toCharArray();

	// Sort both strings
	Arrays.sort(ch3);
	Arrays.sort(ch4);

	// Compare sorted strings
	for (int i = 0; i < n3; i++)
	if (ch3[i] != ch4[i])
		return false;

	return true;
}
/* Driver program to test to print printDups*/
public static void main(String[] args)
{
	String str1 = "prepbytes";
	String str2 = "bytesprep";
	String str3="jgec";
	String str4="cgec";
	if (arePermutation(str1, str2))
	System.out.println("Yes");
	else
	System.out.println("No");
	if (secondcase(str3, str4))
	System.out.println("Yes");
	else
	System.out.println("No");

}
}

