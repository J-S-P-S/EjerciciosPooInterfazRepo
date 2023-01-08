package com.jsps.poointerfaces.repositorio;

import com.jsps.poointerfaces.modelo.Cliente;
import java.util.List;

public interface OrdenableRepositorio {

    List<Cliente> listar(String campo, Direccion dir);

}