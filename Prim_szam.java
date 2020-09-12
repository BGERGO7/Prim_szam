import java.util.ArrayList;
import java.util.Scanner;

public class Prim_szam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Primszám ellenőrző");

        int szam = sc.nextInt();

        System.out.println("Beírt szám: "+ szam );


            boolean isPrime = true;
            int oszto = 2;
            //Amíg az osztó kisebb vagy egyenlo a szám osztva 2-vel(pl.: 2 <= 17/2 (8,5), 9 <= 17/2 (9*2 nagyobb mint 17) )
            while(oszto <= szam/2){
                //ha a szám ban megvan az oszto egeszben akkor nem prim szam
                if(szam % oszto == 0){
                    isPrime = false;
                    break;
                }
                oszto++;
            }

            if(isPrime){
                System.out.println("A szám prímszám");
            }else {
                System.out.println("A szám nem prímszám");
            }
        }
    }
