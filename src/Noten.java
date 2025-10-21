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

}
