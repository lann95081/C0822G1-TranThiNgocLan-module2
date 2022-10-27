package ss17_io_binary_file_serialization.exercise.product_management_save_binary.view;

import ss17_io_binary_file_serialization.exercise.product_management_save_binary.controller.TestController;
import ss17_io_binary_file_serialization.exercise.product_management_save_binary.exception.DuplicateIDException;

public class View {
    public static void main(String[] args) throws DuplicateIDException {
        TestController.menuController();
    }
}
