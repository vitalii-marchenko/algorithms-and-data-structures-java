package self_preparation.java_features.o_object_methods;

public class Example {

    static class Point implements Cloneable {
        int x;
        int y;

        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Point2 {
        int x;
        int y;

        public Object clone() {
            Point point = new Point();
            point.x = this.x;
            point.y = this.y;
            return point;
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);

        Integer int1 = new Integer(2);
        Integer int2 = int1;

        System.out.println(i1 == i2);
        System.out.println(int1 == int2);
        
        Point p = new Point();
        Object clone = p.clone();

    }
}
