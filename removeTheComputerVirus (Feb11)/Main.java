//February 11th. Franco Bernardele

public static void main (){
    System.out.println(remove_virus("PC Files: spotifysetup.exe, virus.exe, dog.jpg, lethalmalware.exe, antivirus.exe"));
}

public static String remove_virus(String input) {
    String[] words = input.split(" ");
    for (int i = 0; i < words.length; i++) {
        if (words[i].contains("virus")){
            if ((!words[i].contains("anti"))&&(!words[i].contains("not"))){
                words[i] = "";
            }
        }
        if (words[i].contains("malware")){
            if ((!words[i].contains("anti"))&&(!words[i].contains("not"))){
                words[i] = "";
            }
        }
    }
    return String.join(" ", words);
}


