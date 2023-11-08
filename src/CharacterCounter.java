import java.util.Scanner;
public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s;
        String current;
        int uniqueCount = 0;
        int count;

        System.out.println("Please enter a word or phrase.");
        s = scan.nextLine();

        for(int i = 0 ; i < s.length(); i++) {
            current = s.substring(i, i+1);
            if (i == 0 || !s.substring(0,i).contains(current) ) {
                uniqueCount ++;
                count = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (current.equals(s.substring(j, j + 1))) {
                        count++;
                    }
                }
                System.out.println(current + " occurs " + count + " times(s).");

            }
        }
        System.out.println("There are " + uniqueCount + " unique characters.");
    }
}