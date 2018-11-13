package arrays.problems;

import java.util.HashMap;

public class ArraysTwoSum {

  public static int[] twoSum(int[] nums, int targer){
    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0; i< nums.length; i++){
      if(map.containsKey(nums[i])){
        return new int[] {map.get(nums[i]), i};
      } else {
        map.put(targer-nums[i], i);
      }
    }
    return  new int[] {0,0};
  }

  public static void main(String args[]){
    System.out.println("Testing");

    int[] a = {1,3,4,4};
    int sum = 8;

    int[] output= twoSum(a, sum);
    System.out.println(output[0] +" and " +output[1]);
  }
}
