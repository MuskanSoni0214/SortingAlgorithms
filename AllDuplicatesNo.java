import java.util.ArrayList;
import java.util.List;
public class AllDuplicatesNo {
    public static void main(String[] args) {
        int arr[]={3,2,3,4,1,2,7,8};
        System.out.println(allDuplicate(arr));

    }
    static List<Integer> allDuplicate(int []arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i]!=arr[correct])
                swap(arr,i,correct);
            else
                i++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<arr.length;index++)
        {
            if(arr[index]!=index+1)
            {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
    public static void swap(int[]arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
