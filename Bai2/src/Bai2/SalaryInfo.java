package Bai2;

import java.util.Scanner;

public class SalaryInfo {
    private double basicSalary; 
    private double allowance;   

    public SalaryInfo() {}

    
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary >= 0) {
            this.basicSalary = basicSalary;
        } else {
            System.out.println("Lương cơ bản không được âm!");
        }
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        if (allowance >= 0) {
            this.allowance = allowance;
        } else {
            System.out.println("Phụ cấp không được âm!");
        }
    }

    public double getTotalIncome() {
        return basicSalary + allowance;
    }

    public void displayInfo() {
        System.out.println("=========== Thông tin lương nhân viên =============");
        System.out.println("Lương cơ bản: " + basicSalary);
        System.out.println("Phụ cấp: " + allowance);
        System.out.println("Tổng thu nhập: " + getTotalIncome());
        System.out.println("===================================================");
    }

    // Hàm nhập từ bàn phím
    public void inputInfo(Scanner scanner) {
        System.out.print("Nhập lương cơ bản: ");
        setBasicSalary(scanner.nextDouble());

        System.out.print("Nhập phụ cấp: ");
        setAllowance(scanner.nextDouble());
    }
}