class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> dest = new HashSet();
        for (int i = 0; i < paths.size(); i++) {
            dest.add(paths.get(i).get(0));
        }
        
        for (int i = 0; i < paths.size(); i++) {
            String finaldest = paths.get(i).get(1);
            if (!dest.contains(finaldest)) {
                return finaldest;
            }
        } 
        return "";
    }
}
