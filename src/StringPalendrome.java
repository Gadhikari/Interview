import java.util.Arrays;

public class StringPalendrome {
    public static void main(String args[]) {
        String givenString = "nnnnn";
        String givenStringForAnagram = "god";
        String secondGivenString = "dog";
        checkStringIsPalendrome(givenString);
        System.out.println(checkStringAnangram(givenStringForAnagram,secondGivenString));
    }

    private static Boolean checkStringAnangram(String givenStringForAnagram, String secondGivenString) {
        int NO_OF_CHARS = 256;
        int count[] = new int[NO_OF_CHARS];
        int count1[] = new int[NO_OF_CHARS];
        Arrays.fill(count,0);
        Arrays.fill(count1,0);
        for(int i=0; i< givenStringForAnagram.length() && i < secondGivenString.length(); i++){
            count[givenStringForAnagram.toCharArray()[i]]++;
            count1[secondGivenString.toCharArray()[i]]++;
        }

        if (givenStringForAnagram.length() != secondGivenString.length()) {
            return false;
        }
        for (int p = 0; p < NO_OF_CHARS; p++) {
            if (count1[p] != count[p]) {
                return false;
            }
        }
        return true;
    }

    private static void checkStringIsPalendrome(String givenString) {
        int lengthOfString = givenString.length();
        StringBuilder strb = new StringBuilder(givenString);
        if (givenString.equalsIgnoreCase(String.valueOf(strb.reverse()))) {
            System.out.println("Palendrome Found");
        } else {
            System.out.println("Palendrome NOT Found");
        }
      /*  char [] givenStringCharArray = givenString.toLowerCase().toCharArray();
        int startPointer = 0;
        int endPointer = givenString.length()-1;
        Boolean checkFlag = true;
        while(endPointer>startPointer){
            if(givenStringCharArray[startPointer]==givenStringCharArray[endPointer]){
                endPointer --;
                startPointer ++;
            } else {
                checkFlag =false;
                System.out.println("Palendrome NOT Found");
                break;
            }
        }
        if(checkFlag)
        System.out.println("Palendrome Found");
    }*/
    }
}
