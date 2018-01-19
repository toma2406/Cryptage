
public interface Crypter {
	String crypter1(String message , int clef);
	void decrypter1(String result,int clef);
	
	String crypter2(String message, String clef);
	void decrypter2(String result, String clef);

}
