/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan25.ejaannama;
import java.util.Scanner;
/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang ejaan
 * @author 62895
 */
public class TI_RegPagi22205015Latihan25EjaanNama {

    public static void main(String[] args) {
        System.out.println("===LATIHAN 25====");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        int jumlahhuruf = nama.length();
        
        System.out.println("");
        System.out.println("Ejaan untuk "+nama+" adalah: ");
        for(int i=0; i < jumlahhuruf; i++){
            char ambilhuruf = nama.charAt(i);
            System.out.println("Huruf ke"+(i+1)+"=" + ambilhuruf);
        }
    }
}
