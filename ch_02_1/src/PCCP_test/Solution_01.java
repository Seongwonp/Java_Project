package PCCP_test;
import java.util.*;
public class Solution_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String[] nums = new String[24];
        boolean flag = false;
        char temp;

        //조건 검사
        if(answer.isEmpty() || answer.length()>2600){
            System.exit(1);
        }
        for(int i=0; i<answer.length(); i++){
            if(answer.charAt(i)>'a' && answer.charAt(i)<'z') {
                continue;
            }else{
                System.exit(1);
            }
        }

        //외톨이 문자탐색
        temp = answer.charAt(0);
        for(int i=1 ; i<answer.length() ; i++){
            if(temp == answer.charAt(i)) {
                flag = false;
            }else{
                flag = true;
            }
            temp = answer.charAt(i);
            if(flag){
                nums[i-1] = answer;
            }
        }

        for(int i=0 ; i<nums.length ; i++){
            System.out.print(nums[i] + " ");
        }

    }
}
