package Moon7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) throws IOException {
//        Scanner input1=new Scanner(System.in);
//        String s=input1.nextLine();
//        System.out.println(s);
//        input1.close();
        BufferedReader input2 =new BufferedReader(new InputStreamReader(System.in));
        String a =input2.readLine();
        System.out.println(a);
    }
}
