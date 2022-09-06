public class HwMethods {
    String names;


    //QUESTION 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //QUESTION 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //QUESTION 3
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //QUESTION 4
    public static String getLastElement(String[] names) {
        return names[4];
    }

    //QUESTION 5
    public static String getSecondToLastElement(String[] names) {

        return names[3];
    }

    //QUESTION 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int value : ints){
            sum += value;
        }
        return sum;
    }

    //QUESTION 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int value : ints){
            sum += value;
        }
        return sum / ints.length;

    }
//
//    //QUESTION 8
//    public static String extractAllOddNumbers(int[] numbers) {
//        return null;
//    }
//
//    //QUESTION 9
//    public static String extractAllEvenNumbers(int[] numbers) {
//        return null;
//    }
//
//    //QUESTION 10
//    public static boolean contains(String[] names, String element) {
//        return false;
//    }
//
//    //QUESTION 11
//    public static int getIndexByElement(String[] names, String element) {
//        return 0;
//    }
//
//    //QUESTION 12
//    public static void printOddNumbersInRange(int start, int end) {
//
//    }
//
//    //QUESTION 13
//    public static String printGivenStringTimesNumberGiven(String str, int n) {
//        return null;
//    }
//
//    //QUESTION 14
//    public static String repeatFirstThreeLetters(String str, int n) {
//        return null;
//    }
//
//    //QUESTION 15
//// Write a java method to count all the words in a string
//
//    public static int WordsInAStringCounter(String str) {
//        //return null;
//    }




    public static void main(String[] args) {
        String []names = {"Karem", "Omar", "Aqil", "kyle", "Emily"};
        int []ints = {5, 7, 3 , 5, 10};
        //QUESTION 1
        System.out.println(getLastIndex(names));
        //QUESTION 2
        System.out.println(getSecondToLastIndex(names));
        //QUESTION 3
        System.out.println(getFirstElement(names));
        //QUESTION 4
        System.out.println(getLastElement(names));
        //QUESTION 5
        System.out.println(getSecondToLastElement(names));
        //QUESTIONS 6
        System.out.println(getSum(ints));
        //QUESTIONS 7
        System.out.println(getAverage(ints));










    }



}
