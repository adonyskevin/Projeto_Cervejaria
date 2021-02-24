package com.npisistemas.brewer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.npisistemas.brewer.model.Cerveja;
import com.npisistemas.brewer.model.Cliente;
import com.npisistemas.brewer.model.Usuario;

@Controller
public class CervejasController {
	
	//Método Forward (padrão)
	@RequestMapping("/cervejas/novo")
	public String novo(Cerveja cerveja){
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping("/clientes/novo")
	public String novo(Cliente cliente){
		return "cliente/CadastroCliente";
	}
	
	@RequestMapping("/usuarios/novo")
	public String novo(Usuario usuario){
		return "usuario/CadastroUsuario";
	}

	// Apesar de ser o mesmo URL, estamos chamando pelo método POST, então teremos uma view diferente
	@RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()){
			return novo(cerveja);
		}
		
		//Salvar no banco
		
		attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
		//Método Redirect faz uma nova requisição e começa novamente
		//System.out.println(">>> sku: " + cerveja.getSku());
		return "redirect:/cervejas/novo";
	}
	
	@RequestMapping(value = "/clientes/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cliente cliente, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()){
			return novo(cliente);
		}
		
		//Salvar no banco
		
		attributes.addFlashAttribute("mensagem", "Cliente salvo com sucesso!");
		//Método Redirect faz uma nova requisição e começa novamente
		return "redirect:/clientes/novo";
	}
	
	@RequestMapping(value = "/usuarios/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Usuario usuario, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()){
			return novo(usuario);
		}
		
		//Salvar no banco
		
		attributes.addFlashAttribute("mensagem", "Usuario salvo com sucesso!");
		//Método Redirect faz uma nova requisição e começa novamente
		return "redirect:/usuarios/novo";
	}
	
}