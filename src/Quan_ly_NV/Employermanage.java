package Quan_ly_NV;

import java.util.Scanner;

public class Employermanage {
    Scanner scanner = new Scanner(System.in);
    Employer[] Employ = new Employer[0];

    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Them");
        System.out.println("2. Sua");
        System.out.println("3. Xoa");
        System.out.println("4. Hien thi");
        System.out.println("5. Thoat");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                create();
                break;
            case 2:
                editByIndex();
                break;
            case 3:
                deleteNV();
                break;
            case 4:
                show();
                break;
            case 5:
                System.exit(0);
        }
    }


    public void create() {
        System.out.println("Menu");
        System.out.println("1. fulltime");
        System.out.println("2. parttime");
        int choice1 = scanner.nextInt();
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();

        Employer[] newEmploy = new Employer[Employ.length + 1];

        switch (choice1) {
            case 1:
                System.out.println("Enter heso");
                float heso = scanner.nextFloat();
                FullTimeEmployer newNV = new FullTimeEmployer(id, name, age, heso);
                for (int i = 0; i < Employ.length; i++) {
                    newEmploy[i] = Employ[i];
                }
                newEmploy[Employ.length] = newNV;
                break;
            case 2:
                System.out.println("Enter workday");
                float workday = scanner.nextFloat();
                PartimeEmplayer newNV1 = new PartimeEmplayer(id, name, age, workday);
                for (int i = 0; i < Employ.length; i++) {
                    newEmploy[i] = Employ[i];
                }
                newEmploy[Employ.length] = newNV1;
                break;
        }
        Employ = newEmploy;
    }

    public void editByIndex() {
        System.out.println("Enter index");
        int index = scanner.nextInt();
        System.out.println("nhan viev ban can sua thanh la:");
        System.out.println("1. fulltime");
        System.out.println("2. parttime");
        int choice2 = scanner.nextInt();
        System.out.println("Enter id");
        int id = scanner.nextInt();
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        switch (choice2) {
            case 1:
                System.out.println("Enter heso");
                float heso = scanner.nextFloat();
                FullTimeEmployer newNV2 = new FullTimeEmployer(id, name, age, heso);
                Employ[index] = newNV2;
                break;
            case 2:
                System.out.println("Enter workday");
                float workday = scanner.nextFloat();
                PartimeEmplayer newNV3 = new PartimeEmplayer(id, name, age, workday);
                Employ[index] = newNV3;
                break;
        }
    }

    public void deleteNV() {
        System.out.println("nhap index xoa");
        int index = scanner.nextInt();
        Employer[] newEmploy = new Employer[Employ.length - 1];
        for (int i = 0; i < index; i++) {
            newEmploy[i] = Employ[i];
        }
        for (int i = index; i < Employ.length-1; i++) {
            newEmploy[i] = Employ[i + 1];
        }
        Employ = newEmploy;

    }

    public void show() {
        for (Employer nv : Employ) {
            System.out.println(nv.toString());
        }
    }
}