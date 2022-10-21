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
        System.out.print("\nNhập tên sản phẩm: ");
        String nameProduct = scanner.nextLine();

        System.out.print("\nNhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("\nNhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());

        list.add(new Product(nameProduct, id, price));
        System.out.print("\nThêm mới thành công\n");
    }

    @Override
    public void set() {
        System.out.print("\n Nhập id cần sửa: ");
        int idSet = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idSet) {
//                System.out.print("Nhập tên sản phẩm cần sửa:" + list.get(i));
                System.out.print("\n Bạn có chắc chắn muốn sửa hay không??\n "
                        + "1. Có\n "
                        + "2. Không.");

                System.out.print("\n Chọn 1 hay 2: ");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    System.out.print("\nNhập tên mới: ");
                    String nameProduct = scanner.nextLine();

                    System.out.print("\nNhập giá mới: ");
                    int price = Integer.parseInt(scanner.nextLine());

                    list.set(i, new Product(nameProduct, list.get(i).getId(), price));
                    System.out.print("\nSửa thành công\n");
                }
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.out.println("\nKhông tìm thấy");
        }
    }

    @Override
    public void delete() {
        System.out.print("\n Nhập id cần xoá: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == idDelete) {
//                System.out.print("Nhập tên sản phẩm cần xoá: " + list.get(i));
                System.out.print("\n Bạn có chắc chắn muốn xoá hay không??\n "
                        + "1. Có\n "
                        + "2. Không.");

                System.out.print("\n Chọn 1 hay 2: ");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    list.remove(list.get(i));
                    System.out.println("\nXoá thành công");
                }
                isCheck = true;
                break;
            }
        }
        if (!isCheck) {
            System.out.println("\nKhông tìm thấy");
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
        System.out.println("\nNhập tên sản phẩm cần tìm: ");
        String nameFind = scanner.nextLine();
        boolean isCheck = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNameProduct().contains(nameFind)) {
                System.out.println("\nCó tên sản phẩm trong danh sách: " + list.get(i).getNameProduct());
                isCheck = true;
            }
        }
        if (!isCheck) {
            System.out.println("\nKhông tìm thấy");
        }
    }

    @Override
    public void sort() {
        int choose;
        do {
            System.out.println("\nBạn muốn sắp xếp:\n "
                    + "1. Tăng dần.\n "
                    + "2. Giảm dần.");

            System.out.print("\nChọn 1  hay 2: ");
            choose = Integer.parseInt(scanner.nextLine());

            if (choose != 1 && choose != 2) {
                System.out.println("\nLựa chọn của bạn không có, vui lòng nhập lại!");
            }
        } while (choose != 1 && choose != 2);

        PriceComparatorAscending priceComparatorAscending = new PriceComparatorAscending();
        PriceComparatorDecrease priceComparatorDecrease = new PriceComparatorDecrease();

        if (choose == 1) {
            list.sort(priceComparatorAscending);
            System.out.println("\nSắp xếp sản phẩm tăng dần theo giá: ");
        } else {
            list.sort(priceComparatorDecrease);
            System.out.println("\nSắp xếp sản phẩm giảm dần theo giá: ");
        }

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
