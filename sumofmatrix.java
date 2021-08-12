import java.util.*;

public class sumofmatrix{
        public static void main(String[] args){
                // int a[][]=new int[2][2];
                // int b[][]=new int[2][2];
                int a[][]={{1,2},{3,4}};
                int b[][]={{1,2},{3,4}};
                int c[][]=new int[2][2];
                for(int i=0;i<a[0].length;i++){
                        for(int j=0;j<a[1].length;j++){
                        c[i][j]=a[i][j]+b[i][j];
                }
                }
                System.out.print(c[0][1]);
        }
}