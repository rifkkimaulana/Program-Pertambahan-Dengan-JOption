
/**
 *
 * @author Rifki Maulana
 */

import javax.swing.*;

public class Program_Pertambahan {
    public static void main(String args []) {
    
        //mebuat string input
    String input1;
    String input2;
    
        //Membuat aturan nilai
    int nilai1;
    int nilai2;
    
        //Membuat pertambahan
    int tambah;
    
        //Memunculkan pop-up isian
    input1 = JOptionPane.showInputDialog("Angka Pertama : ");
    input2 = JOptionPane.showInputDialog("Angka Kedua : ");
    
        //merubah nilai
    nilai1 = Integer.parseInt(input1);
    nilai2 = Integer.parseInt(input2);
    
        //kalkulasi hasil dari nilai1 dan nilai 2
    tambah = nilai1 + nilai2;
    
        //Memunculkan pop-up jawaban hasil pertambahan
    JOptionPane.showMessageDialog(null, nilai1 + " + " + nilai2 + " = " +  tambah);
    }
}
