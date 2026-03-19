import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // int i = 0;
        // while(i<5){
        //     System.out.println("Pallavi  @ Sharma");
        //    i++;
        // }

        // int i = 1 ;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }

        //  int i = 1 ;
        // while(i<= 100 ){
        //     System.out.print (i + " ");
        //     i++;
        // }

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int i = 1;
        // while(i<= n){
        //     System.out.print(i + " ");
        //     i++;
        // }


        // ?print sum of n natural number
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i =1; 
        while(i<= n){
            sum +=i; 
            //  sum = sum+i ;
            // System.out.print(sum +" ");
            i++;
        }
         System.out.print(sum +" ");

 

         
    }
}
