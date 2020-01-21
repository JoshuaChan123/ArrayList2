import java.util.ArrayList;

class Question1 {

    public static ArrayList<Integer> primesUnder(int n) {
        ArrayList <Integer> prime= new ArrayList<Integer>();
        for(int i=2; i<=n; i++){
            prime.add(i);
        }
        for(int i=0; i<prime.size(); i++){
            if(prime.get(i)!=2 && prime.get(i)!=3 && prime.get(i)!=5 && prime.get(i)!=7){
                if(prime.get(i)%2==0){
                    prime.remove(i);
                    i--;
                } else if(prime.get(i)%3==0){
                    prime.remove(i);
                    i--;
                } else if(prime.get(i)%5==0){
                    prime.remove(i);
                    i--;
                } else if(prime.get(i)%7==0){
                    prime.remove(i);
                    i--;
                }
            }
        }
        return prime;
    }
    public static void main (String[] args) {
        ArrayList<Integer> primesUnder100 = primesUnder(100);
        System.out.println(primesUnder100);
    }
}