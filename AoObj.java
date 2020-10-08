import java.util.Scanner;
public class AoObj {
    public static void main(String[] args) {
        Inventory[] arr=new Inventory[4];
        Scanner scn=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            String id=scn.nextLine();
            int maxAmt=scn.nextInt();scn.nextLine();
            int CurrentAmt=scn.nextInt();scn.nextLine();
            int threshold=scn.nextInt();scn.nextLine();
            arr[i]=new Inventory(id,maxAmt,CurrentAmt,threshold);
        }
        int lim=scn.nextInt();
        Inventory[] result= replenish(lim,arr);
        for (int i = 0; i < result.length; i++) {
            if (result[i].getThreshold() >= 75) {
                System.out.println(result[i].getInventoryId() + " Critical Filling");
            }
            else if (result[i].getThreshold() >= 50 &&
                    result[i].getThreshold() <= 74) {
                System.out.println(result[i].getInventoryId() + " Moderate Filling");
            }
            else {
                System.out.println(result[i].getInventoryId() + " Non-Critical Filling");
            }
        }
        scn.close();
    }
    public static Inventory[] replenish(int limit, Inventory[] arr1){
        int c=0;
        for (int i=0;i<arr1.length;i++){
            if(arr1[i].getThreshold()<=limit){
                c++;
            }
        }
        Inventory[] arr3=new Inventory[c];
        c = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].getThreshold() <= limit) {
                arr3[c++] = arr1[i];
            }

        }
       /* for (int i=0;i<arr3.length;i++){
            if(arr1[i].getThreshold()<=limit){
                arr3[i]=arr1[i];
            }
        }*/


        return arr3;
    }
}
class Inventory {
    String inventoryId;
    int maximumQuantity;
    int currentQuantity;
    int threshold;
    public Inventory(String a, int b, int
            c, int d) {
        this.inventoryId = a;
        this.maximumQuantity = b;
        this.currentQuantity = c;
        this.threshold = d;
    }
    public String getInventoryId() {
        return inventoryId;
    }
    public int getMaximumQuantity() {
        return maximumQuantity;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public int getThreshold() {
        return threshold;
    }

}
