package encryptdecrypt;

public class EncryptAndDecrypt {
    StringBuilder stringBuilder = new StringBuilder();

    protected String encryptDecryptMessage(String messageToBeEncrypted, int keyShift) {
        char[] messageToChars = messageToBeEncrypted.toCharArray();

        for (int i = 0; i < messageToChars.length; i++) {
            char shiftedChar = (char) (messageToChars[i] + keyShift);
            stringBuilder.append(shiftedChar);
        }
        return stringBuilder.toString();
    }
}
