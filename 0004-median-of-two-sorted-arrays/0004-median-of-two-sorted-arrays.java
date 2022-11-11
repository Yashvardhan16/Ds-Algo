class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList();
        List<Integer> b = new ArrayList();
        for(int i:nums1)a.add(i);
        for(int i:nums2)b.add(i);
         int p1 = 0;
        int p2 =0;
        List<Integer> list = new ArrayList();
        while(p1<a.size() &&p2<b.size()){
            if(a.get(p1)<b.get(p2)){
                list.add(a.get(p1));
                p1++;
            }else{
                 list.add(b.get(p2));
                p2++;
            }
        }
        while(p1<a.size()){
             list.add(a.get(p1));
                p1++;
        }
        while(p2<b.size()){
             list.add(b.get(p2));
                p2++;
        }
    
        
        if(list.size()%2==1){
           return list.get(list.size()/2);
        }else{
          return (list.get(list.size()/2) + list.get(list.size()/2-1))/2.0;
        }
    }
}