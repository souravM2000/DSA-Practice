import pattern.StarPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StarPattern.nForest1(n);
        sc.close();
    }
}
