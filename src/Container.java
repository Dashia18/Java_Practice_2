/**
 * Created by dbobkova on 24.10.2016.
 */
public class Container {
    //Methods


    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = -(x + width);
        this.y2 = -(y + height);
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }
    public int getWidth() {
        return Math.abs(x2-x1);
    }

    public int getHeight() {
        return Math.abs(y2-y1);
    }

    @Override
    public String toString() {
        return "Container{" +
                "(" + x1 +
                ", " + y1 +
                "), (" + x2 +
                ", " + y2 +
                ")}";
    }

    //Data
    private int x1;
    private int y1;
    private int x2;
    private int y2;
}
