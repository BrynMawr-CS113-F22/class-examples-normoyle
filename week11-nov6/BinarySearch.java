class BinarySearch {

    // Search for the value x in the list L using binary search
    // Input x: the value to search for (int)
    // Input L: an array containing values
    // Returns (int): the index of x in L; -1 if x is not in L
    public static int search(int x, int[] L) {
        int low = 0;
        int high = L.length-1;
        while (low <= high) {
            int mid = (low + high)/2;
            System.out.println(low + " " + mid + " " + high + " " + L[mid]);
            
            if (x > L[mid]) {
                low = mid+1;
            }
            else if (x < L[mid]) {
                high = mid-1;
            }
            else {
                return mid;
            }
        }
        System.out.println(low + " " + high);
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] numbers = {-20, -4, 44, 58, 87, 99, 145};
        int val = 87;
        int index = search(87, numbers);
        if (index != -1) {
            System.out.println("We found "+val+" at location "+index); 
        }
        else {
            System.out.println("We didn't find " + val); 
        }
        
        index = search(-1, numbers);
        System.out.println("Search 30: " + index);
    }
}