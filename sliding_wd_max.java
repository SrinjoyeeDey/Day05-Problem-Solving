import java.util.Deque;
import java.util.LinkedList;

public class sliding_wd_max {
    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int n=nums.length;
        int res[]=new int[n-k+1];

        int idx=0;

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<nums.length;i++){
            res[idx++]=nums[dq.getFirst()];
                while(!dq.isEmpty() && dq.getFirst()<=i-k){
                    dq.removeFirst();
                }
                while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            }
        res[idx]=nums[dq.getFirst()];
        return res;
        }
    }

}
