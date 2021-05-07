package com.jonathan.servicio;

import com.jonathan.domain.Usuario;
import java.util.List;
import javax.ejb.Local;

@Local
public interface IUsuarioService {

    public List<Usuario> listar_usuario();
}
