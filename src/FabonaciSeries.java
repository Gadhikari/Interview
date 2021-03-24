public class FabonaciSeries {
    public static void main(String args[]){
        int givenNumber = 4;
       // createFabobNaciSeriesTillGivenNumber(givenNumber);
     //   System.out.println(createFaboNaciSeriesRecursively(givenNumber));
        int n = 10;
        int [] fib = new int[n+1];
      //  System.out.println(fibTopDown(n, fib));
        System.out.println(fibDP(10));

    }

    private static int createFaboNaciSeriesRecursively(int givenNumber) {
        if(givenNumber < 2){
            return givenNumber;
        }
        int sum = createFaboNaciSeriesRecursively(givenNumber-1)+ createFaboNaciSeriesRecursively(givenNumber-2);
        return sum ;
    }

    public static int fibTopDown(int n, int [] fib) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(fib[n]!=0){
            return fib[n];
        }else{
            fib[n] = fibTopDown(n-1, fib) + fibTopDown(n-2, fib);
            System.out.println(fib[n]);
            return fib[n];
        }
    }
    public static int fibDP(int x) {
        int fib[] = new int[x + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < x + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[x];
    }

    private static void createFabobNaciSeriesTillGivenNumber(int givenNumber) {
        int previous =1;
        int current =0;
        int sum = 0;
       for(int i=0; i<givenNumber; i++){
           if(i == 0){
               System.out.println(i);
           }else {
               sum = current + previous;
               previous = current;
               current = sum;
               System.out.println(sum);
           }
       }
    }
}
