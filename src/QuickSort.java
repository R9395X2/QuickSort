import java.util.Arrays;
public class QuickSort {
     static int[] a={31,24,6,41,3,1,96,40};
    public static void main(String[] args) {
        System.out.println("排序前:"+Arrays.toString(a));
        quickSort(a,0,a.length-1);
        System.out.println("排序后:"+Arrays.toString(a));
    }
    static void quickSort(int[] a, int L, int R){
        if(L>R)
            return;
        int tmp=a[L],left=L,right=R;
        while (left<right){
            while (left<right&&a[right]>=tmp){ //右大于temp，右指针往左移动
                right--;
            }
            if(a[right]<tmp){ //右小于temp，右赋值给左
                a[left]=a[right];
                left++;
            }
            while (left<right&&a[left]<=tmp){  //左小于temp，左指针往右移动
                left++;
            }
            if(a[left]>tmp){ //左大于temp，左赋值给右
                a[right]=a[left];
                right--;
            }
        }
        a[left]=tmp; //temp位置固定
        quickSort(a,L,right-1);
        quickSort(a,left+1,R);
    }
}
