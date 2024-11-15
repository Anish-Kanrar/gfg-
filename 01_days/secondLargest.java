class Solution {
    public int getSecondLargest(int[] arr) {
         int n=arr.length;
         if (n < 2) {
            return -1;
        }
       
        int largest=-1;
        int slargest=-1;
        
        //finding the largest element
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        
        // Finding the second largest element
        for(int i=0;i<n;i++){
            if(arr[i]>slargest &&  arr[i] !=largest){
                slargest=arr[i];
        }
    }return slargest;
   
    }
}