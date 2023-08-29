import java.util.*;
public class Colours{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        // char b=sc.next().charAt(0); 
        if(c=='G'||c=='g'){
            System.out.println("Green");
        }
        else if(c=='V'||c=='v')
        {
            System.out.println("Violet");
        }
        else if(c=='Y'||c=='y')
        {
            System.out.println("Yellow");
        }
        else if(c=='B'||c=='b')
        {
            System.out.println("Blue");
        }
        else if(c=='O'||c=='o')
        {
            System.out.println("Orange");
        }else{
            System.out.print("-1");
        }
    }
}