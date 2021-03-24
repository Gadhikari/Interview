import com.sun.org.apache.xpath.internal.operations.Bool;

public class CreatePalendrome {
    public static  void main(String args[]){
        String givenWord = "lol";
     //   System.out.println(createPaendrome(givenWord));
        System.out.println(createPaendromeAlone(givenWord));
    }

    private static String createPaendrome(String givenWord) {
        StringBuilder stringBuilder = new StringBuilder();
        if (givenWord.equalsIgnoreCase(stringBuilder.append(givenWord).reverse().toString()))
        {
            return givenWord;
        } else {
            String newPalendrome = "";
            newPalendrome = givenWord.substring(1, givenWord.length());
            newPalendrome = stringBuilder.append(newPalendrome).reverse().toString();
            return newPalendrome;
        }

    }
    private static String createPaendromeAlone(String givenWord) {
        char [] givenWordArray = givenWord.toCharArray();
        String palendrome = "";
        Boolean flag = false;
      //  int j = givenWord.length()-1;
        for(int i = 0 ; i < givenWord.length()-1/2 ; i++){
            if((givenWordArray[i] == givenWordArray[givenWord.length()-1-i])){
                flag = true;
            }else {
                flag = false;
                break;
            }
        //    j--;
        }
        if(!flag) {
            for (int i = givenWord.length() - 1; i > 0; i--) {
                palendrome += givenWordArray[i];
            }
            return palendrome + givenWord;
        } else {
            return givenWord;
        }

    }
}
