package ico.fes.demo.model;

import lombok.*;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Empleado {
    private int id;
    private String nombre;
    private double sueldo;
    private String departamento;
    private String fechaNacimiento;
}
