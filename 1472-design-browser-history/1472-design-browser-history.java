class BrowserHistory {
 Map<Integer,String> map;
    int curr= 0;
    public BrowserHistory(String homepage) {
         map= new HashMap();
        map.put(curr,homepage);
    }
    
    public void visit(String url) {
         curr++;
        map.put(curr,url);

        for(int i=curr+1;map.containsKey(i);i++){
            map.remove(i);
        }
    }
    
    public String back(int n) {
          curr = Math.max(0,curr-n);
        return map.get(curr);
    }
    
    public String forward(int n) {
         curr = Math.min(curr+n,map.size()-1);
        return map.get(curr);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */