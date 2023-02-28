// https://www.codechef.com/problems/RACE400M
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
		    int res = Math.min(x,Math.min(y,z));
		    
		    if(x==res){
		        System.out.println("ALICE");
		    }else if(y==res){
		        System.out.println("BOB");
		    }else{
		        System.out.println("CHARLIE");
		    }
		    
		  //  if(x<y){
		  //      if(x<z){
		  //          System.out.println("ALICE");
		  //      }else{
		  //          System.out.println("CHARLIE");
		  //      }
		  //  }
		  
		  //  else if(y<x){
		  //      if(y<z){
		  //          System.out.println("BOB");
		  //      }else{
		  //          System.out.println("CHARLIE");
		  //      }
		  //  }
		    
		}
	}
}
