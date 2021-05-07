/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jonathan.web;

import com.jonathan.domain.Usuario;
import com.jonathan.servicio.IUsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author jonathan
 */
@WebServlet("/usuarios")
public class UsuarioServlet extends HttpServlet{
    
    @Inject
    IUsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        List<Usuario>listar=usuarioService.listar_usuario();
        System.out.println(listar);
        request.setAttribute("usuarios", listar);
        request.getRequestDispatcher("/listarUsuario.jsp").forward(request, response);
        
    }
}
