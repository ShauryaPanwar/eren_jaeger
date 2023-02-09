package Programming;

public class Binary_search {
    public int searchInsert(int[] n, int t) {
        int mid = (n.length)/2;
        int low=0;
        int high=(n.length);
        
        for(int i=low;i<high;i++){
        if(n[mid]==t){
            return mid;
        }
        else if(t>n[mid])
        {
            low = mid+1;

        }
        else{
            high = mid-1;
        }

        }

        for(int i=0;i<(n.length);i++){
            if(n[i]>t){
                return i;
            }
            else if(n[i]==t){
                return i;
            }
        }
        
        return (n.length);

        
    }

    public static void main(String[]args){
        Binary_search b = new Binary_search();
        int arr[] = {1,3,5,6};
        int target = 7;
        int arr1 = b.searchInsert(arr,target);
        System.out.println(arr1);  
    }
    
}
