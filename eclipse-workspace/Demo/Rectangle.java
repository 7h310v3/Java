public class Rectangle {
    // private int upper_x, upper_y, lower_x, lower_y;
    private int upper_x;
    private int upper_y;
    private int lower_x;
    private int lower_y;

    // Khai bao cac thuoc tinh cua hinh chu nhat
    public Rectangle(int upper_x, int upper_y, int lower_x, int lower_y){
        this.upper_x = upper_x;
        this.upper_y = upper_y;
        this.lower_x = lower_x;
        this.lower_y = lower_y;
    }

    // Tinh chu vi hinh chu nhat
    public double calcPerimeter(){
        double result = 2*Math.abs(upper_x - lower_x)*Math.abs(upper_y - lower_y);
        return result;
    }

    // Tinh dien tich hinh chu nhat
    public double calcArea(){
        double result = Math.abs((upper_x - lower_x)*(upper_y - lower_y));
        return result;
    }

    // getter and setter upper_x
    public int get_upper_x(){
        return upper_x;
    }
    
    public void set_upper_x(int upper_x){
        this.upper_x = upper_x;
    }

    // getter and setter upper_y
    public int get_upper_y(){
        return upper_y;
    }
    
    public void set_upper_y(int upper_y){
        this.upper_y = upper_y;
    }

    // getter and setter lower_x
    public int get_lower_x(){
        return lower_x;
    }

    public void set_lower_x(int lower_x){
        this.lower_x = lower_x;
    }

    // getter and setter lower_y
    public int get_lower_y(){
        return lower_y;
    }

    public void set_lower_y(int lower_y){
        this.lower_y = lower_y;
    }
}

