public class ArraySum {




    public static void main(String[] args) {

        int [] numbers = new int[10];

        for(int i=0; i<numbers.length; i++)
        {
            numbers[i]=i;
        }

        int sum=0;

        for (int e:numbers) sum +=e;
        System.out.println(sum);

    }
}
