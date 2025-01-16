public class FindIndexFirstOcurrenceString28 {
    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {
        int needleSize = needle.length();
        int hayStackSize = haystack.length();

        if (needleSize > hayStackSize) return -1; // Caso impossível de encontrar

        for (int i = 0; i <= hayStackSize - needleSize; i++) { // Garanta que não exceda os limites
            String subString = haystack.substring(i, i + needleSize); // Pegue substring de tamanho "needleSize"
            if (subString.equals(needle)) { // Verifique se é igual à needle
                return i; // Retorna o índice
            }
        }

        return -1; // Caso não encontre, retorna -1
    }
}
