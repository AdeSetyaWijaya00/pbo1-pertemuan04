package Perulangan;

public class MultiDimensi {
    public static void main(String[] args) {

        int matrikA[][] =   {{7,9,5},
                            {1,5,0},
                            {4,1,3}};
        int matrikB[][] =   {{5,5,3},
                            {4,9,0},
                            {8,6,2}};

        System.out.println("Matrik A");
        for (int i = 0; i < matrikA.length; i++)
        {
            for (int j = 0; j<matrikA[i].length; j++)
            {
              System.out.println(matrikA[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("");
        System.out.println("Matrik B");

        for (int k = 0; k < matrikB.length; k++)
        {
            for (int l = 0; l<matrikB[0].length; l++)
            {
                System.out.println(matrikB[k][l] + " ");
            }
            System.out.println();
        }
    }
}
