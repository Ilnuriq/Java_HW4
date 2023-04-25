package For_java_HW;
import java.util.ArrayDeque;
import java.util.Deque;
public class Task_5 {
    public static void main(String[] args) {

        //String str = "()[]"; // true
        // String str = "()"; // true
        // String str = "{[()]}"; // true
        // String str = "()()"; // true
         String str = ")()("; // false
        String openTags  = "({["; 
        String closeTags = ")}]"; 
        boolean res = true;
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (openTags.indexOf(ch) >= 0) {
                deque.offerFirst(ch);
            } 
            else {
                int index = closeTags.indexOf(ch);
                if (index >= 0) {
                    if (deque.size() == 0 || deque.pollFirst() != openTags.charAt(index)) {
                        res = false;
                        break;
                    }
                }
            }
            if (!res)
                break;
        }
        System.out.println(res);
    }
}
       