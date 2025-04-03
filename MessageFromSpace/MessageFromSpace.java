package MessageFromSpace;

public class MessageFromSpace {
    /**
     * Decodes a message from space by repeating characters within brackets a specified number of times.
     *
     * @param mensaje The encoded message string.
     * @return The decoded message string.
     * @author Franco Bernardele
     */
    public static String spaceMessage(String mensaje) {
        StringBuilder mensajeResuelto = new StringBuilder();

        String[] words = mensaje.split("\\[|\\]");

        for (String word : words) {
            if (word.matches("\\d+.*")) {
                int repeatCount = Character.getNumericValue(word.charAt(0));
                String letters = word.substring(1);

                mensajeResuelto.append(letters.repeat(Math.max(0, repeatCount)));

            } else {
                mensajeResuelto.append(word);
            }
        }

        return mensajeResuelto.toString();
    }

    public static void main(String[] args) {
        System.out.println(spaceMessage("AB[3CD]")); // Output: ABCDCBCD
        System.out.println(spaceMessage("IF[2E]LG[5O]D")); // Output: IFEELGOOOOOOD
    }
}