import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={1,4,5,8,3,2};
//        System.out.println(maxIndex(arr,0,arr.length-1));
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int [] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int max=maxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static void swap(int []arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int maxIndex(int []arr,int start,int end)
    {
        int max=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
}
