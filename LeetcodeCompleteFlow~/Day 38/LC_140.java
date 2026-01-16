class LC_141 {
    HashSet<String> set;
    HashMap<String, List<String>> memo;

    public List<String> wordBreak(String s, List<String> wordDict) {
        set = new HashSet<>(wordDict);
        memo = new HashMap<>();
        return dfs(s);
    }

    private List<String> dfs(String s) {
        if (memo.containsKey(s)) return memo.get(s);

        List<String> res = new ArrayList<>();

        if (s.length() == 0) {
            res.add("");
            return res;
        }

        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            if (set.contains(prefix)) {
                List<String> rest = dfs(s.substring(i));
                for (String r : rest) {
                    if (r.equals(""))
                        res.add(prefix);
                    else
                        res.add(prefix + " " + r);
                }
            }
        }

        memo.put(s, res);
        return res;
    }
    public static void main(String[] args) {
      
    }
}
