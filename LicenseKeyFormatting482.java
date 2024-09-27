public class LicenseKeyFormatting482 {
    public static void main(String[] args) {
        int k = 4;
        String s = "5F3Z-2e-9-w";
        System.out.println(licenseKeyFormatting(s, 4));
    }
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') str.append(Character.toUpperCase(s.charAt(i)));
        }
        StringBuilder result = new StringBuilder();
        int length = str.length();

        int firstGroupLength = length % k;
        if (firstGroupLength > 0) result.append(str.substring(0, firstGroupLength));

        for (int i = firstGroupLength; i < length; i += k) {
            if (result.length() > 0) {
                result.append("-");
            }
            result.append(str.substring(i, i + k));
        }

        return result.toString();
    }
}
