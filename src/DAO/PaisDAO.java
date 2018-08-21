/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import br.com.arq_atv.bdmemoria.BD;
import br.com.arq_atv_2.model.Pais;
import java.util.List;

/**
 *
 * @author gardh
 */
public class PaisDAO {
    
    public boolean addDao(Pais obj){
        if(obj.getIdPais() == null){
            Integer id = BD.listPais.size()+1;
            obj.setIdPais(id);
            BD.listPais.add(obj);
        }
        return true;
    }
    
    
    public boolean removeDAO(Pais obj){
         BD.listPais.remove(obj);
         return true;
    }
    
    public List<Pais> getAllPais(){
        return BD.listPais;
    }
}
