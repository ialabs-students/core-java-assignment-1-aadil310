package assignment03;

import java.util.Scanner;

public class assinment03{
    public static void main(String[] args) {
        System.out.println("enter number");
        try (Scanner sc = new Scanner(System.in)) {
            int object=sc.nextInt();
            // for string ----
            //String a = sc.nextLine();
            convertToWrapper(object);  //for integer
            //convertToWrapper(a);    
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static Integer convertToWrapper(int object) {
        Integer abc = Integer.valueOf(object);
        System.out.println(abc);
        if(abc instanceof Integer){
            System.out.println("Converted value is "+ abc);
        }
        else {
            System.out.println("give proper input");
        }
        return abc;
    }
    
}
