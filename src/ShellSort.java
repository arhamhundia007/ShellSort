public class ShellSort {
    int [] array;
    public final int [] gap = {7, 4, 3, 1};

    public ShellSort(int[] arr){
        this.array = arr;
    }

    public void sort(){
        int currGap;

        for (int i = 0; i < gap.length; i++) {
            currGap = gap[i];
            for (int j = currGap; j < array.length; j++) {
                for (int k = j - currGap; k >= 0; k = k - currGap) {
                    if (array[k] > array[k + currGap]){
                        swap(k, k + currGap);
                    }
                }
            }

        }
    }


    public void swap(int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
