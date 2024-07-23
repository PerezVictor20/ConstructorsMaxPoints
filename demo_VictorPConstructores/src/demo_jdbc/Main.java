package demo_jdbc;

import demo_jdbc.models.DriverMaxPoint;
import demo_jdbc.respositories.QueryRepository;

public class Main {

    public static void main(String[] args) {
        
        QueryRepository queryRepository = new QueryRepository();
        var results1 = queryRepository.getConstructorsMaxPoints();  // Llamada al método para obtener los constructores con más puntos
        System.out.println("\nConstructores con más puntos:\n");
        for(DriverMaxPoint rs: results1) {
            System.out.println(rs.getDriverName() + "\t" + rs.getPoints());
        }
    }
}
