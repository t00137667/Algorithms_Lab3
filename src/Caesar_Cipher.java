public class Caesar_Cipher {

    public static String encryptCaesarCipher(String plaintext, int offset){
        if (offset >= 26)
            offset = offset - 26;

        String encryptedText = "";

        for (int i = 0; i < plaintext.length(); i++)
        {
            if (plaintext.charAt(i) != ' '){
                int charAsInt = plaintext.charAt(i);
                charAsInt += offset;
                if (charAsInt >= 90)
                    charAsInt -= 26;
                char encryptedChar = (char)charAsInt;
                encryptedText += encryptedChar;
            }
            else
                encryptedText += ' ';
        }
        return encryptedText;
    }

}
