package labopendu;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lejeudupendu {

	public static void main(String[] args) {

		boolean rejouer=true;


		do {
			String[] mot = {"pomme","poire","cerise","terre","lettre","bleu","vert","rouge","chien","chat","noir","petit","ane","vache","loup","mal","roi","trois","choux","boue","gris","double","fou","sous"}; //création d'un tableau de string pour les mots du pendu
			boolean lettretrouve=false;
			int i;
			int m=0;
			int longueur;
			int choix;
			int nb=0;
			int cpt=7;
			String motstock;
			char[] tabVisible;
			boolean gagne=false, pendu= false;
			String jouer;


			System.out.println("*******************************");
			System.out.println("Bienvenue dans le jeu du pendu");					//affichage du jeu
			System.out.println("*******************************");

			System.out.println("Pour jouer, tapez 1");
			System.out.println("*******************************");

			choix=(new Scanner(System.in)).nextInt();

			while(choix>1 || choix<1) {												//empecher le joueur de taper un autre chiffre que 1

				choix=(new Scanner(System.in)).nextInt();

			}

			System.out.println();
			Random r = new Random();												
																					//Création d'un random pour choisir un mot au hasard dans ma liste
			nb=r.nextInt(0,mot.length);											
			motstock=mot[nb];														//stock le mot tiré au hasard
			longueur=motstock.length();

			char tabmotstock[];
			tabmotstock=motstock.toCharArray();										//Transforme les mots en caractère ("mot" --> 'm' 'o' 't')
			tabVisible= new char[tabmotstock.length];								//le tabVisible fait la longueur du mot tiré au hasard
			for(i=0;i<tabmotstock.length;i++) {

				tabVisible[i]='-';													//Le tabVisible utilise le nombre de tiret nécessaire pour la longueur du mot
				//System.out.print(tabVisible[i] + "\t");
			}

			System.out.println("");
			System.out.println("A vous de deviner le mot, tapez une lettre");
			System.out.println("");
			

			while( gagne==false && pendu==false) {									//boucle qui permet de continuer à mettre une lettre tant que le jeu n'est pas fini


				for(i=0;i<tabVisible.length;i++) {

					System.out.print(tabVisible[i] + "\t");

				}
				System.out.println();
				System.out.println("entrez une lettre");
				char lettresaisie = (new Scanner(System.in)).nextLine().charAt(0);	//l'utilisateur entre une lettre
				lettretrouve=false;
				for(i=0;i<tabmotstock.length;i++) {

					if(lettresaisie==tabmotstock[i]) {

						tabVisible[i]=lettresaisie;
						lettretrouve=true;

					}
				}

				gagne=true;
				for(i=0;i<tabVisible.length;i++) {
					if(tabVisible[i]=='-') {
						gagne=false;
					}
				}

				if(lettretrouve==true) {
					System.out.println("Félicitation vous avez trouvez une lettre");
				}
				if(lettretrouve==false) {
					System.out.println("Dommage, plus que " + cpt + " essais");
					cpt=cpt-1;														//compteur pour le nombre d'essais restant
				}
				
				Lejeudupendu.affiche(cpt);											//affichage du pendu si la lettre trouvé n'est pas la bonne
				
				if(cpt<0) {
					System.out.println("Vous avez perdu !" + "\n" + "le mot était  " + motstock);
					pendu=true;
				}
			}

			if(gagne==true) {														
				System.out.println("");
				System.out.println("");
				System.out.println("Félicitation vous avez trouvez un mot ! " + "\n" + "Le mot était " + motstock);
			}

			System.out.println();
			System.out.println("Voulez vous rejouer ?" + "\n" +  "Oui / Non");


			jouer=(new Scanner(System.in)).nextLine();

			if(jouer.equalsIgnoreCase("non")) {
				rejouer=false;														//booleen pour rejouer (oui ou non)
				System.out.println("Aurevoir");
			}

		}while(rejouer);
	}

	public static  void affiche (int nbErreur) {
		switch(nbErreur) {
		case 7 : 
			System.out.println("__________________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 6:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;

		case 5:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (° °)");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;

		case 4:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (° °)");
			System.out.println("|         | |");
			System.out.println("|         | |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;

		case 3:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (° °)");
			System.out.println("|        /| |");
			System.out.println("|         | |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 2:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (° °)");
			System.out.println("|        /| |\\");
			System.out.println("|         | |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 1:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (° °)");
			System.out.println("|        /| |\\");
			System.out.println("|         | |");
			System.out.println("|         / ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 0:	
			System.out.println("__________________");
			System.out.println("|          |");
			System.out.println("|        (- -)");
			System.out.println("|        /| |\\");
			System.out.println("|         | |");
			System.out.println("|         / \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		}

	}
}





