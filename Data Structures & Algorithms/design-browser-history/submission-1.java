class BrowserHistory {
    private List<String> history;
    private int cur;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
        cur = 0;
    }
    
    public void visit(String url) {
        cur++;
        history = history.subList(0, cur);
        history.add(url);
    }
    
    public String back(int steps) {
        cur = Math.max(0, cur - steps);
        return history.get(cur);
    }
    
    public String forward(int steps) {
        cur = Math.min(history.size() - 1, cur + steps);
        return history.get(cur);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */