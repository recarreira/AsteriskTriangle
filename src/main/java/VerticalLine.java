/**
 * Created by rcarreira on 1/8/15.
 */
public class VerticalLine {
    public static void main(String[] args) {
        createVerticalLine(8);
    }

    public static void createVerticalLine(int numberOfAsterisks){
        for (int i = 0; i < numberOfAsterisks ; i++) {
            System.out.println("*");
        }
    }
}
