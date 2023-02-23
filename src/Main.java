import com.latrosoft.Sort.Sort;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
      Sort s = new Sort(new int[]{3,6,2,8,5,1});
      int a[]=s.mergeSort(s.getArr());
      for(int i=0;i<a.length;i++){
          System.out.print(a[i]+" ");
      }
    }
}

