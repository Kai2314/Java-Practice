package Algorithm;

/**
 *
 * 最差時間複雜度：O(n2)
 最佳時間複雜度：O(n2) (排序正序的陣列)
 平均時間複雜度：O(n2)
 額外最差空間複雜度：O(1)
 */
public class ExchangeSort {
    public ExchangeSort(int[] arr){
        this.toExchangeSort(arr);
    }
    public static void toExchangeSort(int[] array1) {
        int temp;
        for (int i = 0; i < array1.length; i++) {
            for (int j = i + 1; j < array1.length; j++) {
                if(array1[i]>array1[j]) {
                    temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
        for(int outArray : array1){
            System.out.print(outArray + " ");
        }

    }
}
