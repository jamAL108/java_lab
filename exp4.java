public class exp4 {
    void area(double length , double breadth){
        double ans = length*breadth;
        System.out.println("the area of rectangle is:"+ ans);
    }
    
    void area(int side){
        double ans = side*side;
        System.out.println("the area of square is:"+ ans);
    }
    void area(int height , int base){
        double ans = 0.5*height*base;
        System.out.println("the area of rectangle is:"+ ans);
    }
    
    void area(double radius){
        double ans = 3.14*radius*radius ;
        System.out.println("the area of square is:"+ ans);
    }


    public static void main(String[] args) {
        exp4 obj = new exp4();
        obj.area(4.4,3.4);
        obj.area(4);
        obj.area(2,5);
        obj.area(23.4);
    }
}
