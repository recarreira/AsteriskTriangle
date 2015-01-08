/**
 * Created by rcarreira on 1/8/15.
 */
public class RightTriangle {

    public static void main(String[] args) {
        createRightTriangle(3);
    }
    public static void createRightTriangle(int number){
        HorizontalLine horizontal = new HorizontalLine();

        for (int i = 0; i < number; i++) {
            horizontal.createHorizontalLine(i);
            System.out.print("\n");
        }
    }
}

