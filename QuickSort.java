public class QuickSort {
    public static void main(String[] args){
        int[] data = {14,27,12,56,63,72,8,10};
        QuickSort(data,0,data.length-1);




    }
    public static void QuickSort(int[] array, int first, int last){
        if(first<last){
            int splitPoint;
            int splitVal = array[first];
            int left = first + 1;
            int right = last;

            while(left <= right){
                for(;(left<=right) && (array[left] <= splitVal); left++);
                for(;(left<=right) && (array[right] >= splitVal); right--);
                if(left < right) {
                    int temp = array[right];
                    array[right] = array[left];
                    array[left] = temp;
                }
            }
            splitPoint = right;
            int temp = array[first];
            array[first] = array[splitPoint];
            array[splitPoint] = temp;
            for(int elem: array){
                System.out.print(", " + elem);

            }
            System.out.println(" ");
            System.out.println("First: " + first + " Last: " + last + " splitVal: " + splitVal );
            QuickSort(array,first,splitPoint -1);
            QuickSort(array,splitPoint +1, last);
        }
    }
}
