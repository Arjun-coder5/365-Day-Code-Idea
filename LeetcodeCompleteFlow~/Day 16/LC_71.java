import java.util.*;

public class LC_71{
    public static String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> st = new Stack<>();
        for (String p : parts) {
            if (p.equals("") || p.equals(".")) continue;
            else if (p.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else st.push(p);
        }
        return "/" + String.join("/", st);
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}
