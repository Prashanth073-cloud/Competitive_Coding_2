// Time Complexity : O(n). n is the length of the array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

public int[] twoSum(int[] nums, int target) {
		if(nums==null || nums.length==0) return new int[0];
		HashMap<Integer,Integer> hashMap = new HashMap();
		for(int i=0;i<nums.length;i++) {
			if(hashMap.containsKey(target-nums[i])) {
				return new int[] {hashMap.get(target-nums[i]),i};
			}else {
				hashMap.put(nums[i], i);
			}
		}return new int[0];
	}
