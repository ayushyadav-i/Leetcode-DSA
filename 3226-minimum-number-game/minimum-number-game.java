class Solution{
    public int[] numberGame(int[] nums) {
        PriorityQueue <Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        int[] arr=new int[nums.length];
        int j=0;
        while(!pq.isEmpty()){
            int a=pq.poll();
            int b=pq.poll();
            arr[j]=b;j++;
            arr[j]=a;j++;

        }
        return arr;
    }
}
// class Solution {
//     public int[] numberGame(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i+=2){
            
//                 int temp=nums[i];
//                 nums[i]=nums[i+1];
//                 nums[i+1]=temp;
//         }
//         return nums;
        
//     }
// }