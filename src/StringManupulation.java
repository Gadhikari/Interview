public class StringManupulation {
    public  static void main(String args[]){
        String[] givenArray= {"one","two","three"};
        String givenWord ="threetwo";
        System.out.println(checkStringFoundOrNot(givenArray,givenWord));
    }
//12,13,21,23,31,32
    //11,22,33
    private static String checkStringFoundOrNot(String[] givenArray, String givenWord) {
        for(int i = 0; i< givenArray.length; i++){
            for(int j =0; j< givenArray.length; j++){
                if(givenWord.equalsIgnoreCase(givenArray[i]+givenArray[j])){
                    return  "found";
                }
            }
        }
        return "NOT FOUND";
    }

    private static String checkStringFoundOrNotVersionSecond(String[] givenArray, String givenWord){
        int i=0;
        int j=givenArray.length;
            if(givenWord.equalsIgnoreCase(givenArray[i]+givenArray[j]) ||
                    givenWord.equalsIgnoreCase(givenArray[j]+givenArray[i])){
                return  "found";
            }
            else{
                String temp = givenArray[j];
                givenArray[j] = givenArray[i];
                givenArray[i] = temp;
                checkStringFoundOrNotVersionSecond(givenArray,givenWord);
        }
          return "notFound";
    }
}
