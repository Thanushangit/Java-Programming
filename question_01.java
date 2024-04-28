import java.util.Scanner;
public class question_01 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String title;
        String auname;
        int year;
        int price;

        System.out.println("Enter the book title");
        title=in.nextLine();
        System.out.println("Enter the Author name");
        auname=in.nextLine();
        System.out.println("Enter the publication year");
        year=in.nextInt();
        System.out.println("Enter the Price");
        price=in.nextInt();

        System.out.println("Book details:");
        System.out.println("***********************");
        System.out.println("Title: "+title);
        System.out.println("Author: "+auname);
        System.out.println("publication year: "+year);
        System.out.println("price: "+price);
        System.out.println("***********************");





    }
}
