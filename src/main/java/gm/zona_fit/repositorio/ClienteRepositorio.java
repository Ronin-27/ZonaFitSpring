package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> { //Extendemos la interfaz desde otra interfaz
    //Se agrega el tipo de objeto y asi como el tipo de dato de la primary key
    //Con esta interfaz vamos a poder acceder a los metodos para onsertar borrar o mover datos de acuerdo a los comandos de sql
}
