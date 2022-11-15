package LoginSystem;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;


public final class PasswordManager {
    public static final int DEFAULT_COST = 16;
    public static final int KEY_LENGTH = 128;
    public static final String ALGORITHM = "PBKDF2WithHmacSHA1";

    private static byte[] getSalt() throws NoSuchAlgorithmException {
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
        byte[] salt = new byte[16];
        sr.nextBytes(salt);
        return salt;
    }

    public static String hashPassword(char[] originalPassword){
        return hashPassword(originalPassword, DEFAULT_COST);
    }

    private static int getIteration(int cost) {
        if ((cost < 0) || (cost > 30))
            throw new IllegalArgumentException("cost: " + cost);
        return 1 << cost;
    }

    public static String hashPassword(char[] originalPassword, int cost) {
        int iterations = getIteration(cost);
        try {
            byte[] salt = getSalt();
            byte[] hash = pbkdf2(originalPassword, salt, iterations);
            return iterations + ":" + toHex(salt) + ":" + toHex(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Missing algorithm: SecureRandom Salt", e);
        }
    }


    @Deprecated
    public static String hashPassword(String originalPassword) {
        return hashPassword(originalPassword.toCharArray());
    }


    @Deprecated
    public static String hashPassword(String originalPassword, int cost) {
        return hashPassword(originalPassword.toCharArray(), cost);
    }


    public static boolean verifyPassword(char[] inputPassword, String hashedPassword) {
        String[] storedParts = hashedPassword.split(":");
        int iterations = Integer.parseInt(storedParts[0]);
        byte[] salt = fromHex(storedParts[1]);
        byte[] hash = fromHex(storedParts[2]);

        byte[] inputHash = pbkdf2(inputPassword, salt, iterations);

        int difference = hash.length ^ inputHash.length;
        for(int i = 0; i < hash.length && i < inputHash.length; i++)
        {
            difference |= hash[i] ^ inputHash[i];
        }
        return difference == 0;
    }

    private static byte[] pbkdf2(char[] password, byte[] salt, int iteration)
    {
        PBEKeySpec spec = new PBEKeySpec(password, salt, iteration, KEY_LENGTH);
        try {
            SecretKeyFactory f = SecretKeyFactory.getInstance(ALGORITHM);
            return f.generateSecret(spec).getEncoded();
        }
        catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Missing algorithm: " + ALGORITHM, e);
        }
        catch (InvalidKeySpecException e) {
            throw new IllegalStateException("Invalid SecretKeyFactory", e);
        }
    }


    private static String toHex(byte[] array) {
        BigInteger bi = new BigInteger(1, array);
        String hex = bi.toString(16);

        int paddingLength = (array.length * 2) - hex.length();
        if(paddingLength > 0)
        {
            return String.format("%0" + paddingLength + "d", 0) + hex;
        }else{
            return hex;
        }
    }

    private static byte[] fromHex(String hex) {
        byte[] bytes = new byte[hex.length() / 2];
        for(int i = 0; i < bytes.length ;i++)
        {
            bytes[i] = (byte)Integer.parseInt(hex.substring(2 * i, 2 * i + 2), 16);
        }
        return bytes;
    }
}
