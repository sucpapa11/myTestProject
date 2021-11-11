
public class SmallestNum {
    public static int smallest(int first, int second, int third, int fourth) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        if (fourth < min) {
            min = fourth;
        }
        System.out.println("Smallest number is " + min);
        return min;
    }

    public static void main(String[] args) {
        smallest(5, 8, 2, 3);
    }

}
