package Programs.algorithims;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberOfCandies {

    public static void main(String args[]){

        int[] input = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> kids = kidsWithGreatestCadies(input, extraCandies);
        System.out.println(kids);

    }


    /*
    1. Find the kid with greatest candies from the given list
    2. Add the extraCandies to the each kid.
    3. Now, compare the currentCandies + extraCandies >= maxCandies
     */

    public static List<Boolean> kidsWithGreatestCadies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;

        for (int current : candies) {
            max = Math.max(current, max);
        }

        for (int i = 0; i < candies.length; i++) {

            /*
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }
            else
            {
                result.add(false);
            }
             */
            result.add(candies[i]+extraCandies >= max);
        }
        return result;

    }


}
