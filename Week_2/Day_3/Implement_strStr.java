package Week_2.Day_3;

class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,m+i).equals(needle)) return i;
        }
        return -1;
    }
}

