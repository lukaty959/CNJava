package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        SalaryInfo[] employees = new SalaryInfo[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\n== Nhập thông tin cho nhân viên thứ " + (i + 1) + " ==");
            employees[i] = new SalaryInfo();
            employees[i].inputInfo(scanner);
        }
        
        System.out.println("\n=========== DANH SÁCH NHÂN VIÊN ===========");
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhân viên thứ " + (i + 1) + ":");
            employees[i].displayInfo();
        }

        scanner.close();
    }
}