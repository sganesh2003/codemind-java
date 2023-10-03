import java.util.*;
public class Test{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=6*n*n;
        int v = n * n * n;
        System.out.printf("Surface area = " + c + " and Volume = " + v);
    }
}