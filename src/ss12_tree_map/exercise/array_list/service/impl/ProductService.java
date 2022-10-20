package ss12_tree_map.exercise.array_list.service.impl;

import ss12_tree_map.exercise.array_list.model.Product;
import ss12_tree_map.exercise.array_list.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("Trứng gà", 1, 3000));
        list.add(new Product("Kẹo cầu vòng", 2, 5000));
        list.add(new Product("Bánh bông lan", 3, 30000));
        list.add(new Product("Bánh sữa chua", 4, 40000));
    }

    @Override
    public void add() {
        System.out.print("Nhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();

        System.out.print("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        list.add(new Product(nameProduct, id, price));
        System.out.print("Thêm mới thành công");
    }

    @Override
    public void set() {
        System.out.print("Nhập id cần sửa: ");
        int idSet = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idSet) {
                System.out.print("Nhập tên sản phẩm cần sửa:" + list.get(i));
                System.out.print("\n Bạn có chắc chắn muốn sửa hay không??\n "
                        + "1. Có\n "
                        + "2. Không.");

                System.out.print("\n Chọn 1 hay 2: ");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    System.out.print("Nhập tên mới: ");
                    String nameProduct = scanner.nextLine();

                    System.out.print("Nhập giá mới: ");
                    int price = Integer.parseInt(scanner.nextLine());

                    list.set(i, new Product(nameProduct, list.get(i).getId(), price));
                    System.out.print("Sửa thành công");
                }
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void delete() {
        System.out.print("Nhập id cần xoá: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idDelete) {
                System.out.print("Nhập tên sản phẩm cần xoá: " + list.get(i));
                System.out.print("\n Bạn có chắc chắn muốn xoá hay không??\n "
                        + "1. Có\n "
                        + "2. Không.");

                System.out.print("\n Chọn 1 hay 2: ");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    list.remove(new Product());
                    System.out.println("Xoá thành công");
                }
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void display() {
        for (Product product : list) {
            System.out.println(product);
        }

    }

    @Override
    public void find() {
        System.out.println("Nhập tên sản phẩm cần tìm: ");
        String nameFind = scanner.nextLine();
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().contains(nameFind)) {
                System.out.println("Có tên sản phẩm trong danh sách: " + list.get(i).getNameProduct());
                isCheck = true;
            }
        }
        if (!isCheck) {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void sort() {

    }
}
