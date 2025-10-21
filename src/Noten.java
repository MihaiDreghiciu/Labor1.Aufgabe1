public class Noten {

    public static int[] getFailingGrades(int[] grades) {
        int count = 0;

        for (int g : grades) {
            if (g < 40)
                count++;
        }

        int[] result = new int[count];
        int index = 0;

        for (int g : grades) {
            if (g < 40)
                result[index++] = g;
        }

        return result;
    }

    public static double getAverage(int[] grades) {
        int sum = 0;

        for (int g : grades)
            sum += g;

        return Math.round((sum * 100.0 / grades.length)) / 100.0;
    }

    public static int[] getRoundedGrades(int[] grades) {
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade >= 38) {
                int next = ((grade / 5) + 1) * 5;
                if (next - grade < 3)
                    grade = next;
            }
            result[i] = grade;
        }

        return result;
    }

    public static int getMaxRoundedGrade(int[] grades) {
        int[] rounded = getRoundedGrades(grades);
        int max = rounded[0];

        for (int g : rounded) {
            if (g > max)
                max = g;
        }

        return max;
    }

}
