package PCCP_test;
import java.util.*;
public class Solution_01 {
    //외톨이 문자 구하기

    public String solution(String input) {

        if (input == null || input.isEmpty() || input.length() > 2600) {
            return "N";
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < 'a' || c > 'z') {
                return "N";
            }
        }

        int[] blockCount = new int[26];
        char prev = input.charAt(0);
        blockCount[prev - 'a']++;

        for (int i = 1; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current != prev) {
                blockCount[current - 'a']++;
            }
            prev = current;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (blockCount[i] >= 2) {
                result.append((char) (i + 'a'));
            }
        }

        return result.isEmpty() ? "N" : result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Solution_01 sol = new Solution_01();
        String result = sol.solution(input);

        System.out.println(result);
    }
}
