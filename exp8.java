import java.util.*;

class circle{
    double r;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of sphere");
        r=sc.nextInt();
        System.out.println("The radius is" + r);
    }
   }
class area extends circle{
    double area;
      void area(){
          area = 3.14*r*r;
          System.out.println("the area of circle is"+area);
      }
}
class volume extends area {
    double volume;
    void volume(){
        volume =(4/3)*3.14*r*r*r;
        System.out.println("the volume of sphere is"+volume);
    }
}
public class exp8 {
    public static void main(String[] args) {
        volume obj = new volume();
        obj.input();
        obj.area();
        obj.volume();
    }
}
