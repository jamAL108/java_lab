import java.util.*;
class calculation{
    void triangle(double height , double base){
        double ans = 0.5*height*base;
        System.out.println("the area of triangle is:"+ ans);
    }
    
    void circle(double radius){
        double ans = 3.14*radius*radius;
        System.out.println("the area of circle is:"+ ans);
    }

}

public class exp14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height:");
        int length = sc.nextInt();
        System.out.println("enter the base:");
        int breadth = sc.nextInt();
        System.out.println("enter the radius:");
        int side = sc.nextInt();
        calculation obj = new calculation();
        obj.triangle(height,base);
        obj.circle(radius);
    }
}
