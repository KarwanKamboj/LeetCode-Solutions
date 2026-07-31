class Solution {
    public int minimumPushes(String word) {
        int freq[] = new int[26];
        for (char i : word.toCharArray()) {
            freq[i - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0;
        
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] == 0)
                break;

            if (i >= 18)
                count += freq[i];
            else if (i >= 10)
                count += freq[i] * 2;
            else if (i >= 2)
                count += freq[i] * 3;
            else
                count += freq[i] * 4;
        }
        return count;
    }
}