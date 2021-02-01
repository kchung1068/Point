public class Point {

public int x;
public int y;

public double getX() {
    return (double)(x);

}
public double getY() {
    return (double)(y);
}
public void setLocation(int x, int y) {
this.x = x;
this.y = y;
}
public void translate(int dx, int dy) {
 x += (dx);
 y += (dy);
}
public String toString() {

    return "("+ x + "," + y + ")";
}

}
