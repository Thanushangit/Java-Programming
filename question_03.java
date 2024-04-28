import java.util.Scanner;
public class question_03 {
    public static void main(String[]args){

        Scanner demo=new Scanner(System.in);
        double usinput;
        int narrow;
        System.out.print("Enter your number as a Float:");
        usinput=demo.nextDouble();
        narrow=(int) usinput;
        System.out.println("Narrowcasted number: "+ narrow);
    }
}
