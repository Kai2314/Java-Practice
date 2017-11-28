package Algorithm;

/**
 * 最差時間複雜度：O(n2)
 最佳時間複雜度：O(nlogn)
 平均時間複雜度：O(nlogn)
 額外最差空間複雜度：O(logn)(遞迴)、O(n)(迭代)
 */
public class QuickSort {
    public static void toQuickSort(int[] arr,int start,int end){
        int pivot = arr[start];
        int left=start+1;
        int right = end-1;
        while(true){
            while(arr[right] >= pivot && right>start){
                right--;
            }
            while(arr[left] <= pivot && left<right){
                left++;
            }
            if(left < right){
                Swap(arr,left,right);
            }else{
                if(right>start){
                    Swap(arr,start,right);
                }
                break;
            }
        }
        if(right-start>1){
            toQuickSort(arr,start,right);
        }

        if(end-left>1){
            toQuickSort(arr,left,end);
        }

    }
    public static void Swap(int[] arr,int left,int right){
        int temp;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
