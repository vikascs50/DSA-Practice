public class ReverseWords {
    public static void main(String[] args) {
        String input = "I love India";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }

        return result.toString().trim();
    }

}
