package com.example.kalkulatoruas13294;

public class Kalkulator {
    String angka1, angka2, hasil, operasi;

    public Kalkulator(String angka1, String angka2, String hasil, String operasi) {
        this.angka1 = angka1;
        this.angka2 = angka2;
        this.hasil = hasil;
        this.operasi = operasi;
    }

    public String getOperasi() {
        return operasi;
    }

    public void setOperasi(String operasi) {
        this.operasi = operasi;
    }

    public String getHasil() {
        return hasil;
    }

    public void setHasil(String hasil) {
        this.hasil = hasil;
    }

    public String getAngka1() {
        return angka1;
    }

    public void setAngka1(String angka1) {
        this.angka1 = angka1;
    }

    public String getAngka2() {
        return angka2;
    }

    public void setAngka2(String angka2) {
        this.angka2 = angka2;
    }

}
