
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ComplexDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  // kiểm tra số phức có sẵn 
        Complex c1 = new Complex(7, 9);
    Complex c2 = new Complex (4, 5);
    
    System.out.println("số phức 1 (complex complex numbers 1 ): " + c1);
    System.out.println("số phức 2 (complex complex numbers 2 ): " + c2);
    
    Complex sum = c1.add(c2);
    System.out.println("tổng số phức (Sum of complex numbers): " + sum);
    
    Complex hieu = c1.subtract(c2);
    System.out.println("hiệu số phức (Difference of complex numbers): " + hieu);
    
    Complex tich = c1.multiply(c2);
    System.out.println("tích số phức (Product of complex numbers): " + tich);
    
    Complex thuong = c1.divide(c2);
    System.out.println("thương số phức (Quotient of complex numbers): " + thuong);
   //kiểm tra số do người dùng nhập từ bàn phím
        System.out.println("kiểm tra số nhập từ bàn phím");
        System.out.println("nhập số phức 1 z = a + b*i");
        Complex bien1 = new Complex();
        System.out.println("nhập số thực a");
        double soThuca;
        soThuca = sc.nextDouble();
        bien1.setRealPart(soThuca);
        System.out.println("nhập số ảo b");
        double soAob;
        soAob = sc.nextDouble();
        bien1.setImaginaryPart(soAob);
        System.out.println("số phức 1: " + bien1.toString());
        
         System.out.println("nhập số phức 2 w = c + d*i");
        Complex bien2 = new Complex();
        System.out.println("nhập số thực c");
        double soThucc;
        soThucc = sc.nextDouble();
        bien2.setRealPart(soThucc);
        System.out.println("nhập số ảo d");
        double soAod;
        soAod = sc.nextDouble();
        bien2.setImaginaryPart(soAod);
        System.out.println("số phức 2: " + bien2.toString());
        
           Complex sumnhap = bien1.add(bien2);
    System.out.println("tổng số phức (Sum of complex numbers): " + sumnhap);
    
    Complex hieunhap = bien1.subtract(bien2);
    System.out.println("hiệu số phức (Difference of complex numbers): " + hieunhap);
    
    Complex tichnhap = bien1.multiply(bien2);
    System.out.println("tích số phức (Product of complex numbers): " + tichnhap);
    
    if(bien2.realPart == 0 && bien2.imaginaryPart== 0){
        System.out.println("không chia đc cho 0");
    } else {
         Complex thuongnhap = bien1.divide(bien2);
    System.out.println("thương số phức (Quotient of complex numbers): " + bien2);
    }
   
    }
}
