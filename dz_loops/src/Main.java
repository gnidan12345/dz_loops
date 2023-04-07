public class Main {
    public static void main(String[] args) {

        for(int i =6 ; i >= 1; i--) {
           String  result  = "";

           for(int j=0; j < i;j++)  {
               result += "#";

           }

           System.out.println(i + result);
       }

        }

    }
