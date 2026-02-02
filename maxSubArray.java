// Kadane's Algorithm

class Main {

    public int maxSubArray(int[] nums) {
     int max1=nums[0],cur=0;
        for(int i :nums)
        {
            if(cur<0){
                cur=0;
            }
            cur+=i;
            max1=Math.max(max1,cur);
        }
        return max1;
    }
}
