package ss12_tree_map.exercise.array_list.controller;

import ss12_tree_map.exercise.array_list.service.IProductService;
import ss12_tree_map.exercise.array_list.service.impl.ProductService;

import java.util.Scanner;

public class MainController {
    public static void menuProduct() {
        IProductService iProductService = new ProductService();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n QUẢN LÍ SẢN PHẨM:\n "
                    + "1. Thêm sản phẩm\n "
                    + "2. Sửa thông tin sản phẩm theo id\n "
                    + "3. Xoá sản phẩm theo id\n "
                    + "4. Hiển thị danh sách sản phẩm\n "
                    + "5. Tìm kiếm ản phẩm theo tên\n "
                    + "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá\n "
                    + "7. Thoát.");

            System.out.print(" Nhập lựa chọn của bạn: ");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    iProductService.add();
                    break;
                case 2:
                    iProductService.set();
                    break;
                case 3:
                    iProductService.delete();
                    break;
                case 4:
                    iProductService.display();
                    break;
                case 5:
                    iProductService.find();
                    break;
                case 6:
                    iProductService.sort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println(" Lựa chọn của bạn không có, vui lòng nhập lại. ");
            }
        } while (true);
    }
}
