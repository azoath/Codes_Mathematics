import java.util.*;

public class palindromeNum {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int p= sc.nextInt();
        int temp=p;
        int rem;
        int q=0;

        while(p>0){
            rem= temp%10;
            q= q*10+rem;
            temp=temp/10; 

        }
        if(p == q){
            System.out.println("given number"+p+" is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

        
    }
    
}
