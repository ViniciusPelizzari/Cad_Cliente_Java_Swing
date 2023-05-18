/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

/**
 *
 * @author Vinícius Pelizzari
 */

import domain.Cliente;
import java.util.Collection;

public interface IClienteDAO {

    public  boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public boolean alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}

