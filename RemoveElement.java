public class RemoveElement {
public int removeElement(int[] nums, int val) {
    int i = 0;
        int j = nums.length;
        
        while (i < j) {
            if (nums[i] == val) {
                nums[i] = nums[--j];
            } else {
                i++;
            }
        }
        
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println(); // for newline after printing array
        
        return j;
    }
   
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        RemoveElement solution = new RemoveElement();
        int x = solution.removeElement(nums, val);
        System.out.println("k = " + x);
    }
}
