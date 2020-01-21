import java.util.ArrayList;

class Question2 {

    public static ArrayList<Integer> primesUnder2(int n) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int i = 2; i <= n; i++) {
            primes.add(i);
        }

        for(int i=0; i<primes.size(); i++){
            if(primes.get(i)!=2 && primes.get(i)!=3 && primes.get(i)!=5 && primes.get(i)!=7){
                if(primes.get(i)%2==0 ||primes.get(i)%3==0 ||primes.get(i)%5==0 ||primes.get(i)%7==0){
                    primes.remove(i);
                    i--;
                }
            }
        }

        return primes;
    }

    public static void goldbachSum(int n) {
        ArrayList<Integer> primes= primesUnder2(n);

        int first=0;
        int second=0;

        for(int i=0; i<primes.size(); i++){
            for(int j=i; j<primes.size();j++){
                if(primes.get(i) + primes.get(j)==n){
                    first=primes.get(i);
                    second=primes.get(j);
                    System.out.println(first + "+" + second + "=" + n);
                    return;
                }
            }
        }

    }

    public static void main (String[] args) {
        for (int i = 4; i <= 100; i += 2) {
            goldbachSum(i);
        }
    }
}