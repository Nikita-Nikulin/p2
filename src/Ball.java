public class Ball {

    String type;
    int radius;
    String color;




    public String toString() {
        String s = "Type of the Ball - " + type + '\n' + "Radius = " + radius +'\n' + "Color - " + color;
        return s;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setType(String type) {this.type = type;

    }
}
