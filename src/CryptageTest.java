
public class CryptageTest implements Crypter{
	
	static char[][] tableauAphabet =new char[26][26] ;
	  
	  static void initTableauAphabet(){
		  /**
		   * Cette m�thode intialise le tableau de Vigen�re il prend les 26 lettres de l'alphabet. 
		   * Ainsi une lettre correspond � un alphabet.
		   */
	      char debut='a', lettre ;
	      for(int ligne=0;ligne<26;ligne++){
	          lettre=debut;
	          for(int colonne=0;colonne<26;colonne++) {
	              tableauAphabet[ligne][colonne]=lettre;
	              if (lettre<'z') lettre ++;else lettre='a';
	          }
	          debut++;
	      }
	  }
	  
	  static int indexOf(char[] t, char c){
		  /**
		   * Cette m�thode renvoie l'index du tableau 
		   */
	      int i=0;
	      while(i<t.length && t[i]!=c) i++;
	      	if (i==t.length) return -1; else return i;
	  }

	@Override
	public String crypter1(String message, int clef) {
		/**
		 * @author thomas
		 * Cette m�thode qui crypte une pharse rentr�e par l'utilisateur.
		 * Elle est crypt�e par le biais du code ascii de chaque caract�re contenu dans la phrase.
		 * Chaque lettre de la phrase aura un d�calage qui est donn� par l'utilisateur sous la forme d'une clef comprise entre 1 et 10.
		 * Le code ASCII du caract�re sera son code plus la clef rentr�e par l'utuilisateur.
		 * @param message le message entr� par l'utilisateur 
		 * @param clef la clef entr�e par l'utilisateur 
		 * @return 
		 */
		 String result = "";
		 int longueur = message.length();
		 
		 for (int i=0 ;i<longueur;++i ){
			 char lettre = message.charAt(i);
			 int j =(int)lettre+clef; 
			 char lettremodif=(char) j;
			 result = result+lettremodif;
		 }
		return result;
	 }

	@Override
	public void decrypter1(String result, int clef) {
		/**
		 * @author thomas
		 * Cette m�thode decrypter qui d�crypte le message crypt� anciennement par la class Cryptage
		 * Elle fonctionne comme pour la methode crypter mais dans l'autre sens on va soustraire au code ASCII du caract�re la clef rentr�e par l'utilisateur.
		 * Elle affiche le resultat dans la console.
		 * @param result ; La phrase crypt�e par la m�thode Crypter1.
		 * @param clef; La clef renseign�e par l'utilisateur.
		 */
		String phrase="";
    	for(int i=0;i<result.length();i++){
    		char lettre=result.charAt(i);
    		int codeAscii = (int) lettre-clef;
    		char lettremodif=(char) codeAscii;
    		phrase=phrase+lettremodif;
    	}
    	
    	System.out.println(phrase);
    }

	@Override
	public String crypter2(String message, String clef) {
		  /**
		   * @author thomas
		   * Cette m�thode crypte le message entr� par l'utilisateur avec sa clef.
		   * et retourne le message ainsi crypt�, l'affiche dans la console.
		   * @param message entr� par l'utilisateur 
		   * @param clef entr�e par l'utilisateur 
		   */
		   int ligne, colonne ; String result ="";
		      for(int i=0; i<message.length(); i++) {
		    	  char c=message.charAt(i);
		           ligne=clef.charAt(i)-'a';
		           colonne=c-'a';
		           c=tableauAphabet[ligne][colonne];
		           result=result+c;
		      }
		      return result;
		      
		   }

	@Override
	public void decrypter2(String result, String clef) {
		/**
		 * Cette m�thode d�crypte le code rentr� par l'utilisateur.
		 * @param result le resultat du crypatge du message
		 * @param clef la clef rentr�e par l'utilisateur
		 */
		String phrase="";
		for(int i=0; i<result.length(); i++) {
			char d = result.charAt(i);
	          d=(char)('a'+indexOf(tableauAphabet[clef.charAt(i)-'a'],d));
	          phrase=phrase+d;
	       }
		System.out.print(phrase);
	   }

}
