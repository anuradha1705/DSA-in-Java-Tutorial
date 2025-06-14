/*public class BubbleSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};

        //time complexity = 0(n^2)
        //Bubble Sort

        for(int i = 0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                      arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    
}*/


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}


