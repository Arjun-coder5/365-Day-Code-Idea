import java.util.*;
class Ques_3 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int idx = asteroids[i];

            if (idx > 0) {
                st.push(idx);
            } else {
                while (!st.isEmpty() && st.peek() > 0) {
                    if (Math.abs(st.peek()) < Math.abs(idx)) {
                        st.pop();
                    } else if (Math.abs(st.peek()) == Math.abs(idx)) {
                        st.pop();
                        idx = 0;
                        break;
                    } else {
                        idx = 0;
                        break;
                    }
                }
                if (idx != 0) {
                    st.push(idx);
                }
            }
        }

        int[] result = new int[st.size()];
        for (int j = result.length - 1; j >= 0; j--) {
            result[j] = st.pop();
        }

        return result;
    }
}