import java.util.Scanner;

public class Test2 {
	/**
	 * Cette class utilise une m�thode main qui affiche � la console un choix � faire par l'utilisateur celui-ci choisit entre 1 et 2.
	 * Si le 1 est choisi la classe Le cryptage de c�sar est lanc� (crypter1 , decrypter1).
	 * Si le 2 est choisi la classe le crypatge de vigen�re est lanc� (crypter2, d�crypter2).
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Quels decryptages voulez vous utiliser ? Tapez 1 ou 2 ");
		int choix =Integer.parseInt(sc.nextLine()) ;

			if(choix==1){
				CryptageTest c=new CryptageTest() ;
				System.out.println("\n"+"Saisissez votre phrase :");
				String message = sc.nextLine();

				System.out.println("Saisissez votre clef entre 1 et 10:");
				int clef = Integer.parseInt(sc.nextLine());

					if (clef>0 && clef<=10){

						System.out.println("Voici votre message crypt�:");
						System.out.println(c.crypter1(message, clef));
						String result=c.crypter1(message, clef);
						System.out.println("\n"+"Voici votre message d�crypt�:");
						c.decrypter1(result, clef);
					}else{
						System.out.println("Votre clef doit �tre compris entre 1 et 10");
				}
			
			}else{
				CryptageTest c=new CryptageTest() ;
				System.out.println("Saisissez votre message sans espace ni de majuscule ni de caract�res sp�ciaux :");
				String message = sc.nextLine();
				System.out.println("Saisissez votre clef constitu�e de lettre il faut que la clef soit de la meme longueur que votre message :");
				String clef = sc.nextLine();
				c.initTableauAphabet();
				System.out.println("\n"+"Voici votre phrase crypt�e :");
				System.out.println(c.crypter2(message, clef));
				String result = c.crypter2(message, clef);
				System.out.println("\n"+"Voici votre phrase decrypt�e :");
				c.decrypter2(result, clef);
				}
		}

}
