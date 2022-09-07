//TODO: Try commenting out the next 4 lines with one command
Author: Your name
Date: 9/6/2022
This is a multiline comment. 
An example program using an array. 

class Practice {

  public static void main(String[] args) {
    int i = 0;
    int size = 0;

    // declare array of 10 ints
    // TODO: Try to rename my_arr to values, everywhere in the file
    int[] my_arr = new int[10];
    my_arr[0] = 0; // TODO: Delete this line

    // set the value of each array element
    for (i = 0; i < 10; i++) {
      my_arr[i] = i;
      size++;
    }

    // set values at positions 3,4,5
    // TODO: Copy the following line twice and change the indices
    // TODO: Change the value from 100 to 50
    my_arr[3] = 100;

    // print each element of the array
    for (i = 0; i < 10; i++) {
      System.out.printf("%d\n", my_arr[i]);
    }
  }
}
