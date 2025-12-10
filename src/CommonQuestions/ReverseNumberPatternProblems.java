package CommonQuestions;

public class ReverseNumberPatternProblems {

    public static void main(String[] args) {
        System.out.println(ReverseNumberPatternProblems.findGCDEuclidean(52, 5, 0));

    }


    public static int reverse(int x) {
        int reverseNo = 0;
        while(x != 0){
            int pop = x%10;
            x = x/10;
            if(reverseNo > Integer.MAX_VALUE/10 || (reverseNo == Integer.MAX_VALUE/10 && pop >7))
                return 0;
            if(reverseNo < Integer.MIN_VALUE/10 || (reverseNo == Integer.MIN_VALUE/10 && pop <-8))
                return 0;
            reverseNo = reverseNo * 10 + pop;

    }
        return reverseNo;
}

    public static boolean isPalindrome(int x) {
        int reverseNo = 0;
        int originalNum =x;
        while(x > 0){
            int pop = x%10;
            x = x/10;
            if(reverseNo > Integer.MAX_VALUE/10 || (reverseNo == Integer.MAX_VALUE/10 && pop >7))
                return false;
            reverseNo = reverseNo * 10 + pop;

        }
        return reverseNo == originalNum;
    }

    public static boolean armstrongNumber(int x) {
        int armstrongNum = 0;
        int originalNum =x;
        while(x > 0){
            int pop = x%10;
            x = x/10;
            if(armstrongNum > Integer.MAX_VALUE/10 || (armstrongNum == Integer.MAX_VALUE/10 && pop >7))
                return false;
            armstrongNum += pop*pop*pop;

        }
        return armstrongNum == originalNum;
    }

    public static boolean checkPerfectNumber(int num) {
            int perfectNum = 0;
            for(int i = 1; i*i <= num; i++){
                if(num%i ==0){
                    perfectNum= perfectNum +  i;
                    if(i !=1 && i*i != num){
                        perfectNum = perfectNum + num/i;
                    }
                }
            }
            return perfectNum == num;
    }

    public static int findGCDEuclidean(int num1, int num2, int count){
        if(num1 == 0){
            System.out.println(++count);
            return num2;
        }else if(num2 ==0){
            System.out.println(++count);
            return num1;
        }else{
//            return findGCDEuclidean(num1 >= num2 ? (num1 - num2) : num1 , num2 > num1 ? (num2 - num1) : num2, count+1);
            return findGCDEuclidean(num1 >= num2 ? (num1 % num2) : num1 , num2 > num1 ? (num2 % num1) : num2, count+1);
        }
    }

}
