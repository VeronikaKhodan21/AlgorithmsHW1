public class HeapSorts {
    public static void sort(int[] arr) {
        for (int i = arr.length/ 2 -1 ; i >= 0; i--) {
            heapify(arr, arr.length, i);
        }
        for (int i = arr.length -1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
        
    }
    private static  void heapify(int[] arr, int heapSize, int rootI){
        int lar = rootI;
        int leftChild = 2* rootI +1;
        int righChild = 2* rootI + 2;
        if(leftChild < heapSize && arr[leftChild] > arr[lar]){
            lar = leftChild;
        }
        if(righChild < heapSize && arr[righChild] > arr[lar]){
            lar = righChild;
        }if(lar != rootI){
            int tmp = arr[rootI];
            arr[rootI] = arr[lar];
            arr[lar] = tmp;
            heapify(arr, heapSize, lar);
        }
    }

}
