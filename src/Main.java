import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department department = new Department(1, "books");
        Seller seller = new Seller(21, "Victor", "manoelvictortimbo@gmail.com", new Date(), 3500.5, department);
        System.out.println(seller);
    }
}