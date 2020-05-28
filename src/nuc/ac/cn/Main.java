package nuc.ac.cn;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//  LeetCode167 case
//        int[] numbers = {1,2,6,7};
//        int target = 8;
//        System.out.println(Arrays.toString(new Solution167().twoSum(numbers, target)));

// LeetCode633 case
//        System.out.println(new Solution633().judgeSquareSum(5));


    }
}


class Solution167 {
    public int[] twoSum(int[] numbers, int target) {

        int ip = 0;
        int jp = numbers.length - 1;

        while (ip < jp && numbers[ip] + numbers[jp] != target) {

            if (numbers[ip] + numbers[jp] < target) {
                ip++;
            } else {
                jp--;
            }
        }
        return new int[]{ip + 1, jp + 1};
    }
}

class Solution633 {
    public boolean judgeSquareSum(int c) {

        int ip = 0;
        int jp = (int) Math.sqrt(c);
        while (ip < jp && ip * ip + jp * jp != c) {

            if (ip * ip + jp * jp < c) {
                ip++;
            } else {
                jp--;
            }
        }
        return ip * ip + jp * jp == c;

    }
}