

public class ArrayInitialization {
    public static void main(String[] args) {

//        int arr[] = new int[5];

//        int arr[] = new int[]{1,2,4,5};

        int arr[] = {1,2,4,-5};


//        for(int i=0;i<4;i++)
//        {
//            System.out.println(arr[i]);
//        }

        int prod = 1;

        // 1D Array Printing
        System.out.println("1D Array Elements:");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Sum of 1D Array
        int sum1D = 0;
        for(int i=0; i<arr.length; i++) {
            sum1D += arr[i];
        }
        System.out.println("Sum of 1D Array: " + sum1D);

        // Product of 1D Array
        int prod1D = 1;
        for(int i=0; i<arr.length; i++) {
            prod1D *= arr[i];
        }
        System.out.println("Product of 1D Array: " + prod1D);

        // 2D Array
        int arr2D[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // 2D Array Printing
        System.out.println("\n2D Array Elements:");
        for(int i=0; i<arr2D.length; i++) {
            for(int j=0; j<arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // Sum of 2D Array
        int sum2D = 0;
        for(int i=0; i<arr2D.length; i++) {
            for(int j=0; j<arr2D[i].length; j++) {
                sum2D += arr2D[i][j];
            }
        }
        System.out.println("Sum of 2D Array: " + sum2D);

        // Product of 2D Array
        int prod2D = 1;
        for(int i=0; i<arr2D.length; i++) {
            for(int j=0; j<arr2D[i].length; j++) {
                prod2D *= arr2D[i][j];
            }
        }
        System.out.println("Product of 2D Array: " + prod2D);

    }
}
