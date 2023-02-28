// https://www.codechef.com/problems/EXPERT
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    float x = s.nextInt();
		    float y = s.nextInt();
		    float z = x/2;
		    if(y>=z){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
