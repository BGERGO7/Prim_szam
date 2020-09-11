import java.util.ArrayList;

public class Prim_szam {
    public static void main(String[] args) {
        int [] szamok = {3, 4, 33, 17,7};

        System.out.println("Prim szamok:");
        for(int n : szamok){

            boolean isPrime = true;
            int oszto = 2;
            //Amíg az osztó kisebb vagy egyenlo a szám osztva 2-vel(pl.: 2 <= 17/2 (8,5), 9 <= 17/2 (9*2 nagyobb mint 17) )
            while(oszto <= n/2){
                //ha a szám ban megvan az oszto egeszben akkor nem prim szam
                if(n % oszto == 0){
                    isPrime = false;
                    break;
                }
                oszto++;
            }
            if(isPrime){
                System.out.println(n);
            }
        }
    }
}
