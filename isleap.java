import java.util.*;
//leap year calculator.

public class isleap{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                int year=sc.nextInt();
                System.out.print(checkleap(year));
        }
        static boolean checkleap(int year){
                if(year%400==0)
                        return true;
                else if(year%100==0)
                        return false;
                else if(year%4==0)
                        return true;
                return false;
        }
}