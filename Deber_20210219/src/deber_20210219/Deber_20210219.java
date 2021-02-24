/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_20210219;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author freddyxaviercatucuambaecheverria
 */
public class Deber_20210219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer[] edades = new Integer[10];
        edades[0] = 10;
        edades[1] = 20;
        edades[2] = 30;
        edades[3] = 40;
        edades[4] = 50;
        edades[5] = 60;
        edades[6] = 70;
        edades[7] = 80;
        edades[8] = 90;
        edades[9] = 100;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(edades[i]);
//        }
//        edades[5]= null;
//       for (int i = 0; i < 10; i++) {
//            System.out.println(edades[i]);
//        }
        List<Integer> listaEdades = new ArrayList<>();
        listaEdades.add(10);
        listaEdades.add(20);
        listaEdades.add(30);
        listaEdades.add(40);
        listaEdades.add(50);
        listaEdades.add(60);
        listaEdades.add(70);
        listaEdades.add(80);
        for (Integer edad : listaEdades) {
            System.out.println(edad);
        }
        listaEdades.remove(new Integer(60));
        for (Integer edad : listaEdades) {
            System.out.println("---"+edad);
        }
    }

}
