package Algorithm;

/**
 *
 * 最差時間複雜度：O(n2) (排序逆序的陣列)
 最佳時間複雜度：O(n) (排序正序的陣列)
 平均時間複雜度：O(n2)
 額外最差空間複雜度：O(1)
 */
public class InsertSort {
    public void toInsertSort(int[] arr2){
        int temp;
        for(int i=0;i<arr2.length;i++){
            temp = arr2[i];
            int j = i-1;
            while( j>=0 && arr2[j]>temp){
                arr2[j+1] = arr2[j--];
            }
         arr2[j+1] = temp;
        }
        for(int outarr : arr2){
            System.out.print(outarr+" ");
        }
    }
}
