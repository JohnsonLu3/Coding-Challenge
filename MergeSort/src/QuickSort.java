public class QuickSort {

    public int[] sort(int[] Arr){

        sort(Arr, 0, Arr.length-1);
        return Arr;
    }

    /*
                pi
               /  \     ===>  [L , pi , R]
              L    R
     */


    private int[] sort(int[] Arr, int L, int R){

        if(L < R){
            int part = partition(Arr, L, R);
            sort(Arr, L, part-1);
            sort(Arr, part+1, R);
        }
        return Arr;
    }

    // partition on last
    private int partition(int[] Arr, int L, int R){

        int pivot = Arr[R];
        int k = L;
        for(int i = L; i < R; i++){
            if(Arr[i] <= pivot){

                int temp = Arr[k];
                Arr[k] = Arr[i];
                Arr[i] = temp;
                k++;
            }
        }

        int temp = Arr[k];
        Arr[k] = Arr[R];
        Arr[R] = temp;

        return k;
    }
}
