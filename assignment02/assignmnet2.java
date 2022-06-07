package assignment02;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class assignmnet2 {
    
    //defaults constructor...
    public assignmnet2(){
    }
    ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> arr){
        Collections.sort(arr,Collections.reverseOrder());
        return arr;
    }

    public static void main(String[] args) {
        //using try-catch block....
        
        try (Scanner sc = new Scanner(System.in)) {
            ArrayList<BigInteger> arr = new ArrayList<BigInteger>();
            System.out.println("Enter the number of elements:");
            int g = sc.nextInt();
            for(int i=0;i<g;i++) {
            	System.out.println("Enter no: ");
            	arr.add(sc.nextBigInteger());
            }
            System.out.println("Before sorting: ");
            System.out.println(arr);
            System.out.println("After sorting:");
            assignmnet2 obj = new assignmnet2();
            obj.arrayListSortDesc(arr);
            System.out.println(arr);
   
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
