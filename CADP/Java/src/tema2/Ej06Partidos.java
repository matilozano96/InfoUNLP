package tema2;
import PaqueteLectura.Lector;
public class Ej06Partidos {
    final static int PARTIDOS = 20;
    
    public static void main(String[] args) {
        Partido[] campeonato = new Partido[PARTIDOS];
        
        String local, visitante;
        for (int i = 0; i < PARTIDOS; i++){
            System.out.print("Equipo Local: ");
            local = Lector.leerString();
            System.out.print("Equipo Visitante: ");
            visitante = Lector.leerString();
            if ("ZZZ".equals(visitante.toUpperCase())){ break; }
            
            campeonato[i] = new Partido(local, visitante, 0, 0);
            System.out.print("Goles Local: ");
            campeonato[i].setGolesLocal(Lector.leerInt());
            System.out.print("Goles Visitante: ");
            campeonato[i].setGolesVisitante(Lector.leerInt());
        }
        
        
        int boke = 0, river = 0, jugados = 0, empates = 0;
        System.out.println("-------------------");
        
        for (int i = 0; i < PARTIDOS; i++){
            if (campeonato[i] == null){ break; }
            
            jugados += 1;
            if (campeonato[i].getGanador().toUpperCase().equals("RIVER")) { river += 1; }
            if (campeonato[i].getLocal().toUpperCase().equals("BOCA")) { boke += campeonato[i].getGolesLocal(); }
            if (campeonato[i].hayEmpate()) { empates += 1; }
        }
        
        System.out.println("River gano " + river + " partido(s).");
        System.out.println("Boquita anoto " + boke + " gol(es) de local.");
        System.out.println("El " + (empates * 100/jugados) + "% de los partidos terminaron en empate.");
    }
}
