class Solution {
  public:
    void pushZerosToEnd(vector<int>& arr) {
        // code here
         int j=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }
        
        if(j == -1) 
            return a;

      
        for(int i=j+1;i<n;i++){
            if(arr[i] != 0){
                swap(arr[i],arr[j]);
                j++;
            }
        }
        return a;
            }
};
