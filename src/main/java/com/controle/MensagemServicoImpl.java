package com.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Objeto com a implementação dos serviços.
 *
 * @author osmar
 */
@Controller
public class MensagemServicoImpl {

    /**
     * Carrega o arquivo "index.html" do diretório templates como
     * default "/" do projeto.
     *
     * @param frmMensagem
     * @param model
     * @return
     */
    @GetMapping("/")    
    public String getMensagem(FrmMensagem frmMensagem, Model model) {
        System.out.println("Executando frmMensagem");
        //Objeto adicionado como atributo a página html
        model.addAttribute("frmMensagem", frmMensagem);        
        return "FrmMensagem";
    }
    
    @PostMapping("/setMensagem")    
    public String setMensagem(FrmMensagem frmMensagem, Model model) {
        System.out.println("Executando serviço setMensagem(string) :" + frmMensagem.getMensagem());
        model.addAttribute("frmMensagem", frmMensagem);
        return "Resultado";
    }
}
