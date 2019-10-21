public class API {

  public static void calculate_Roman(String[] input,int operation) throws IllegalArgumentException {
      try {
          int r1= RomanNumb.valueOf(input[0]).getNumber();
          int r2=RomanNumb.valueOf(input[1]).getNumber();
          RomanResult res = new RomanResult();
          System.out.println("Output:");
          switch (operation) {
              case (1): r1+=r2;
                     System.out.println(res.result.get(r1));
                  break;
              case (2):r1-=r2;
                  String str=res.result.get(Math.abs(r1));
                  if(r1<0) {
                      str = "-" + str;
                            }
                         System.out.println(str);
                  break;
              case (3): r1*=r2;
                  System.out.println(res.result.get(r1));
                  break;
              case (4):r1/=r2;
                  System.out.println(res.result.get(r1));
                  break;
          }
      }
      catch (IllegalArgumentException e){System.out.println("Неверный формат ввода");}

  }

    public static boolean calculate_Arabic(String[] input,int operation)  {
        int r1=0;
        int r2=0;
      if((Calculator.Arabic.get(input[0])!=null)&(Calculator.Arabic.get(input[1])!=null)) {
          r1 = Calculator.Arabic.get(input[0]);
          r2 = Calculator.Arabic.get(input[1]);

          switch (operation) {
              case (1):
                  System.out.println(r1 + r2);
                  break;
              case (2):
                  System.out.println(r1 - r2);
                  break;
              case (3):
                  System.out.println(r1 * r2);
                  break;
              case (4):
                  System.out.println(r1/r2);
                  break;
          }
      } else{return false;}
   return true;
    }
}
