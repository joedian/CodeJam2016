import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length < 1)
            return 0;
        if(stones.length == 1)
            return stones[0];
        
        Arrays.sort(stones);
        
        int i = stones.length - 2;
        while(i >= 0){
            int temp = stones[stones.length - 1];
            int temp2 = stones[stones.length - 2];
            int val = Math.abs(temp - temp2);  
            stones[stones.length - 1] = 0;
            stones[stones.length - 2] = val;
            Arrays.sort(stones);
            if(stones[stones.length - 2]  == 0){
                i = -1;
            }
        }
        
        return stones[stones.length -1];
    }
}
