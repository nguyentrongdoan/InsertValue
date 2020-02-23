import java.util.Scanner;

public class InsertValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("NHap gia tri muon them: ");
        int x = input.nextInt();

        System.out.println("nhap vao vi tri index can chen trong mang: ");
        int index = input.nextInt();
        if (index < 1 || index >= Array.length - 1){
            System.out.println("Khong chen duoc vao mang.");
        }else {
            for (int i = 0; i < Array.length; i++){
                if (index == i){
                    Array[index] = x;
                }
                System.out.println(Array[i]);
            }
        }
    }
}
