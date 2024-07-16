import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Time Complexity Big O(n²)
    public int[] twoSum(int[] nums, int target){
        for(int i=0; i<nums.length; i++){
            
            for(int j=i+1; j<nums.length; i++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    } 

    //Using HashMap best time complexity O(n)
    // public int[] twoSum(int[] nums, int target){
    //     Map<Integer,Integer> complements = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         Integer complementIndex = complements.get(nums[i]);
    //         if(complementIndex != null){
    //             return new int[] {i,complementIndex};
    //         }
    //         complements.put(target-nums[i], i);
    //     }
    //     return nums;
    // } 

    public static void main(String[] args) {
        int[] nums = {5,2,4};
        int target = 6;

        TwoSum ts = new TwoSum();
        int[] solution = ts.twoSum(nums, target);
        System.out.println("nums["+solution[0]+"] + nums["+solution[1]+"] == "+target);
    }
}