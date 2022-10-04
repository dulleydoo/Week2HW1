//        Creating variables and retrieving the values from them
//        Creating Arrays and retrieving the values from them
//        Creating Classes and Objects plus invoking methods on Objects
//        Creating and using static methods
//        Loops ( For and while ) syntax
//        Looping through Arrays
//        Creating and using if else statements

public class School {
    public static void main(String[] args) {
        //creating variables and retreiving values
        int i = 20;
        System.out.println(i);

        //Creating Arrays and retrieving the values from them
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(array[7]);
        System.out.println(array[0]);

        //Creating Classes and Objects plus invoking methods on Objects

        Student one = new Student(false, 12, 17, "Chris", 35709);
        Student two = new Student(true, 9, 15, "Karem", 12345);

        System.out.println(one.getStudentID());

        //




    }

}
