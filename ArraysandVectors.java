public class ArraysandVectors {
    public static void main(String[] args) {

        System.out.println("\nWelcome to the Array Program!!!!!!!!!!!\n");

        // Create an int array
        int[] myNumbers = new int[8];

        // Fill the array
        myNumbers[0] = 1;
        myNumbers[1] = 3;
        myNumbers[2] = 5;
        myNumbers[3] = 7;
        myNumbers[4] = 9;
        myNumbers[5] = 11;
        myNumbers[6] = 13;
        myNumbers[7] = 15;

        //Output

        System.out.println("Z:myNumbers:[0] = " + myNumbers[3]);

        System.out.println("\n\n");

        for (int i = 0; i < 8; i++ ) {
            // print out elements of array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        // Fill array with 5's
        int myFiveContainer = 0;
        for (int i = 0; i < 8; i++) {
            // fill out elements of the array
            myNumbers[i] = myFiveContainer += 5;

        }
        System.out.println("This array should print out an order in 5's");
        for (int i = 0; i < 8; i++ ) {
            // print out elements of array
            System.out.println("myNumbers[" + i + "] is: " + myNumbers[i]);
        }

        int [][] numberGrid = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0}
        };

        for (int i = 0; i < numberGrid.length; i++) {
            for(int j = 1; j < 4; j++) {
                System.out.println("i= " + i + ", j= " + j);
            }
            // 2d array
            int [][] myNumberGrid = new int [4][3];

            // fill array
            for (int i = 0; i < 4; i++){
                for (int j = 0; j < 3; j++) {
                    myNumberGrid[i][j] = myFiveContainer += 5;
                }
            // output
                for (int j = 0; i < 4; i++){
                    for (int i = 0; j < 3; j++) {
                    }
                        System.out.print(myNumberGrid[i][j]);
                    }


            }
        }
    }
}