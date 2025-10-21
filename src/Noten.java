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

}
