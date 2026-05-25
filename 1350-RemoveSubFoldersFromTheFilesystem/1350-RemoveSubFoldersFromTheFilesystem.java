// Last updated: 5/25/2026, 11:12:51 AM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = ans.get(ans.size() - 1) + "/";
            if (!folder[i].startsWith(lastFolder)) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}