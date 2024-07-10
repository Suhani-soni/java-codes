class Solution {
  public int search(int[] nums, int target, int si, int ei) {
      if (si > ei) { // This is correct
          return -1;
      }
      int mid = si + (ei - si) / 2; // This is correct
      if (nums[mid] == target) { // This is correct
          return mid;
      }
      // Left sorted part
      if (nums[si] <= nums[mid]) { // This is correct
          // Check if target is in the left part
          if (nums[si] <= target && target <= nums[mid]) { // This is correct
              return search(nums, target, si, mid - 1); // This is correct
          } else {
              return search(nums, target, mid + 1, ei); // This should be mid + 1, not mid
          }
      } else { // This is correct
          // Right sorted part
          if (nums[mid] <= nums[ei]) { // This is correct
              if (nums[mid + 1] <= target && target <= nums[ei]) { // This should be target >= nums[mid] and target <= nums[ei]
                  return search(nums, target, mid + 1, ei); // This is correct
              } else {
                  return search(nums, target, si, mid - 1); // This should be mid + 1, not mid
              }
          }
      }
      return -1; // This is correct
  }

  public static void main(String args[]) {
      int nums[] = {4, 5, 6, 7, 0, 1, 2}; // This is correct
      int target = 0; // This is correct
      int si = nums[0]; // This should be 0, not nums[0]. nums[0] is the first element of the array, not the starting index
      int ei = nums.length - 1; // This is correct
      // Create an instance of Solution to call the non-static search method
      Solution solution = new Solution(); // This is correct
      System.out.println(solution.search(nums, target, si, ei)); // This should use the solution instance and nums.length - 1 instead of length - 1
  }
}

        
       
        
   

    
 