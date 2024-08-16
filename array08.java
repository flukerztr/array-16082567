public class array08 {
    public static void main(String[] args) {
        int ages[] = {20,22,18,35,40,26,87,70};
        float avg, sum = 0;
        int length = ages.length;
        int lowestAge = ages[0];
        for (int i = 0; i < ages.length; i++) {
            if (lowestAge > ages[i]) {
                lowestAge = ages[i];
            }
        }
        System.out.println("The lowest age in the array is: " + lowestAge);
    }
}
