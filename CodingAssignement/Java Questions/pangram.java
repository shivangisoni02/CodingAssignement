import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); 

       
        scanner.close();

       
        boolean isPangram = isPangram(input);

       
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean isPangram(String input) {
       
        boolean[] alphabetOccurrence = new boolean[26];

        for (char ch : input.toCharArray()) {
           
            if (Character.isLetter(ch)) {
                
                alphabetOccurrence[ch - 'a'] = true;
            }
        }

       
        for (boolean occurred : alphabetOccurrence) {
            if (!occurred) {
                return false; 
            }
        }

        return true;
    }
}
