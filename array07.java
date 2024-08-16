public class array07 {
    public static void main(String[] args) {
        int ages[] = {20,22,18,35,40,26,87,70};
        float avg, sum = 0;
        int length = ages.length;
        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;
        System.out.println("The average age is: " + avg);
    }
}
