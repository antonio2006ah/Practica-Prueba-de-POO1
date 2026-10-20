import java.util.Arrays;

class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public double calcularPromedio() {
        int i;
        double suma = 0;
        for (i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;

    }

    public boolean estaAprobado() {
        if (calcularPromedio() >= 6.0) {
            return true;

        } else {
            return false;
        }
    }

    public void Mostardatos() {
        System.out.println("nombre del estudiante: " + nombre);
        System.out.println("notas del estudiante: " + Arrays.toString(notas));
        System.out.println("esta aprobado: "+estaAprobado());

    }

    public static void main(String[] args) {
        double[] notasestudiante1 = {8,9,10};
        Estudiante estudiante1 = new Estudiante("Antonio Illanes",notasestudiante1);
        estudiante1.Mostardatos();
        double[] notasestudiante2 ={4,5,6};
        Estudiante estudiante2 = new Estudiante("Juan Perz",notasestudiante2);
        estudiante2.Mostardatos();
        

    }

}