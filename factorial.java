import java.util.*;

public class factorial {

    int factorial(int num){
        if(num==0 || num==1){
            return 1;
        }
        else{
            return (num* factorial(num-1));
        }
        


        }
    public static void main(String args[]){

        //using loop
    
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        if( n==0 || n==1){
            System.out.println("factorial= 1");
        }
        else{
            for(int i=1;i<=n;i++){
                fact= fact*i;
                System.out.println(fact);
            }
        }

        //using reccursion
        
        int number=sc.nextInt();
        int result=1;
        result=factorial(number);
        System.out.println(result);

        
        
    }
}
