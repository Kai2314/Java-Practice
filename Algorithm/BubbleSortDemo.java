package Algorithm;



/**
 * 最佳時間複雜度：O(n)
 平均時間複雜度：O(n^2)
 最差時間複雜度：O(n^2)
 空間複雜度：O(1)
 Stable sort：是
 */
public class BubbleSortDemo {
    static int[] array1 = new int[]{69, 81, 30, 38, 9, 2, 47, 61, 32, 79};

    public static void main(String[] args) {
        bubbleSort(array1);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        for(int outArr : arr){
            System.out.print(outArr+" ");
        }
    }

    public static void swap(int[] array, int a, int b) {
        int temp = 0;
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

}
