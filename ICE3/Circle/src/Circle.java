public class Circle {

    private double x,y,radius;

    public Circle(double radius)  {
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double computeArea() {
        return 3.14 * Math.pow(getRadius(),2);
    }

    public double computeCircumference() {
        return 2 * 3.14 * getRadius();
    }

    public void increaseRadius(double difference) {
        setRadius(getRadius() + difference);
    }

    public void move(double x, double y) {
        setX(x);
        setY(y);
    }

    public boolean overlapsWith(Circle otherCircle) {
        double v = Math.sqrt(Math.pow(getX() - otherCircle.getX(),2) + Math.pow(getY() - otherCircle.getY(),2));
        double radiiSum = getRadius() + otherCircle.getRadius();
        if (v < radiiSum) {
            return true;
        } else {
            return false;
        }
    }
}
