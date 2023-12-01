package Challengaes.Challenge8;

public class Main {

    public static void main(String[] args) {

        /**
         * In this challenge we will write the hast function. We have to add the integers from the numsToAdd array to another array nums so that
         * we will be able to retrieve the numbers from the array just by being given the number and in order to do that we have to hash the numbers
         * otherwise there is no way to do that. 
         * The numbers are chosen in such a way that there will be no collision so we dont have to worry about any collision.
         */

        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 43, 6894, 500, 99, -58 };
        for (int i = 0; i < numsToAdd.length; i++) {
            //nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    //public static int hash(int value) {

    //}
}
