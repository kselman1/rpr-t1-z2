package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main {
     
    public static int sumaCifara(int n){

        int suma=0, d=0;

        while(n!=0){
            d=n%10;
            suma=suma+d;
            n=n/10;
        }
        return suma;

    }
    public static void main(String[] args) {
	  int n=0, i=0;

	  Scanner ulaz=new Scanner(System.in);

	  System.out.println("Unesite broj n: ");
	  n=ulaz.nextInt();

	  for(i=1; i<=n; i++){
	      if(i%sumaCifara(i)==0)
	          System.out.println(" " +i);
      }
    }
}
