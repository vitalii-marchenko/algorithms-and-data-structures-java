package psets_for_recap;

public class DrawPyramid {

    public void drawStepsPyramid(int steps) {
        int numOfCells = 0;
        for (int i = 0; i < steps; i++) {
            for (int j = 0; j <= numOfCells; j++) {
                System.out.print("#");
            }
            System.out.println();
            numOfCells++;
            if (numOfCells == steps) {
                break;
            }
        }
    }

    public void drawStepsPyramid2(int steps) {
        for (int row = 0; row < steps; row++) {
            String stair = "";
            for (int column = 0; column < steps; column++) {
                if (column <= row) {
                    stair += "#";
                } else {
                    stair += " ";
                }
            }
            System.out.println(stair);
        }
    }

    public void drawStepsPyramid3(int steps) {
        for (int i = 1; i <= steps; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public void drawStepsPyramid4(int steps) {
        String s = "";
        for (int i = 1; i <= steps; i++) {
            s += "#";
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        //new DrawPyramid().drawStepsPyramid(5);
        //new DrawPyramid().drawStepsPyramid2(5);
        new DrawPyramid().drawStepsPyramid4(5);
    }
}
