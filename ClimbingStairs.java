public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        
        int last = 1; 
        int lastlast = 1;
        
        int now = 0;
        for(int i=2; i<=n; i++) {
            now = last+lastlast;
            lastlast = last;
            last = now;
        }
        return now;
        
        
    }
}