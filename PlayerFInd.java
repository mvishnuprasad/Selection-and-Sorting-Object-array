import java.util.Scanner;
public class Opa {
    public static void main(String[] args) {
        Players[] arr=new Players[4];
        Scanner scn=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int id=scn.nextInt();scn.nextLine();
            String name=scn.nextLine();
            int exp=scn.nextInt();scn.nextLine();
            int matchesPlayed=scn.nextInt();scn.nextLine();
            int runs=scn.nextInt();scn.nextLine();
            arr[i]=new Players(id,name,exp,matchesPlayed,runs);
        }
        int target=scn.nextInt();;
        double results[]=calculate(arr,target);
        for (int i=0;i<results.length;i++){
            System.out.println(results[i]);
        }
        for(int i=0;i<results.length;i++){
           if(results[i]>=80&&results[i]<=100){
               System.out.println("Grade A");
           }
            if(results[i]>=50&& results[i]<=79){
                System.out.println("Grade B");
            }
            else
            {System.out.println("Grade C");}
        }

    }
    public static double[]  calculate( Players[] arr1 , int tar){
        int c=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i].getMatchesPlayed()>=tar){
                c++;
            }
        }
        double[] arr3=new double[c];
        c=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i].getMatchesPlayed()>=tar){
                arr3[i]= ((double)arr1[i].getRuns()/(double)arr1[i].getMatchesPlayed());

            }

        }
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i] );
        }
        return arr3;
    }
}
class Players{
    int id;
    String name;
    int exp;
    int matchesPlayed;
    int runs;
    public  Players(int a, String b,int c, int d, int e){
        this.id=a;
        this.name=b;
        this.exp=c;
        this.matchesPlayed=d;
        this.runs=e;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getExp(){
        return exp;
    }
    public int getMatchesPlayed(){
        return matchesPlayed;
    }
    public int getRuns(){
        return runs;
    }

}
