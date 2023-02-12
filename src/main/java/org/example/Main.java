package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int[] nums = new int[]{1,2,3,4,10};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.runningSum(nums)));
    }
}