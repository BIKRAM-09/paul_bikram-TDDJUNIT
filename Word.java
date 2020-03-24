import java.util.*;
class Word
{
   public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String :");
    String S = sc.next();
    
    int c=1;
    for(int i=0;i<S.length();i++)
    {
        char ch = S.charAt(i);
        if(c<=2)
        {
            if(ch=='A')
            {
                S=S.substring(0,i)+S.substring(i+1);
                i--;
            }
        }c++;
    }System.out.println(S);
}
}    