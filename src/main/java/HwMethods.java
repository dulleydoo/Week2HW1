public class HwMethods {

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
    public static String getLastElement(String[] names) { return names[4]; }
    //QUESTION 5
    public static String getSecondToLastElement(String[] names) { return names[3]; }

    //QUESTION 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum;
    }

    //QUESTION 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int value : ints) {
            sum += value;
        }
        return sum / ints.length;

    }

    //QUESTION 8
    public static int extractAllOddNumbers(int[] numbers) {
//        int odds = 0;
//        int position = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (i % 2 == 0)
//                odds++;
//        }
        int element = 0;
        int position = 0;
        int oddNumbers = 0;
        while(position < numbers.length){
            element = numbers[position];
            position++;
            if(element%2 !=0){
                oddNumbers += element + element;
            }
        }
        return oddNumbers;


    }


    //QUESTION 9
    public static String extractAllEvenNumbers(int[] numbers) {
        int evens = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0)
                evens++;
        }
        return null;//numbers[evens];
    }

    //QUESTION 10
    public static boolean contains(String[] names, String element) {
        for (String n : names) {
            if (element == n) {
                return true;
            }
        }
        return false;
    }

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
    //QUESTION 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        for (int i = 0; i < n; i++) ;
        str += n;
        return str;
    }
    //QUESTION 14
    public static String repeatFirstThreeLetters(String str, int n) {
        int l = str.length();
        String letters = "";
        for (int i = 0; i < n; i++) {
            {
                letters += str.substring(l - n);

            }

        }
        return letters;
    }

    //QUESTION 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        String[] numberOfWords = str.split("\\s+");
        return numberOfWords.length;
    }




    public static void main(String[] args) {
        String []names = {"Karem", "Omar", "Aqil", "kyle", "Emily"};
        int [] ints = {5, 7, 3 , 5, 10};
        int [] numbers ={1,2,3,4,5,6,7,8,9,10};
        String str = "That way is the best way out";
        int characters = 3;
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
        // QUESTIONS 7
        System.out.println(getAverage(ints));
        //QUESTION 8
        System.out.println(extractAllOddNumbers(numbers));
        //QUESTION 9
        //System.out.println(extractAllEvenNumbers());
        //QUESTION 10
        System.out.println(contains(names, "Karem"));
        System.out.println(contains(names, "bob"));
        //QUESTION 11

        //QUESTION 12

        //QUESTION 13
        System.out.println(printGivenStringTimesNumberGiven(str + " " , 1));
        //QUESTION 14
        System.out.println(repeatFirstThreeLetters(str,characters));
        //QUESTION 15
        System.out.println(WordsInAStringCounter(str));













    }



}
