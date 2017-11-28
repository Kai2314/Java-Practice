package Algorithm;

/**
 *
 * 最差時間複雜度：O(n2)
 最佳時間複雜度：O(n2)
 平均時間複雜度：O(n2)
 額外最差空間複雜度：O(1)
 */
public class SelectSort {
    public void toSelectSort(int[] array){
        int index;
        for(int i=0;i<array.length-1;i++){
            index = i ;
            for(int j=i+1;j<array.length;j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            if(index != i){
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        for(int outArr : array){
            System.out.print(outArr+" ");
        }
    }
}
