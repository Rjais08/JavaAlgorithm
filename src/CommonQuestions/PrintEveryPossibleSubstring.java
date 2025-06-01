package CommonQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEveryPossibleSubstring {


    public static void main(String[] args) {
       List<String> res = everyPossibleSubString("Rahul");

        System.out.println(res.size());
        for(String subString : res){
            System.out.println(subString);
        }
    }

    public static List<String> everyPossibleSubString(String inputStr){
        int n = inputStr.length();
        List<String> everyPossibleSubString = new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                everyPossibleSubString.add(inputStr.substring(i, j).trim());
                everyPossibleSubString = everyPossibleSubString.stream().distinct().collect(Collectors.toList());
            }
        }
        return everyPossibleSubString;
    }
}
