package tema2;
import PaqueteLectura.Lector;

public class Ej05Casting {
    final static int DIAS = 5;
    final static int CANT = 2;    
    
    
    public static void main(String[] args) {
        Persona [][] casting = new Persona[DIAS][CANT];
        
        
        int i = 0,j = 0;
        boolean seguir = true;
        while (i < DIAS & seguir){
            System.out.println("Dia " + (i+1) + ": ");
            j = 0;
            while (j < CANT & seguir) {
                
                System.out.print(" Nombre: ");
                String n = Lector.leerString();
                
                if(n.equals("ZZZ")){
                    seguir = false;
                }
                else {
                    System.out.print(" DNI: ");
                    int dni = Lector.leerInt();
                    System.out.print(" Edad: ");
                    int edad = Lector.leerInt();
                    casting[i][j] = new Persona(n, dni, edad);
                }
                System.out.println(" ");
                j++;
            }
            i++;
        }
        
        for (i = 0; i < DIAS; i++){
            if (casting[i][0] != null) {
                System.out.println("Dia " + (i+1) + ": ");
                for (j = 0; j < CANT; j++){
                    if (casting[i][j] != null) { System.out.println("  "  + (j+1) + ": " + casting[i][j].getNombre()); }
                }
            }
        }
    }
}
