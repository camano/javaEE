/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.servicio;

import com.jonathan.datos.IUsuarioDao;
import com.jonathan.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jonathan
 */
@Stateless
public class UsuarioServiceImpl implements IUsuarioService {

    @Inject
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> listar_usuario() {
        return usuarioDao.findAllUsuario();
    }

}
