package CommonQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// here we
public class GenerateAllPossibleSubSequences {

    public static void main(String[] args) {
        List<String> subSequences =  new ArrayList<>();
        generateAllPossibleSubsequences("rahul", subSequences);
//        subSequences = subSequences.stream().distinct().collect(Collectors.toList());
        System.out.println(subSequences.size());
        for(String res : subSequences){
            System.out.println(res);
        }
    }

    public static void generateAllPossibleSubsequences(String inputStr, List<String> subSequences){
       generateAllPossibleSubsequencesHelper(inputStr, "", 0, subSequences);

    }

    public static void generateAllPossibleSubsequencesHelper(String s, String current, int index, List<String> subSequences){
        if(index == s.length()){
            subSequences.add(current);
            return;
        }

        generateAllPossibleSubsequencesHelper(s, current+s.charAt(index), index+1, subSequences);

        generateAllPossibleSubsequencesHelper(s, current, index+1, subSequences);

    }
}
