/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author votha
 */
public class ReadWriteFile {

    public void saveMaHD(String maHD) throws FileNotFoundException, IOException {
        try ( FileOutputStream output = new FileOutputStream("D:\\MaHD.txt")) {
            output.write(maHD.getBytes());
        }
    }

    public String readMaHD() throws IOException {
        String maHD = "";
        try ( // Đọc từ file rồi ghi vào 1 biến String
                 FileInputStream input = new FileInputStream("D:\\MaHD.txt")) {
            int i = 0;
            while ((i = input.read()) != -1) {
                maHD += (char) i;
            }
        }
        System.out.println(maHD);
        return maHD;
    }
    public void saveMaNV(String maNV) throws FileNotFoundException, IOException {
        try ( FileOutputStream output = new FileOutputStream("D:\\MaNV.txt")) {
            output.write(maNV.getBytes());
        }
    }
    public String readMaNV() throws IOException {
        String maHD = "";
        try ( // Đọc từ file rồi ghi vào 1 biến String
                 FileInputStream input = new FileInputStream("D:\\MaNV.txt")) {
            int i = 0;
            while ((i = input.read()) != -1) {
                maHD += (char) i;
            }
        }
        System.out.println(maHD);
        return maHD;
    }
    
    
}
