import java.util.HashMap;
import java.util.Scanner;

public class Calculator {

public static HashMap<String,Integer>Arabic=new HashMap<String, Integer>();


  public static void main(String[] args) throws IllegalArgumentException{
        String[] input;
        int operation;
     for(int i=1;i<11;i++)Arabic.put(Integer.toString(i),i);

   Scanner in = new Scanner(System.in);

   System.out.println("Input: ");

    String str = in.nextLine();

        if(str.contains("+")){
                        input=str.trim().split("\\+");
                        operation=1;
                             }
        else if(str.contains("-")){
                         input=str.trim().split("-");
                         operation=2;
                                   }
        else if(str.contains("*")){
                          input=str.trim().split("\\*");
                          operation=3;
                                   }
        else if(str.contains("/")){
                           input=str.trim().split("/");
                           operation=4;}
        else{throw new IllegalArgumentException("Неверный формат ввода");}

       if(input.length!=2){throw new IllegalArgumentException("Неверный формат ввода");}

        if(!API.calculate_Arabic(input,operation)){
                     API.calculate_Roman(input,operation);
                                                   }
 in.close();
    }
}
