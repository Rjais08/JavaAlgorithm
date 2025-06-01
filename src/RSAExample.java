import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.Base64;

public class RSAExample {

    public static void main(String[] args) {

        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey publicKey = keyPair.getPublic();
            PrivateKey privateKey = keyPair.getPrivate();

            String message = "This message to be Encrypted";

            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");

            cipher.init(Cipher.ENCRYPT_MODE, publicKey);
            byte[] encryptedBytes = cipher.doFinal(message.getBytes());
            String encryptedMessage = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted message :- " + encryptedMessage);

            cipher.init(Cipher.DECRYPT_MODE, privateKey);
            byte[] decryptedBytes = Base64.getDecoder().decode(encryptedMessage);
            String decryptedMessage = new String(cipher.doFinal(decryptedBytes));
            System.out.println("Decrypted Message :- " + decryptedMessage);





        } catch (Exception  e) {
            throw new RuntimeException(e);
        }

    }

}
