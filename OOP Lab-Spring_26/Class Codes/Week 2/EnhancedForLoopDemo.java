

public class EnhancedForLoopDemo {
    public static void main(String[] args) {

        int two[][] = new int[3][];

        two[0] = new int[]{1, 2, 4, 6, 7};
        two[1] = new int[]{3, -1};
        two[2] = new int[]{9, 2, 6};

        int sum=0;

        for(int i[]:two)
        {
            for (int j:i)
            {
//                System.out.print(j+" ");
                sum+=j;
            }

//            System.out.println();
        }

        System.out.println(sum);

    }
}
