package com.jsps.poointerfaces.repositorio;

import com.jsps.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}