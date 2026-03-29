

public class JaggedArrayDemo {
    public static void main(String[] args) {

        int two[][] = new int[3][];

        two[0] = new int[]{1, 2, 4, 6, 7};
        two[1] = new int[]{3, -1};
        two[2] = new int[]{9, 2, 6};

        int sum2=0;

        for (int i=0;i<two.length;i++)
        {
            for(int j=0;j<two[i].length;j++)
            {
                sum2+=two[i][j];
//                System.out.print(two[i][j]+" ");
            }
//            System.out.println();
        }
        System.out.println(sum2);

    }
}
