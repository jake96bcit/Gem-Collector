
public class Compare3 {

    /**
     * 
     * @param c1
     * @param c2
     * @param c3
     * @return
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static Comparable largest(Comparable c1, Comparable c2, Comparable c3) {
        Comparable max = c1;
        if (c2.compareTo(max) == 1) {
            max = c2;
        }
        if (c3.compareTo(max) == 1) {
            max = c3;
        }
        return max;
    }
}
