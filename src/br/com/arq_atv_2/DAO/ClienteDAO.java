/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.arq_atv_2.DAO;

import br.com.arq_atv_2.bdmemoria.BD;
import br.com.arq_atv_2.model.Cliente;
import java.util.List;

/**
 *
 * @author gardh
 */
public class ClienteDAO {

    public boolean addDao(Cliente obj){
        if(obj.getIdCli() == null){
            int id = BD.listCliente.size()+1;
            obj.setIdCli(id);
            BD.listCliente.add(obj);
        }
        return true;
    }
    
    public boolean removeDao(Cliente obj){
        BD.listCliente.remove(obj);
        return true;
    }
    
    public List<Cliente> getAllCliente() {

        return BD.listCliente;
    }
}
