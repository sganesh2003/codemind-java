import java.util.*;
public class Main{
public static void main(String[] args){
    Scanner inp=new Scanner(System.in);
    int num=inp.nextInt();
    int count=0;
    for(int i=1;i<=num;i++)
    {
        if(num%i==0)
        count++;
    }
    if(count==2)
    {
        System.out.print("Prime");
    }
    else{
        System.out.print("Not Prime");
    }
}
}