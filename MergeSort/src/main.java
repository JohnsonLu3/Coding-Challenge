public class main {

    public static void main(String[] args){
        MergeSort ms = new MergeSort();
        QuickSort qs = new QuickSort();
        int[] Arr = new int[]{1,2,5,3,7,8,6,4,0};
        Arr = qs.sort(Arr);


        for(int i : Arr){
            System.out.print(i + " ");
        }
    }
}
