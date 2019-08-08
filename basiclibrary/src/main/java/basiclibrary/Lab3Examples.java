package basiclibrary;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Lab3Examples {


    public static String maps (int[][] weeklyMonthTemperatures){

        String outputStr = "Never saw temperature: ";

        //HashSet
        HashSet<Integer> temperatures = new HashSet<>();

        //StringBuilder
        StringBuilder buildStr = new StringBuilder();


        //Adds temperature values into HashSet
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length ; j++) {
                temperatures.add(weeklyMonthTemperatures[i][j]);
            }
        }
        //Sets my min and max
        // Source: http://www.java2s.com/Tutorial/Java/0140__Collections/FindMinimumelementofHashSet.htm
        Object min = Collections.min(temperatures);
        Object max = Collections.max(temperatures);


        //Source: https://stackoverflow.com/questions/14534767/how-to-append-a-newline-to-stringbuilder
        buildStr.append("High: ").append(max).append(System.getProperty("line.separator"));
        buildStr.append("Low: ").append(min).append(System.getProperty("line.separator"));


        for (int i = (int) min; i < (int) max ; i++) {

            if(!temperatures.contains(i)){

              buildStr.append(outputStr).append(i).append(System.getProperty("line.separator"));
            }

        }
        return buildStr.toString();
    }

    public static String tally(List<String> votes){
        //need to tally how many times an item in my array list shows up and return who got the most votes

        int maxNumOfVotes = 0;
        String winner = null;

        for (String name : votes) {
            int voteFreq = Collections.frequency(votes, name);

            if(voteFreq > maxNumOfVotes){
                maxNumOfVotes = voteFreq;
                winner = name;
            }
        }

        return  winner + " received the most votes!";
    }
}
