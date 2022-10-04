import java.util.Arrays;

public class HwMethods {

    //QUESTION 1
    public static int getLastIndex(String[] names) {return names.length - 1;}
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
        return names[names.length-1];
    }
    //QUESTION 5
    public static String getSecondToLastElement(String[] names) {
            return names[names.length-2];
    }
    //QUESTION 6
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
            sum += ints[x];
        }
        return sum;
    }

    //QUESTION 7
    public static int getAverage(int[] ints) {
        int sum = 0;
        for (int x = 0; x < ints.length; x++) {
            sum += ints[x];
        }
        return sum / ints.length;

    }

    //QUESTION 8
    public static String extractAllOddNumbers(int[] numbers) {
        int odds = 0;
        String result = " is an odd";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odds = numbers[i];
                System.out.println(odds + result);
            }
        }return "";
    }
    //QUESTION 9
    public static String extractAllEvenNumbers(int[] numbers) {
        int evens = 0;
        String result = " is an even";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evens = numbers[i];
                System.out.println(evens + result);
            }
        }return "";
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
    public static int getIndexByElement(String[] names, String element) {
        int x = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                x = i;

            }
        }
        return x;
    }
//    //QUESTION 12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }
    }

    //QUESTION 13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        str = str.repeat(n);
        return str;
    }
    //QUESTION 14
    public static String repeatFirstThreeLetters(String str, int n) {
        String result;
        str = str.substring(0,3);

        result = str.repeat(n);



        return result;
    }

    //QUESTION 15
    // Write a java method to count all the words in a string
    public static int WordsInAStringCounter(String str) {
        String[] numberOfWords = str.split("\\s+");
        return numberOfWords.length;
    }
    //Question 16
    //A, E, I, O, U, and sometimes Y
    public static int VowelsCounter(String str){
        String sentence = str;
        sentence = sentence.toLowerCase();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            char characters = sentence.charAt(i);
            if(characters == 'a'|| characters == 'e'|| characters == 'i' ||characters == 'o' ||characters == 'u'||characters == 'y') {
                count++;
            }
        }
        return count;
    }
    //Question 17
    //Swap the first element in an array with the last element in an array and return
    public static String[] swap(String[] stringArray) {
        String[] namesSwap = stringArray;
        //parameter string words is in array, now we can use index positions

        String x = stringArray[0];
        String y = stringArray[stringArray.length-1];

        namesSwap[0] = y;
        namesSwap[namesSwap.length-1]=x;

        return namesSwap;
    }
    //Question 18
    /**
     * Given the following legend
     *
     * f   >>   7
     * s   >>   $
     * 1   >>   !
     * a   >>   @
     *
     * your method should replace any character represented by a key in the legend, with its corresponding value.
     * Input  = "The Farmer went to the store to get 1 dollar's worth of fertilizer"
     * Output = "The 7@rmer went to the $tore to get ! doll@r'$ worth of 7ertilizer"
     *
     * output = The 7@rmer went to the $tore to get ! doll@r'$ worth o7 7ertilizer
     */
    public static String replaceCharacters(String str) {
        str = str.toLowerCase();

        str = str.replace('f','7');
        str = str.replace('s','$');
        str = str.replace('1','!');
        str = str.replace('a','@');


        return str;
    }
    //Question 19
    //        " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {

        String [] stringInputArray = stringInput.split(" ");
        String x = " ";
        for(int i = 0; i < stringInputArray.length; i++){
            if((i+1) % 2 == 0){
                stringInputArray[i] = "wu";
            }
            else if((i+1) % 3 == 0){
                stringInputArray[i] = "Tang";
            }

            x = x + stringInputArray[i] + " ";
        }
        return x;
    }
    //Question 20
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {
        int num1 = 0;
        int num2 = 1;

        String str = num1 + " " + num2;

        for(int i = 0; i < maxnumber; i++){
            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
            if(maxnumber <= num3){
                break;
            }

            str += num3 + " ";
        }


        return str;
    }





    public static void main(String[] args) {
        String[] names = {"Karem", "Omar", "Aqil", "kyle", "Emily", "Jay"};
        int[] ints = {5, 7, 3, 5, 10};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String str = "That way is the best way out";
        int characters = 3;
        //QUESTION 1
        //System.out.println(getLastIndex(names));
        //QUESTION 2
        //System.out.println(getSecondToLastIndex(names));
        //QUESTION 3
        //System.out.println(getFirstElement(names));
        //QUESTION 4
        //System.out.println(getLastElement(names));
        //QUESTION 5
        //System.out.println(getSecondToLastElement(names));
        //QUESTIONS 6
        //System.out.println(getSum(ints));
        // QUESTIONS 7
        //System.out.println(getAverage(ints));
        //QUESTION 8
        //System.out.println(extractAllOddNumbers(numbers));
        //QUESTION 9
        //System.out.println(extractAllEvenNumbers(numbers));
        //QUESTION 10
        //System.out.println(contains(names, "Karem"));
        //System.out.println(contains(names, "bob"));
        //QUESTION 11
        //System.out.println(getIndexByElement(names, "Aqil"));
        //QUESTION 12
        //printOddNumbersInRange(1, 100);
        //QUESTION 13
        //System.out.println(printGivenStringTimesNumberGiven(str + "\n" , 3));
        //QUESTION 14
        //System.out.println(repeatFirstThreeLetters(str,3));
        //QUESTION 15
        //System.out.println(WordsInAStringCounter(str));
        //QUESTION 16
        //System.out.println(VowelsCounter(str));
        //QUESTION 17
        System.out.println("Original Array " + Arrays.toString(names));
        System.out.println("New Array " + Arrays.toString(swap(names)));
        //QUESTION 18
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        //QUESTION 19
        System.out.println("Original String: The small brown dog hopped the fence");
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        //QUESTION 20
        System.out.println(createStringOfFibonnaciUpToMax(534989999));














    }



}
