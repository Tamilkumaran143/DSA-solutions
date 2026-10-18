
import java.util.*;

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> count = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                count.push(count.pop() + 1);
            } else {
                stack.push(ch);
                count.push(1);
            }

            if (count.peek() == k) {
                stack.pop();
                count.pop();
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty()) {
            char ch = stack.pop();
            int c = count.pop();
            for (int j = 0; j < c; j++) {
                ans.append(ch);
            }
        }

        return ans.reverse().toString();
    }
}

