import java.util.*;

public class exp12{
    public static void main(String[] args){
        int marks;
        System.out.println("enter the marks:");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        marks = marks/10;
        switch(marks){
            case 1:
            System.out.println("fail");
            break;
            case 2:
            System.out.println("fail");
             break;
            case 3:
            System.out.println("fail");
             break;
            case 4:
            System.out.println("C grade");
             break;
            case 5:
            System.out.println("C grade"); 
            break;
            case 6:
            System.out.println("B grade");
             break;
            case 7:
            System.out.println("B grade"); 
            break;
            case 8:
            System.out.println("A grade"); 
            break;
            case 9:
            System.out.println("A grade");
             break;
            case 10:
            System.out.println("A grade");
             break;

        }
    }
}
