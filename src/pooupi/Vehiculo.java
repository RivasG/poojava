package pooupi;

import javax.swing.JOptionPane;

public class Vehiculo {
// atributos

    String color;
    String marcar;
    String modelo;
    int odometro;

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo carro1 = new Vehiculo();
        carro1.color = "Gris";
        carro1.marcar = "Audi";
        carro1.modelo = "A3";
        carro1.odometro = 100;

        System.out.println("El color es :" + carro1.color);
        System.out.println("La marcar es :" + carro1.marcar);
        System.out.println("El modelo es :" + carro1.modelo);
        System.out.println("El odometro es :" + carro1.odometro);

        System.out.println("---------------------------------------");
        Vehiculo taxi = new Vehiculo();
        taxi.color = JOptionPane.showInputDialog(" Digite el color del taxi");
        taxi.marcar = JOptionPane.showInputDialog("Digite la marca del taxi");
        taxi.modelo = JOptionPane.showInputDialog("Digite el modelo del  taxi");
        taxi.odometro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese le odomentro del taxi "));

        JOptionPane.showMessageDialog(null, " El color del  taxi es :" + taxi.color);
        JOptionPane.showMessageDialog(null, " La marca del taxi es :" + taxi.marcar);
        JOptionPane.showMessageDialog(null, " El modelo del taxi es :" + taxi.modelo);
        JOptionPane.showMessageDialog(null, " El odometro del  taxi es :" + taxi.odometro);
        Vehiculo bus=new Vehiculo();
        
        bus.color = JOptionPane.showInputDialog(" Digite el color del bus");
        bus.marcar = JOptionPane.showInputDialog("Digite la marca del bus");
        bus.modelo = JOptionPane.showInputDialog("Digite el modelo del  bus");
        bus.odometro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese le odomentro del bus"));

        JOptionPane.showMessageDialog(null, " El color del  bus es :" + bus.color);
        JOptionPane.showMessageDialog(null, " La marca del bus es :" + bus.marcar);
        JOptionPane.showMessageDialog(null, " El modelo del bus es :" + bus.modelo);
        JOptionPane.showMessageDialog(null, " El odometro del  bus es :" + bus.odometro);
        

    }
}
