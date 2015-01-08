/**
 * Created by rcarreira on 1/8/15.
 */
public class HorizontalLine {
    public static void main(String[] args) {
        createHorizontalLine(8);
    }

    public static void createHorizontalLine(int numberOfAsterisks){
        for (int i = 0; i <= numberOfAsterisks; i++){
            System.out.print("*");
        }
    }
}
