package com.npisistemas.brewer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.npisistemas.brewer.model.Usuario;
import com.npisistemas.brewer.service.CadastroUsuarioService;
import com.npisistemas.brewer.service.exception.EmailJaCadastradoException;

@Controller
@RequestMapping("/usuarios")
public class UsuariosController {
	
	@Autowired
	private CadastroUsuarioService cadastroUsuarioService;
	
	//@Autowired
	//private Usuarios usuarios;

	@RequestMapping("/novo")
	public ModelAndView novo(Usuario usuario) {
		ModelAndView mv = new ModelAndView("usuario/CadastroUsuario");
		return mv;
	}
	
	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public ModelAndView cadastrar(@Valid Usuario usuario, BindingResult result, Model model, RedirectAttributes attributes) {
		if (result.hasErrors()) {
			return novo(usuario);
		}
		
		try{
			cadastroUsuarioService.salvar(usuario);
		}catch (EmailJaCadastradoException e){
			result.rejectValue("email", e.getMessage(), e.getMessage());
			return novo(usuario);
		}
		
		//cadastroUsuarioService.salvar(usuario);
		attributes.addFlashAttribute("mensagem", "Usuário salvo com sucesso!");
		return new ModelAndView("redirect:/usuarios/novo");
	}
	
}
