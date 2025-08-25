package app;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Veterinaria nuevaVeterinaria = new Veterinaria("san martin", "1092");

        boolean respuestaCreacion = nuevaVeterinaria.agregarMascota("lola", "perro",
                "rostwiler", 5 ,
                "122345","juan","3103743305");



        JOptionPane.showMessageDialog(null, nuevaVeterinaria.obtenerListaMascota());




        if (respuestaCreacion) {
            JOptionPane.showMessageDialog(null, "Mascota agregada correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Mascota no agregada");
        }




        boolean respuestaCreacion2 = nuevaVeterinaria.agregarMascota("polo", "perro",
                "bulberry", 4,
                "1223456","pedro","3116910508");

        JOptionPane.showMessageDialog(null, nuevaVeterinaria.obtenerListaMascota());


        if (respuestaCreacion2) {
            JOptionPane.showMessageDialog(null, "Masscota agregada correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Mascota no agregada");
        }
    }
}
