import java.util.Vector;

public class Vector3D {
    private double x;
    private double y;
    private double z;

    Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ() {
        return z;
    }
    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(2.0, 3.0, 4.0);
        System.out.println(vector.getX());
        System.out.println(vector);
    }
}
