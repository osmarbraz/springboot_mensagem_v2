package com.controle;

import org.springframework.ui.Model;

/**
 * Interface dos serviços.
 *
 * @author osmar
 */
public interface MensagemServico {

    public String getMensagem(FrmMensagem frmMensagem, Model model);
    
    public String setMensagem(FrmMensagem frmMensagem, Model model);
}
