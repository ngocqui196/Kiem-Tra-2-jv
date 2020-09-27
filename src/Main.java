import com.sun.xml.internal.bind.v2.model.core.ID;
import list.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List lists = new List();
        do {
            System.out.println("====Chuyên mục quản lý danh sách sản phẩm====");
            System.out.println("1. Thêm sản phẩm của bạn");
            System.out.println("2. Cập nhật lại sản phẩm của bạn");
            System.out.println("3. Tên sản phẩm bạn muốn tìm");
            System.out.println("4. Xoá sản phẩm trong list của bạn.");
            System.out.println("5. Hiển thị tất cả sản phẩm");
            System.out.println("0. Thoát chương trình");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1:
                    System.out.println("Nhập iD sản phẩm bạn muốn thêm");
                    int id= Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm bạn muốn thêm");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm bạn muốn thêm");
                    long price = Integer.parseInt(sc.nextLine());
                   lists.add(id,name,price);
                    break;
                case 2:
                    System.out.println("Nhập iD sản phẩm bạn muốn sửa");
                    int iDOld = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập tên sản phẩm bạn muốn sửa");
                    String newName = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm bạn muốn sửa");
                    long newPrice = Integer.parseInt(sc.nextLine());
                    lists.upDate(iDOld,newName,newPrice);
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm");
                    String nameseach = sc.nextLine();
                    lists.seachProduct(nameseach);
                    break;
                case 4:
                    System.out.println("nhập id sản phẩm bạn muốn xoá");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    lists.remove(idDelete);

                    break;
                case 5:
                    System.out.println("====List Product====");
                    lists.displayList();
                    break;
                case 0:
                    System.exit(-1);
            }
        }while (true);
    }
}
