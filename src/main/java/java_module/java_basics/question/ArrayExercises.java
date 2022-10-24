package java_module.java_basics.question;


public class ArrayExercises {
    public static void main(String[] args) {
        question1_greetGuests();
        question2_computeSumAndAverage();
        question3_applyArrayMethods(new String[]{"Ken", "Candy", "Thomas", "Billy", "Andy"});
    }

    /*
        Question 1: Complete the method such that it prints the exact output as follows:

        [Hello Andy!, Hello Billy!, Hello Candy!, Hello Ken!, Hello Thomas!]
     */
    private static void question1_greetGuests() {
        // TODO: Complete this method

        // Create a String array named guests with 5 elements:
        // {"Andy", "Billy", "Candy", "Ken", "Thomas"}

        // Iterate through the array to update each element
        // by adding "Hello " in front of the guest's name and a "!" at the end
        // e.g. for the first element of the array, "Andy" should become "Hello Andy!"

        // Print out the array such that the screen has the exact following output:
        // [Hello Andy!, Hello Billy!, Hello Candy!, Hello Ken!, Hello Thomas!]

    }

    /*
        Question 2: Complete the method such that it prints the exact output as follows:

        Sum = 55
        Average = 5.5
     */
    private static void question2_computeSumAndAverage() {
        // TODO: Complete this method

        // Create an int array named numbers with 10 elements:
        // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}

        // Create an int that represents the sum

        // Create a double that represents the average


        // Loop through the array to compute the sum

        // Compute the average by dividing the sum by the number of array elements

        // Print out the sum and average

    }

    /*
        Question 3: Complete the method such that it prints the exact output as follows:

        names: [Ken, Candy, Thomas, Billy, Andy]
        copyOfNames: [Andy, Billy, Candy, Ken, Thomas]
        Are the arrays equal? false
     */
    private static void question3_applyArrayMethods(String[] names) {
        // TODO: Complete this method

        // Make a copy of the original array called names

        // Sort the copied array

        // Print out the contents of the original array

        // Print out the contents of the copied array

        // Check whether the two arrays are equal and print out the result

    }
}
