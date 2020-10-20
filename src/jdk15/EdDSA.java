package jdk15;

import java.security.*;

public class EdDSA {

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        KeyPairGenerator keyPairGen = KeyPairGenerator.getInstance("Ed25519");
        KeyPair keyPair = keyPairGen.generateKeyPair();
// use Ed25519 algorithm
        Signature signature = Signature.getInstance("Ed25519");
        signature.initSign(keyPair.getPrivate());
        signature.update(Byte.parseByte("HELLO"));
        byte[] s = signature.sign();
        System.out.println(s);
    }
}
