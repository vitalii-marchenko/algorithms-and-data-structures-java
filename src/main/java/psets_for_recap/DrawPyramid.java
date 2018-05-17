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

    public static void main(String[] args) {
        //new DrawPyramid().drawStepsPyramid(5);
        new DrawPyramid().drawStepsPyramid2(5);
    }
}
