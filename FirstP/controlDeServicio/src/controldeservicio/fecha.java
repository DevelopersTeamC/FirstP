package controldeservicio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class fecha {
    public void hora(){
        LocalTime horaA= LocalTime.now();
        System.out.println(horaA);
    }
    public void fecha(){
        LocalDate fechaA= LocalDate.now();
        System.out.println(fechaA);
    }
    public void fechaHora(){
        LocalDateTime fechaHoraA= LocalDateTime.now();
        System.out.println(fechaHoraA);
    }
}
