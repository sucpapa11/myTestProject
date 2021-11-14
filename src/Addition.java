public class Addition {

     public static float add (float n1, float n2){

        return n1+n2;
    }

     public static int add (int n1, int n2, int n3){

        return n1+n2+n3;
    }

    public static void main(String[] args) {

        System.out.println("Sum of two nums" + add(1,2));
        System.out.println("Sum of three nums" + add(1,2,3));



    }
}
