import java.util.Random;

public class ConditionalIf {
    //public static void main(int args) {
        //Random scanner;
        //int weekday = scanner.nextInt();

    public static void main(String[] args){
        //int numb = Math.random();
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);

        int weekday = rand_int1 % 7;
        switch(weekday)
        {
            case 1 :
                System.out.println("Number "+rand_int1+" is MONDAY");
                break;
            case 2 :
                System.out.println("Number "+rand_int1+" is TUESDAY");
                break;
            case 3 :
                System.out.println("Number "+rand_int1+" is WEDNESDAY");
                break;
            case 4 :
                System.out.println("Number "+rand_int1+" is THRUSDAY");
                break;
            case 5 :
                System.out.println("Number "+rand_int1+" is FRIDAY");
                break;
            case 6 :
                System.out.println("Number "+rand_int1+" is SATURDAY");
                break;
            case 0 :
                System.out.println("Number "+rand_int1+" is SUNDAY");
                break;
            default :
                System.out.println("Number "+rand_int1+" is NOT a valid number");
        }

        }

}