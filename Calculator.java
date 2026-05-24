import java .util.*;
class Calculator
{
    public static void main(String args[])
    {
        int m,n,ans;
        char op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of the m and n");
        m=sc.nextInt();
        n=sc.nextInt();
        System.out.println("enter the operator");
        op=sc.next().charAt(0);
        switch(op)
        {
            case '+':
            ans=m+n;
            System.out.println("the added value of m and n is:"+ans);
            break;
            case '-':
            ans=m-n;
            System.out.println("the subracted value of m and n is:"+ans);
            break;
            case '*':
            ans=m*n;
            System.out.println("the multiplied value of m and n is:"+ans);
            break;
            case '/':
            ans=m/n;
            System.out.println("the divided value of m and n is:"+ans);
            break;
            case '%':
            ans=m%n;
            System.out.println("the remainder value of m and n is:"+ans);
            break;
            default:
            System.out.println("Invalid operation");
        }
    }
}
        
        
        