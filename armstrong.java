import java.util.Scanner;
public class armstrong{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int sum=0,temp=n,digits=0;
        while(temp>0){
          digits++;
          temp=temp/10;
      }
      temp=n;
      while(temp>0){
          int digit=temp%10;
          sum+=Math.pow(digit,digits);
          temp=temp/10;
      }
      if(sum==n){
           System.out.println("armstrong number");
      }else{
           System.out.println(" not armstrong number");
      }
    }
}
