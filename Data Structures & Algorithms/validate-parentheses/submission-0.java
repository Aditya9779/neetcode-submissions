class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty())
            return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '{' || a == '[' || a == '(') {
                stack.push(a);
            } else {
                if (stack.isEmpty())
                    return false;
                char valueInstack = stack.pop(); //{   }
                if (a=='}' && valueInstack != '{' || a==']'&&valueInstack != '[' ||a==')'&& valueInstack != '(') {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
