public class MergeSort {


    private void merge(int[] Arr, int L, int M, int R){

        // get length of sublist
        int L1_len = M-L+1;
        int L2_len = R-M;

        // Create two temp arrays to how the merge sorted elements
        int[] L1 = new int[L1_len];
        int[] L2 = new int[L2_len];

        // Populate the temps
        for(int i = 0; i < L1.length; i++){
            L1[i] = Arr[L+i];
        }
        for(int i = 0; i < L2.length; i++){
            L2[i] = Arr[M+1+i];
        }

        int index1 = 0, index2 = 0;
        int k = L;
        while(index1 < L1_len && index2 < L2_len){
            if(L1[index1] < L2[index2]) {
                Arr[k] = L1[index1];
                index1++;
            }else{
                Arr[k] = L2[index2];
                index2++;
            }

            k++;
        }

        while(index1 < L1_len){
            Arr[k] = L1[index1];
            index1++;
            k++;
        }

        while(index2 < L2_len){
            Arr[k] = L2[index2];
            index2++;
            k++;
        }

    }

    public int[] sort(int[] Arr){
        if(Arr.length == 1) return Arr;

        return sort(Arr, 0, Arr.length-1);
    }

    private int[] sort(int[] Arr, int L, int R){

        if(L < R){
            int mid = (R+L)/2;

            // L is the left most index
            // R is the right most index

            sort(Arr, L, mid);
            sort(Arr, mid+1, R);

            merge(Arr, L, mid, R);
        }

        return Arr;
    }
}
