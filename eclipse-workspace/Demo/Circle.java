// package eclipse-workspace.Demo;

public class Circle {
    private int radius;
    private int x, y;

    // Khai bao cac thuoc tinh cua hinh tron
    public Circle(int radius, int x, int y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }


    // Tinh chu vi hinh tron
    public double calcPerimeter(){
        double result = 2*Math.PI*this.radius;
        return result;
    }

    // Tinh dien tich hinh tron
    public double calcArea(){
        double result = Math.PI*this.radius*this.radius;
        return result;
    }

    
    // getter and setter Radius
    public int getRadius(){
        return radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
    }

    // getter and setter X
    public int getX(){
        return x;
    }
    
    public void setX(int x){
        this.x = x;
    }

    // getter and setter Y
    public int getY(){
        return y;
    }
    
    public void setY(int y){
        this.y = y;
    }
}
