import java.util.Scanner;
public class candy  {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no of candies:");
        int n=s.nextInt();
        System.out.println("no of candies 1 customer orders at a time:");
        int c=s.nextInt();
        System.out.println("k:");
        int k=s.nextInt();
        int total=0;
        if(c>n){
            System.out.println("invalid input"); 
        }
        if(c<n){
             total=n-c;
        
            if( total<k){
                total=n;
            }
         System.out.println("no of candies sold:"+c);
         System.out.println("no of candies available:"+total);
        }
    }
}
