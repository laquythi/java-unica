package communityuni.com.model;

public abstract class Point {
    private int x;
    private int y;

    // constructor
    public Point() {
        super();
    }

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }


    // getter setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + "-" + this.y;
    }

    public abstract double getCircumference();
    public abstract double getArea();
}
