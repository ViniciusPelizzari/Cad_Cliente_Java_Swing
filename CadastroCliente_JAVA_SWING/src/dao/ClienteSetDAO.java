/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Vinícius Pelizzari
 */

import domain.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        if (this.set.contains(cliente)) {
            return false;
        }
        this.set.add(cliente);
        return true;
    }


    @Override
    public void excluir(Long cpf) {
        Cliente clienteCadastrado = consultar(cpf);
        if (clienteCadastrado != null) {
            set.remove(clienteCadastrado);
        }
    }

    @Override
    public boolean alterar(Cliente cliente) {
        Cliente clienteCadastrado = consultar(cliente.getCpf());
        if (clienteCadastrado != null) {
            clienteCadastrado.setNome(cliente.getNome());
            clienteCadastrado.setTel(cliente.getTel());
            clienteCadastrado.setEnd(cliente.getEnd());
            clienteCadastrado.setNum(cliente.getNum());
            clienteCadastrado.setCidade(cliente.getCidade());
            clienteCadastrado.setUf(cliente.getUf());
        }
        return true;
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente cliente : set) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return set;
    }
}

