public class ArrayExs {
    public static void main(String[] args){
        double val = 3.0;
        double[] vals = {3.0, 6.0, 7.0, -2.5};

        boolean[] flags = {true, false};

        String[] greetings = {"hi", "hola", "ciao", "aloha"};
        String greeting = greetings[0];
        System.out.println(greeting);

        int[] sequence = new int[10];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = i+1;
        }

        // TODO: Print out the values of sequence
        for (int i = 0; i <sequence.length; i++) {
            System.out.println(sequence[i]);
        }

        int[] empty = null; // int[] cannot be used until it is initialized
        // throws exception if we try to use a null (e.g. unintialized array)
        //int test = empty[0]; 

        empty = new int[5]; // now empty has allocated space + can be used.
    }

}
