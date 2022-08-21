/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import Entity.Car;
import Repository.CarRepository;
import Repository.DealershipRepository;
import Utility.Constant;
import Utility.FileUtils;

import java.util.Scanner;


public class Manager {

    CarRepository carRepository;
    DealershipRepository dealershipRepository;

    public Manager() {
        this.carRepository = new CarRepository();
        this.dealershipRepository=new DealershipRepository();

    }


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        do {
            System.out.println("0-Çıkış ");
            System.out.println("1-Dosyadan Databese Arabaları Aktarma");
            System.out.println("2-Dosyadan Databese Bayileri Aktarma");
            System.out.println("3-Araba ekle");
            System.out.println("4-Araba güncelle");
            System.out.println("5-Araba Sil");
            System.out.println("6-Arabaları getir");


            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    carRepository.saveAll(FileUtils.getCarList(FileUtils.readFile(Constant.carFile)));
                    break;
                case 2:
                    dealershipRepository.saveAll(FileUtils.getDealers(FileUtils.readFile(Constant.dealershipFile)));
                    break;
                case 3:
                    System.out.println("Araba markası giriniz");
                    String marka = scanner.nextLine();
                    System.out.println("Araba modeli giriniz");
                    String model = scanner.nextLine();
                    System.out.println("Araba yili giriniz");
                    String yil = scanner.nextLine();
                    System.out.println("Bayi id giriniz");
                    Long bayiId = scanner.nextLong();
                    scanner.nextLine();

                    carRepository.save(new Car(carRepository.findId(), marka, model, yil, bayiId));
                    break;

                case 4:
                    System.out.println("Hangi id li arabanin bilgileri güncellensin");
                    Long Id = scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("Araba markası giriniz");
                    String yenimarka = scanner.nextLine();
                    System.out.println("Araba modeli giriniz");
                    String yenimodel = scanner.nextLine();
                    System.out.println("Araba yili giriniz");
                    String yeniyil = scanner.nextLine();
                    System.out.println("Bayi id giriniz");
                    Long yenibayiId = scanner.nextLong();
                    scanner.nextLine();

                    carRepository.update(new Car(yenimarka, yenimodel, yeniyil, yenibayiId), Id);
                    break;

                case 5:
                    System.out.println("Hangi id li arabanin bilgileri silinsin");
                    Long silId = scanner.nextLong();
                    scanner.nextLine();
                    carRepository.delete(silId);
                    break;

                case 6:
                    carRepository.findAll();

            }

        } while (true);

    }


    public static void main(String[] args) {
      Manager manager = new Manager();
      manager.menu();
//        CarRepository cr = new CarRepository();
//        cr.findAll();


    }

}