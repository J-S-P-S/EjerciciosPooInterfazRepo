package com.jsps.poointerfaces;

import com.jsps.poointerfaces.modelo.Cliente;
import com.jsps.poointerfaces.repositorio.*;
import java.util.List;

public class MainRepositorio {

    public static void main(String[] args) {

        ResumenRepositorio repo = new ClienteListRepositorio();
        repo.insertar(new Cliente("Sebastian","Perez"));
        repo.insertar(new Cliente("Bea","González"));
        repo.insertar(new Cliente("Luci","Martinez"));
        repo.insertar(new Cliente("Andrés", "Guzmán"));

        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);
        System.out.println("===== PAGINABLE =====");
        List<Cliente> paginable = repo.listar(1,4);
        paginable.forEach(System.out::println);
        System.out.println("===== ORDENABLE ASCENDENTE/DESCENDENTE=====");
        List<Cliente> clienteOrdenAsc = repo.listar("nombre", Direccion.DESC);
        clienteOrdenAsc.forEach(System.out::println);
        System.out.println("===== EDITAR =====");
        Cliente actualizar = new Cliente("Bea", "Mena");
        actualizar.setId(2);
        repo.editar(actualizar);
        Cliente bea = repo.porId(2);
        clienteOrdenAsc.forEach(System.out::println);
        System.out.println("===== ELIMINAR =====");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== TOTAL REGISTROS =====");
        System.out.println(repo.total());

    }
}