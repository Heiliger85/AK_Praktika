import java.nio.file.Files;
import java.nio.file.Path;

public class Aufgabe1 {
public static void main(String[] args)throws Exception {
		
	  String text = Files.readString(Path.of("chiffrat.txt"));

// Automatischer Versuch
//	  int[] chiff = new int[26];
//	  
//	  //Zählen der Häufigkeit der Einzelnen Buchstaben
//	  for(int i=65; i<=(65+25); i++) { 
//		  int count = 0;
//		  for (int j=0; j<text.length(); j++) {
//			  char ch = text.charAt(j);
//			  if (ch == (char)i) {
//				 count++;
//			  }
//		  }
//		  chiff[i-65] = count;
//	  }
//	
//	  int menge = 26;
//	  char[] alt = new char[menge];
//	  int check = 0;
//	  int check2 = 0;
//	  int k = 0;
//	  
//	  for(int j=0; j<5; j++) { 
//		  for(int i = 0; i<26; i++) {
//			  if(j==0) {
//				  if(chiff[i]> check) {
//					  check = chiff[i];
//					  k = i;
//				  }
//				  alt[j] = (char)(k+65);
//			  }
//			  else
//			  	  if(chiff[i]> check && chiff[i]<check2) {
//					  check = chiff[i];
//					  k = i;
//				  }
//				  alt[j] = (char)(k+65);
//		  }
//		  check2 = check;
//		  check = 0;
//	  }
//	  
//	  for(int i=0;i<5;i++)
//	  System.out.println(alt[i]);
//	  
	  //Vergleich der Häufigkeit
	  //  E  N  I S R A T D H U
	  //  17 10 8 7 7 6 6 5 4 4
	  
//	  char[] neu = new char[menge];
//	  neu[0] = 'E';
//	  neu[1] = 'N';
//	  neu[2] = 'R';
//	  neu[3] = 'I';
//	  neu[4] = 'T';

  
  
// Nach den ersten Test mit den Vorgaben der deutschen Sprache, auf manuelle Suche gewechselt...
	  char[] alt2 = {'V','Q','N','O','M','K','W','A','T','J','I','D','B','U','F','E','C','R','X','H','G','U'};
	  char[] neu2 = {'E','N','R','I','T','A','L','K','M','Z','F','O','D','S','U','G','H','V','B','W','C','G'};
	  
	  
	  String ausgabe = "";
	  char c;
	  	  
	  for (int i=0; i<text.length(); i++) {
		c = text.charAt(i);
		for(int j=0; j<neu2.length; j++) {
			if(c == alt2[j]) {
				c = neu2[j];
				break;
			}
		}
		ausgabe = ausgabe + c;	  
	  }
	  System.out.println(ausgabe);
	} 
}
