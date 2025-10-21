import java.util.Arrays;

public class Main {

    static void main() {
        int[] grades = {29, 37, 38, 41, 84, 67};
        System.out.println(Arrays.toString(Noten.getFailingGrades(grades)));
        System.out.println(Noten.getAverage(grades));
        System.out.println(Arrays.toString(Noten.getRoundedGrades(grades)));
        System.out.println(Noten.getMaxRoundedGrade(grades));
    }
}
