import java.util.Scanner;

public class b2themphantu {
    public static void main(String[] args) {
//        int []n = {1,5,7,69,50};
//        int x = 96;
//        int index = 2;
//        System.out.println("Mảng trước khi xóa: ");
//        for(int element:n){
//            System.out.print(element+" ");
//        }
//        System.out.println();
//        for (int i = x; i >index; i--) {
//            n[i]=n[i-1];
//        }
        //Cách 2:
        //B1: Nhập số phần tử và khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("Nhập giá trị các phần tử mảng: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]= ",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        //B2: In giá trị các phần tử mảng trước khi thêm
        System.out.println("Giá trị mảng các phần tử: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        //B3: Nhập giá trị cần thêm và chỉ số cần chèn vào mảng
        System.out.println("Nhập giá trị cần thêm vào mảng: ");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vị trí cần chèn vào mảng: ");
        int indexInsert = Integer.parseInt(sc.nextLine());
        //B4: Khởi tạo mảng mới chứa các phần tử cũ và thêm vào phần tử mới
        int[] newArr = new int[old.length+1];
        //B5: Sao chép các phần tử từ mảng cũ(old) và thêm phần tử vào mảng mới(newArr)
        for (int i = 0; i < newArr.length; i++) {
            if(i<indexInsert)
                newArr[i]=old[i];
            else if (i==indexInsert)
                newArr[i]=valueInsert;
            else
                newArr[i]= old[i-1];
        }
        //B6: In ra các phần tử sau khi thêm mới 1 phần tử
        System.out.println("Giá trị các phần tử sau khi thêm mới: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("%d\t",newArr[i]);
        }
        System.out.printf("\n");

    }
}
