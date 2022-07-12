package chat;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1
{
	public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(System.in);
        System.out.print("input : ");
        String n = sc.next();
        String result = "";

        for (int i = 0; i < n.length(); i++){
            char c = n.charAt(i);
            
            if(c=='6')
            { 
            	
            	//here i want change the value present inside the string it will change only once so i check
            	//the string 
               result  = n.substring(0, i) + '9' + n.substring(i + 1);
               
               //n.substring(0,1) ->9 and add 9 and add index value of 2 so it will add 69
               //result is ==== 
                break; // break the loop if 6 is changed to 9
            }
        }
        System.out.println("output : "+result);
    }



}
