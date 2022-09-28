import java.util.Scanner;

public class b1xoaphantu {
    public static void main(String[] args) {
//       int []n = {1,5,7,69,50};
//       int x = 1;
//        System.out.println("Mảng trước khi xóa: ");
//        for(int element:n){
//            System.out.print(element+" ");
//        }
//        System.out.println();
//        for (int i = x; i <n.length-1; i++) {
//            n[i]=n[i+1];
//        }
//        System.out.println("Mảng sau khi xóa: ");
//        for(int element:n){
//            System.out.print(element+" ");
//        }
//Cách 2:
//B1: Nhập số phần tử và khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        //B2: In ra các giá trị phần tử của mảng trước khi xóa
        System.out.printf("Giá trị các phần tử trước khi xóa: ");
        for (int i = 0; i < old.length; i++) {
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        //B3. Nhap vao gia tri can xoa trong mang
        System.out.println("Nhap vao gia tri can xoa trong mang: ");
        int deleteValue = Integer.parseInt(sc.nextLine());
        //B4. Xoa phan tu co gia tri la deleteValue trong mang
        //B4.1. Khoi tao mot mang moi arrNew de chua cac phan tu sau khi xoa
        //-----Dem so phan tu co gia tri la deleteValue trong mang old
        int cnt = 0;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                cnt++;
            }
        }
        //------Khoi tao mang moi arrNew voi so phan tu la old.length - cnt
        int[] arrNew = new int[old.length-cnt];
        //------copy toan bo cac phan tu khong bi xoa tu old sang arrNew
        int index=0;
        for (int i = 0; i < old.length; i++) {
            if (old[i]==deleteValue){
                //Dang o phan tu can xoa o mang old
                continue;
            }else{
                //Dang o phan tu can copy sang mang arrNew
                arrNew[index] = old[i];
                index++;
            }
        }
        //B5. In gia tri cac phan tu mang moi
        System.out.println("Gia tri cac phan tu trong mang sau khi xoa: ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
        }
    }