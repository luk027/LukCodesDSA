public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i] != nums[i+1]){
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};

        RemoveDuplicatesFromSortedArray rdsa = new RemoveDuplicatesFromSortedArray();
        int solution = rdsa.removeDuplicates(nums);

        System.out.println(solution);

    }
}