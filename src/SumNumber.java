public class SumNumber {

    public static void main(String[] args) {
        int num = 1234;
        //int digit;
        int total=0;

        for(int n=1; n<=100; n++){

            total=total +num;
            //digit = num /10;

            System.out.println("sum =" + total);



        }
        System.out.println("Summation of Numbers"  + total);
    }
}
