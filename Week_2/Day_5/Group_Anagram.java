package Week_2.Day_5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();

            Arrays.sort(ch);
            String k=new String(ch);
            if(!map.containsKey(k)){
                map.put(k,new ArrayList<>());
            }
            map.get(k).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
