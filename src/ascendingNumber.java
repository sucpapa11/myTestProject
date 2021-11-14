import java.util.Scanner;

public class ascendingNumber {
    public static void main(String[] args)
    {
        int temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Input Number:");
        int inputNo = s.nextInt();
        int len= Integer.toString(inputNo).length();
        int a[] = new int[len];

        // converting Number values in array
        for (int i=len; i>0; i--)
        {
            a[i-1] = inputNo % 10;
            inputNo = inputNo /10;
            //System.out.println("Current value of digits = "+inputNo);
            //System.out.println("a["+i+"] = "+a[i-1]);
        }

        // sorting inside array
        for (int i = 0; i < len; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // display
        System.out.print("Output in assending order : ");
        for (int i = 0; i < len;i++)
        {
            System.out.print(a[i]);
        }
    }
}
