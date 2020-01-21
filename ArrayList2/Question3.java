import java.util.ArrayList;
public class Question3
{
    public static void main (String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(9);
        list1.add(1);
        list1.add(9);
        list1.add(5);

        list2.add(9);
        list2.add(2);
        list2.add(9);
        list2.add(5);

        System.out.println("List1 is          " + list1);
        System.out.println("List2 is          " + list2);
        System.out.println("Combination is " + add(list1,list2));

    }

    public static ArrayList<Integer> add(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> comb= new ArrayList<Integer>();
        int sum=0;
        int l1= list1.size()-1;
        int l2= list2.size()-1;

        int carry=0;
        comb.add(0);

        for(int i=0; i<list1.size(); i++){
            carry=0;
            sum= list1.get(l1-i) + list2.get(l2-i);
            if(sum>=10){
                carry=1;
                sum-=10;
            } else{
                carry=0;
            }

            if(comb.get(0)!=-1){
                comb.add(0, sum);
            } else if(comb.get(0)==-1){
                comb.set(0, sum+1);
            }

            if(carry==1) comb.add(0,-1);

        }
        if(comb.get(0)==-1)
            comb.set(0, 1);
        comb.remove(comb.size()-1);
        return comb;
    }
}