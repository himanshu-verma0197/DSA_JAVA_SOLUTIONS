public class palin_string {
    public static void main(String args[]) {
        String st = "aabaaabababaabaab";
        String pattern = "abab";
        if (st.contains(pattern)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
