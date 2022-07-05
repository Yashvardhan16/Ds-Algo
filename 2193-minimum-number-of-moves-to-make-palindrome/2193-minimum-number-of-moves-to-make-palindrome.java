class Solution {
    public int minMovesToMakePalindrome(String s) {
         char []arr=s.toCharArray();
    int start=0;
    int n=s.length();
    int end=s.length()-1;
    int res=0;
    while(start<end)
    {
        int k=end;
        if(arr[start]==arr[end])
        {
            start++;
            end--;
          continue;  
        }
        while(arr[start]!=arr[k])
        {
            k--;
            
        }
        if(k==start)
        {
            res++;
            swap(arr,start,start+1);
        }
        else
        {
            while(k<end)
            {
                res++;
                swap(arr,k,k+1);
                k++;
            }
        }
    }
        
        return res;
}
public static void swap(char arr[],int i,int j)
{
char temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}

}
    
