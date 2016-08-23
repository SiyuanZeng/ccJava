package LeetCode.Value;

/**
 * Created by SiyuanZeng's on 5/9/2016.
 */
public class HouseRobber {
    public int rob1(int[] num) {
        if(num==null || num.length==0)
            return 0;

        int n = num.length;

        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=num[0];

        for (int i=2; i<n+1; i++){
            // There are 2 difference  in dp[i-2) and num(i-1), so that there will be at least one gap in between, sometimes there are 2 gaps.
            dp[i] = Math.max(dp[i-1], dp[i-2]+num[i-1]);
        }

        return dp[n];
    }

    public int rob2(int[] num) {
        if(num==null || num.length == 0)
            return 0;

        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                even += num[i];
                even = even > odd ? even : odd;
            } else {
                odd += num[i];
                odd = even > odd ? even : odd;
            }
        }

        return even > odd ? even : odd;
    }
}
