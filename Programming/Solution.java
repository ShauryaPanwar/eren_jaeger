package Programming;
class Solution {
    public int[] twoSum(int[] n, int t) {
        int a= n.length;
        int low=-1;
        int high=-1;


        for(int i=0;i<a;i++){
        int z=0;
        int k=n[i];
            for(int j=i+1;j<a;j++){
                int m=n[j];
                if((m+k) == t){
                    low=i;
                    high=j;
                    break;
                }


            }
        }
        int arr[] = new int[2];
        arr[0]=low;
        arr[1]=high;
        return arr;
        
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {2,7,11,15};
        int target = 9;
        int arr1[] = s.twoSum(arr,target);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}