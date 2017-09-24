import java.util.Scanner;

public class sh {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int val = scn.nextInt();
        System.out.println((Math.round(val*0.26418)*10)/10f);
    }
}
