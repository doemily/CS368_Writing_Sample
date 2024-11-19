import java.util.Random;
import java.util.Scanner;

/*
 * CS 368 Writing Sample
 *
 * Notes: Changes to instructor code made on line 116 ("hint" comment).
 *        Justification, context, and importance starts on line 123.
 */

public class ArrayMain {

    /**
     * Our main method.
     *  - Prompt user for a # of elements.
     *  - Create array of that size, using random values in the range
     *    -1000 to 1000, inclusive.
     *  - Compute and print various things about the array's contents.
     * @param args
     */
    public static void main(String[] args) {
        int numElements = getNumElements();
        if (numElements <= 0) {
            System.out.println("We need a positive number.");
            return;
        }

        // declare and initialize our array
        int[] numberArray = createNumberArray(numElements);
        
        /////////////////////////////////////////////////////////////////
        //   At this point, the array has been created and initialized.
        /////////////////////////////////////////////////////////////////

        // ***** CHECKPOINT 1 *****
        // Print the numbers, followed by a line of dashes
        for (int i = 0; i < numElements; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < 20; j++) {
            System.out.print("-");
        }
        System.out.println();
        // ***** CHECKPOINT 2 *****
        // Compute/print the average of the numbers
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < numElements; i++) {
            sum = sum + numberArray[i];
        }
        avg = sum / numElements;
        System.out.println("The average of the numbers is "+ avg);

        
        // ***** CHECKPOINT 3 *****
        // Set a breakpoint somewhere above and show the contents of the array
        

        // ***** CHECKPOINT 4 *****
        // Find/print the smallest number in the array
        int minimum = numberArray[0];
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] < minimum) {
                minimum = numberArray[i];
            }
        }
        System.out.println("The minimum element is "+ minimum);

        // ***** CHECKPOINT 5 *****
        // Find/print the percentage of numbers that is even
        double numEven = 0;
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] % 2 == 0) {
                numEven++;
            }
        }
        double percentage = (numEven / numElements) * 100;

        System.out.println("The percentage of even numbers is "+ percentage);


        // ***** CHECKPOINT 6 *****
        // Compute/print the percentage of numbers in the range -300 to 300
        double numRange =0;
        for (int i = 0; i < numElements; i++) {
            if (numberArray[i] >= -300 && numberArray[i] <= 300) {
                numRange++;
            }
        }
        double percentage1 = (numRange / numElements) * 100;

        System.out.println("The percentage of numbers in the range -300..300 is "+ percentage1);

        // ***** CHECKPOINT 7 *****
        // Sort the numbers and print them out
        
        for (int i = 0; i < numElements; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[j] > numberArray[i]) {
                    int temp = numberArray[i];
                    numberArray[i] = numberArray[j];
                    numberArray[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < numElements; i++) {
            System.out.print(numberArray[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        
        // ***** CHECKPOINT 8 *****
        // Print the sorted numbers up to 10 per line
        // HINT: This can be done inside the loop from Checkpoint 7
        
    }
        
        
    /* 
     * Justification: The comment was added to make it clear that students don't need to create a separate loop for Checkpoint 8.
     * It's common for students to see new instructions and immediately think: "time to write new code for this", but in this case,
     * it makes more sense to combine it with the existing loop from Checkpoint 7.
     * 
     * Context: By Checkpoint 7, students have already written a loop to iterate through and print the numbers. Checkpoint 8 builds
     * directly on this by asking them to add formatting. The comment assumes that students have implemented a straight forward loop in
     * Checkpoint 7 and prompts them to add a condition for line breaks within that same loop. 
     * 
     * Importance: This hint allows students to build better coding habits. It shows them how to be efficient by combining tasks to avoid
     * extra work as well as writing clean code by keeping things simple and organized. Additionally, it shows the importance of nested loops. 
     * By adding this comment, this guides the students towards the idea of not having to rewrite loops that loop through the same contents.
     * The student learns how to iterate through a collection systematically and introduces them to additional logic inside loops by adding
     * more than just one condition inside a loop.
     */
        
        
    
    private static int getNumElements() {
        Scanner keyboard = new Scanner(System.in); // set up for keyboard input

        // prompt user for file name; read file name
        System.out.print("Number of elements: ");
        System.out.flush();
        
        return keyboard.nextInt();
    }

    private static int[] createNumberArray(int numElements) {
        Random rand = new Random();
        return rand.ints(numElements, -1000, 1001).toArray();
    }
}