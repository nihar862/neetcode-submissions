class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> dq = new ArrayDeque<>();

        for(String token : tokens) {
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {

                int second = dq.pop();
                int first = dq.pop();

                int res = switch (token) {
                    case "+" -> first + second;
                    case "-" -> first - second;
                    case "*" -> first * second;
                    case "/" -> first / second;
                    default -> 0;
                };

                dq.push(res);
            } else {
                dq.push(Integer.parseInt(token));
            }
        }
        return dq.pop();
    }
}