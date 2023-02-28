// https://www.codechef.com/problems/TESTAVG
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
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int z = s.nextInt();
		    int avg1 = (x+y)/2;
		    int avg2 = (y+z)/2;
		    int avg3 = (x+z)/2;
		    if(avg1<35 || avg2<35 || avg3<35){
		        System.out.println("Fail");
		    }else{
		        System.out.println("Pass");
		    }
		}
	}
}
