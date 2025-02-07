package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service //Indica al repositorio que es un servicio para conectar con la base de datos, y de esta manera trata a la clase definida a continuación
public class ClienteServicio implements IClienteServicio{

    @Autowired //Se va a autoinyectar una referencia de acuerdo a como declaramos nuestra llave primaria en la interfaz Cliente Repositorio
    private ClienteRepositorio clienteRepositorio; //hace referecnia al repositorio para de esta maera poder utilizar las herramientas que a continuacion aparece
    //De esta manera podemos hacer operacion en la base de datos sin utilizar comando sql
    //Debe ir precidido por el autowired

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll(); //findALL se encuentra definido dentro de la clase JpaRepository
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null); //Busca un registro por medio de la primary key or else si no encuentra nada retorna el valor especificado
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente); //Guarda el registro en la base de datos
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente); //borra el registro de la base de datos
    }
}
