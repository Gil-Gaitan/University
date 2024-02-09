import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args)
{
        try (Scanner buf = new Scanner(System.in)) {
            int i;
            int userInput;
            int answer;
            
            System.out.printf("Enter the number: ");
            userInput = buf.nextInt();

            for (i=1; i<=200; i+=7)
            {
                answer = userInput * i;
                System.out.printf("%d x %d = %d\n", userInput, i, answer);
            }
        }
    }
}
