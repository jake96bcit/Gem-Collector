package testName;

public class Name {

    public Name() {
    }
    
    private static String formatName(String name) {
        String[] words = name.split(" +");
        String newName = "";
        int i = 0;
        while (i < words.length) {
            int j = 0;
            String word = words[i];
            System.out.println(word);
            String newWord = "";
            while (j < word.length()) {
                 if (j == 0) {
                     newWord = String.valueOf(word.charAt(j)).toUpperCase();
                 } else {
                     newWord = newWord + String.valueOf(word.charAt(j)).toLowerCase();
                 }
                 j = j + 1;
            }
            if (newName == "") {
                newName = newWord;
            } else {
                newName = newName + " " + newWord;
            }
            i = i + 1;
        }
        return newName;
    }
    
    public static void main(String[] args) {
        System.out.println(formatName("david beckam     zidan"));
    }

}
