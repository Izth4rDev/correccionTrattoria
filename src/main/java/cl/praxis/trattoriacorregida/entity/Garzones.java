package cl.praxis.trattoriacorregida.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Garzones {
    @Id
    @Column(name = "id_garzon")
    private int id;
    @Column(name = "rut")
    private String rut;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "garzon")
    private List<Comandas> comandas;
}
