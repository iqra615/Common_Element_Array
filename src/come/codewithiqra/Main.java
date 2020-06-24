package come.codewithiqra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array= {1, 2, 5, 5, 8, 9, 7, 10};
	int[] array2= {1, 0, 6, 15, 6, 4, 7, 0};

        System.out.println("Array :" + Arrays.toString(array));
        System.out.println("Array2:" +Arrays.toString(array2));

        for (int i = 0; i < array.length-1; i++)
        {
            for (int j=0; j<array2.length-1; j++)
            {
                if (array[i] == array2[j])
                {
                    System.out.println("Common Element is:"+ array[i]);
                }
            }
        }
    }

}
