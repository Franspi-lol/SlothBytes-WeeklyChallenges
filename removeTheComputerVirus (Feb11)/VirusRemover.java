public class VirusRemover {

    /**
     * The main method demonstrates the remove_virus method with a sample input string.
     *
     * @author Franco Bernardele
     */
    public static void main(String[] args) {
        System.out.println(remove_virus("PC Files: spotifysetup.exe, virus.exe, dog.jpg, lethalmalware.exe, antivirus.exe"));
    }

    /**
     * Removes file names containing "virus" or "malware" from an input string, unless they also contain "anti" or "not".
     *
     * @param input The input string containing a list of file names separated by spaces.
     * @return A string with the virus and malware file names removed.
     * @author Franco Bernardele
     */
    public static String remove_virus(String input) {
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("virus")) {
                if ((!words[i].contains("anti")) && (!words[i].contains("not"))) {
                    words[i] = "";
                }
            }
            if (words[i].contains("malware")) {
                if ((!words[i].contains("anti")) && (!words[i].contains("not"))) {
                    words[i] = "";
                }
            }
        }
        return String.join(" ", words);
    }
}

