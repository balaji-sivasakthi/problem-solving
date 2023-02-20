import com.latrosoft.Sort.Sort;

public class Main {


    public static void main(String[] args) {
        Sort s = new Sort(new int[]{2,3,5,4,9});
//        s.insertionSort();
        s.selectionSort();
        s.printArr();
    }
}

