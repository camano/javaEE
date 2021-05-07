/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.datos;

import com.jonathan.domain.Usuario;
import java.util.List;

/**
 *
 * @author jonathan
 */
public interface IUsuarioDao {
    
    public List<Usuario>findAllUsuario();
}
