package self_preparation.java_features.g_interfaces;

import java.util.ArrayList;
import java.util.List;

public class InterfacesExample {
    static interface WallBuilder {
        void buildWall();
    }

    static class РабочийРобот implements WallBuilder {
        public void buildWall() {
            System.out.println("Building from " + this.getClass().getName());
        }
    }

    static class РоботСторож implements WallBuilder {
        public void buildWall() {
            System.out.println("Building from " + this.getClass().getName());
        }
    }

    static class Поливалка {
        public void buildWall() {
            System.out.println("Building from " + this.getClass().getName());
        }

    }

    public static void main(String[] args) {
        //добавляем всех роботов в список
        List robots = new ArrayList();
        robots.add(new РабочийРобот());
        robots.add(new РоботСторож());
        robots.add(new Поливалка()); //do not works as Поливалка does not implement WallBuilder

        //строить стену, если есть такая способность
        for (Object robot: robots) {
            if (robot instanceof WallBuilder) {
                WallBuilder builder = (WallBuilder) robot;
                builder.buildWall();
            }
        }
    }
}
