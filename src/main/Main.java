
package main;


public class Main {

   
    public static void main(String[] args) {
        
        Main main = new Main();
        
        System.out.println("factorial recursivo" + main.factorial(5));
        System.out.println("invertir numero " + main.invertirNumero(234));
        System.out.println("serie Fibinacci " + main.serieFibonacci(34));
        
        
    }
    
    
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else
            return num * factorial(num-1);
    }
    
    private static String invertirNumero(int num) {
        if(num<10){
            return String.valueOf(num);
        } else {
            return String.valueOf(num%10) + invertirNumero(num/10);
        }
    }
    
    
    private static int serieFibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return serieFibonacci(num-1) + serieFibonacci(num-2);
     }
    
}
