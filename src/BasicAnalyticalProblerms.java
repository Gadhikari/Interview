public class BasicAnalyticalProblerms {

    public static void main(String args[]){

        int [] givenArray = {10,20,30};
        int i =givenArray.length-1;
        printArray(i, givenArray);




        System.out.println("Hello World");
    }

    private static void printArray(int i,int[] givenArray) {
            if(i>=0) {
                printArray(i-1, givenArray);
                printArray(i-1, givenArray);
                printArray(i-1, givenArray);
                System.out.println(givenArray[i]);
            }


    }
}
