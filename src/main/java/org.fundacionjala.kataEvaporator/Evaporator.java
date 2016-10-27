package org.fundacionjala.kataEvaporator;

/**
 * Created by erickaviraca on 10/27/2016.
 */
public class Evaporator {
    /**
     * @param content      content of the evaporator (ml)
     * @param evap_per_day the percentage of gas lost every day
     * @param threshold    percentage beyond which the evaporator is no longer useful
     * @return nth_day (as an integer) on which the evaporator will be out of use.
     */
    public static int evaporator(double content, double evap_per_day, double threshold) {
        int nth_day = 0;
        double limit = content * threshold/100;
        while (content > limit) {
            content = content - (content * evap_per_day/ 100);
            nth_day++;
        }
        return nth_day;
    }
}
