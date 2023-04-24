import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn= new Scanner (System.in);
        int n =scn.nextInt();
        int fc= factorial(n);
        System.out.println(fc);
    }

    public static int factorial(int n){
        if(n==1){
           return 1;
            
        }
        int rj=n*factorial(n-1);
        return rj;
    }

}
