package Algorithm;

/**
 *
 */
public class AlgorithmTest {
    static int[] array1 = new int[]{69, 81, 46, 87, 3, 27, 48, 2, 19, 70};
    static int[] array2 = new int[]{69, 81, 30, 20, 9, 2, 47, 34, 39, 79};
    static int[] array3 = new int[]{69, 81, 30, 38, 9, 6, 47, 61, 32, 79};
    static int[] array4 = new int[]{69, 81, 27, 38, 9, 2, 47, 68, 32, 79};
    static int[] array5 = new int[]{69, 101, 30, 44, 9, 2, 4, 61, 30, 79};
    public static void main(String[] args) {


        System.out.println("\n------交換排序-------");
        ExchangeSort exchangeSort = new ExchangeSort(array1);
        System.out.println("\n------選擇排序-------");
        SelectSort selectSort = new SelectSort();
        selectSort.toSelectSort(array2);
        System.out.println("\n------插入排序-------");
        InsertSort insertSort = new InsertSort();
        insertSort.toInsertSort(array3);
        System.out.println("\n------快速排序-------");
        QuickSort.toQuickSort(array4,0,array4.length);
        for(int outArr : array4){
            System.out.print(outArr +" ");
        }
        System.out.println("\n------合併排序-------");
        MergeSortRecursive.toMergeSortRecursive(array5,new int[array5.length],0,array5.length);
        for(int outArray : array5){
            System.out.print(outArray+ " ");
        }
    }
}
