package RealInterview;

/**
 * Created by SiyuanZeng's on 8/19/2016.
 */
public class Walmart20160819 {
/*

    Find top 5 performer ids with maximum images.

            Performer table
    performer_id, name, primary_category_id

    performer_image table
    performer_image_id, performer_id, image_url




    select *?from (
            select count(performer_image_id), pi.performer_id
            from
    Performer p join perfomer_image pi
            on
    p.performer_id=pi.performer_id
    order by
    count(performer_image_id )
    )

    where rownum <= 5;


    */
/**
     * Given a list of N coins, their values (V1, V2, ... , VN), and the total sum S.
     * Find the minimum number of coins the sum of which is S (we can use as many coins of one type as we want),
     * or report that it's not possible to select coins in such a way that they sum up to S.
     *//*



    public int sum(int[] coins, int sum) {

        int[] cal = new int[sum+1];

        for (int i = 0; i<=sum; i++) {
            cal[i] = Integer.MAX_VALUE;al
        }


        cal[0] = 0;

        for( int i = 1; i <= sum; i++) {
            for (int j = 0 ; j < coins.length; j++) {
                if (i >= coins[j] && cal[i-coins[j]] + 1 < cal[i]) {
                    cal[i] = cal[i-coins[j]] + 1;
                }
            }
        }


        return cal[sum];

    }

*/






}
