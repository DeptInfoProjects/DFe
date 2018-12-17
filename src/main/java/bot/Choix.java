package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Choix {
    public ArrayList<ArrayList<Integer>> permutation(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());

        for (int aNum : num) {
            ArrayList<ArrayList<Integer>> current = new ArrayList<>();

            for (ArrayList<Integer> l : result) {
                for (int j = 0; j < l.size() + 1; j++) {
                    l.add(j, aNum);
                    ArrayList<Integer> temp = new ArrayList<>(l);
                    current.add(temp);
                    l.remove(j);
                }
            }

            result = new ArrayList<>(current);
        }

        return result;
    }

    private List<Integer> choixList = new ArrayList<>();
    private Random choix = new Random();
    private int rand  = choix.nextInt(3);
    private int rand2 = choix.nextInt(2);
    private int rand3 = choix.nextInt(2);
    private int rand4 = choix.nextInt(4);
    private int rand5 = choix.nextInt(2);
    private int rand6 = choix.nextInt(2);
    private int rand7 = choix.nextInt(2);
    private int rand8 = choix.nextInt(2);
    private int rand9 = choix.nextInt(2);

    public void addChoixList() {
        int mem = choix.nextInt(4);
        if (mem == 0){
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);
        this.choixList.add(0);}
        if (mem == 1){
            this.choixList.add(0);
            this.choixList.add(1);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);}
        if (mem == 2){
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(1);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);}
        else {
            this.choixList.add(1);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
            this.choixList.add(0);
        }
    }


    public void addChoixListRandom() {
        this.choixList.add(rand);
        this.choixList.add(rand2);
        this.choixList.add(rand3);
        this.choixList.add(rand4);
        this.choixList.add(rand5);
        this.choixList.add(rand6);
        this.choixList.add(rand7);
        this.choixList.add(rand8);
        this.choixList.add(rand9);
    }

    public int getChoixList(int n){
        return this.choixList.get(n);
    }

}