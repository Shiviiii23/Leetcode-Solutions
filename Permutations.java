class Solution {
    
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> sets = new ArrayList<List<Integer>>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        helper(0, 0, nums.length, result, nums, sets);
        return sets;
    }
    
   
    
    
    public void helper(int repeat, int nextelem, int retnum, ArrayList<Integer> result,int[] nums, ArrayList<List<Integer>> sets){
        if (repeat >= retnum){
            return;
        }
        
        
        for (int i = 0; i <= repeat; i++){
            result.add(i, nums[repeat]);
            if (result.size() == retnum){
                sets.add(new ArrayList<Integer>(result));
            }
            helper(repeat+1, nums[repeat], retnum, result, nums, sets);
            result.remove(i);
        }
    }
}
