package Question11_6;

/**
 * Created by SiyuanZeng's on 10/13/2014.
 */
public class Position {
    private int x = -1;
    private int y = -1;

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
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
