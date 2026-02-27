public class Code1 {

    public static void main(String[] args) {

        int [][] arr2D = new int[3][4]; //2D array row = 3 col = 4

        for(int i=0; i< arr2D.length; i++) // arr2D.length gives row
        {
            for(int j=0; j< arr2D[0].length; j++) // arr2D[0].length gives col
            {
                arr2D[i][j] = i*j;
            }
        }

        for(int i=0; i< arr2D.length; i++)
        {
            for(int j=0; j< arr2D[0].length; j++)
            {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        int [][] jArr = new int[3][]; //col can be skipped

        //jArr[0][2] = 10; //cannot access since rows do not point to anything

        jArr[0] = new int[3]; //can set number of cols as we wish
        jArr[1] = new int[4];
        jArr[2] = new int[2];

        for(int i=0; i< jArr.length; i++)
        {
            for(int j=0; j< jArr[i].length; j++) // jArr[i].length to get size of col for each row
            {
                jArr[i][j] = i*j;
            }
        }

        for(int i=0; i< jArr.length; i++)
        {
            for(int j=0; j< jArr[i].length; j++)
            {
                System.out.print(jArr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
