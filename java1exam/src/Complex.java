/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Complex {

    public double realPart; // biến instance
    public double imaginaryPart;
// tạo hàm contructor

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    //tạo  method  tính toán

    public Complex add(Complex otherNumber) {
        double soThuc, soAo;
        soThuc = this.realPart + otherNumber.realPart;
        soAo = this.imaginaryPart + otherNumber.imaginaryPart;
        Complex sophucCong = new Complex(soThuc, soAo);
        return sophucCong;
    }

    public Complex subtract(Complex otherNumber) {
        double soThuc, soAo;
        soThuc = this.realPart - otherNumber.realPart;
        soAo = this.imaginaryPart - otherNumber.imaginaryPart;
        Complex sophucTru = new Complex(soThuc, soAo);
        return sophucTru;
    }

    public Complex multiply(Complex otherNumber) {
        double soThuc, soAo;
        soThuc = (this.realPart * otherNumber.realPart) - (this.imaginaryPart * otherNumber.imaginaryPart);
        soAo = (this.realPart * otherNumber.imaginaryPart) + (this.imaginaryPart * otherNumber.realPart);
        Complex sophucNhan = new Complex(soThuc, soAo);
        return sophucNhan;
    }

    public Complex divide(Complex otherNumber) {
        double soThuc, soAo, mau;
        mau = otherNumber.realPart * otherNumber.realPart + otherNumber.imaginaryPart * otherNumber.imaginaryPart;
        soThuc = ((this.realPart * otherNumber.realPart) + (this.imaginaryPart * otherNumber.imaginaryPart)) / mau;
        soAo = ((this.imaginaryPart * otherNumber.realPart) - (this.realPart * otherNumber.imaginaryPart)) / mau;
        Complex sophucChia = new Complex(soThuc, soAo);
        return sophucChia;
    }
    // setter getter

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    //tạo method chuyển thành string
    public String toString() {
        return this.realPart + " + " + this.imaginaryPart + "* i";
    }

}
