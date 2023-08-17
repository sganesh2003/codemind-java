import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int pro=1;
        for(int i = 1; i <= num; i ++)
        {
            pro *= i;
        }
        System.out.print(pro);
    }
}