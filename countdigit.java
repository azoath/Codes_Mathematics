import java.util.*;

public class countdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int rem=0;

        while(num>0){
            num=num/10;
            rem++;

        }
        System.out.println(rem);
    }
    
}
