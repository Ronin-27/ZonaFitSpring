package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data //Nos va a crear todos los metodos get y set para cada una de las variables
@NoArgsConstructor //Creará un constructor sin argumentos
@AllArgsConstructor //Creará un constructor con todos los argumentos
@ToString //Modificamos el metodo to String para poder presentar las variables
@EqualsAndHashCode //Ayuda a igualar dos objetos por su contenido y no por su posicion de memoria

public class Cliente {
    @Id //Indica la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Va a generar los id de manera automatica
    //Cuando se utiliza un valor integer y no se especifica el valor se toma el valor de null
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer membresia;

}
