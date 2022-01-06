package com.company;

public class EmployeeService {
    public static Employee[] createAll() {
        Waiter w1 = new Waiter(1, "Long", 25, 8400000, 1700000);
        Waiter w2 = new Waiter(2, "Minh", 29, 7100000, 2200000);
        Kitchen k1 = new Kitchen(3, "Trung", 40, 5200000, 2100000);
        Kitchen k2 = new Kitchen(4, "Cường", 35, 1100000, 8300000);
        Employee[] employees = { w1, w2, k1, k2 };
        return employees;
    }

    public static void showAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
