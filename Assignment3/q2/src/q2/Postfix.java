package q2;

import java.util.Stack;

public class Postfix {

    public static int cal(int op1, char opr, int op2) {
        switch (opr) {
            case '+': return op1 + op2;
            case '-': return op1 - op2;
            case '/': return op1 / op2;
            case '*': return op1 * op2;
            case '%': return op1 % op2;
            case '$': return (int) Math.pow(op1, op2);
        }
        return 0;
    }

    public static int postfixEvaluate(String expr) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            if (expr.charAt(i) == ' ') continue;

            String num = "";
            while (i < expr.length() && expr.charAt(i) != ' ') {
                num += expr.charAt(i);
                i++;
            }

            if (Character.isDigit(num.charAt(0))) {
                st.push(Integer.parseInt(num));
            } else {
                char opr = num.charAt(0);
                int op2 = st.pop();
                int op1 = st.pop();
                int res = cal(op1, opr, op2);
                st.push(res);
            }
        }


        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "45 61 * 32 / 69 + 47 -";

        System.out.println("Postfix : " + exp);
        int result = postfixEvaluate(exp);
        System.out.println("Result : " + result);
    }
}