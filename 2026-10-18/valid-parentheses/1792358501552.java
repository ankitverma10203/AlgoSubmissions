for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

        }
            if (!pair.containsKey(ch)) {
        pair.put(']','[');
        pair.put('}','{');
                stack.offerLast(ch);
            } else if (!stack.isEmpty() && stack.peekLast() == pair.get(ch)) {
                stack.pollLast();
            } else {
                return false;
            }
        pair.put(')','(');
        Map<Character, Character> pair = new HashMap<>();
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
    }
        
        return stack.isEmpty();
}