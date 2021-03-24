public class FindElementsFormingSum {
    public static void main(String args[]){

      //  int givenArray[] = {2,4,6,8,13,19};
        int givenArray[] = {8,4,2,6,13,19};
       // isSumEqualsToGivenData(givenArray,18);
        isSumEqualsToGivenDataRecursion(givenArray,0,18,0,1);

    }

    private static void isSumEqualsToGivenDataRecursion(int[] givenArray, int sum,int givenNumber, int i ,int j) {
        if(j<givenArray.length || i< givenArray.length) {
            if (sum == givenNumber) {
                System.out.println("WOO IT Worked");
            }
            if (sum < givenNumber) {
                sum += givenArray[j-1];
                j++;
            } else {
                i++;
                sum = 0;
                j=i+1;
               // isSumEqualsToGivenDataRecursion(givenArray, sum, givenNumber, i, j);

            }
            isSumEqualsToGivenDataRecursion(givenArray, sum, givenNumber, i, j);

        }
    }

    private static void isSumEqualsToGivenData(int givenArray[] , int givenNumber) {
        for(int i=0; i< givenArray.length;i++) {
            int sum =givenArray[i];
            for (int j = i+1; j < givenArray.length ; j++) {
                if (sum == givenNumber) {
                    System.out.println("Sum Exist");
                    break;
                }
                if (sum < givenNumber) {
                    sum += givenArray[j];
                }
            }
        }
    }
}
