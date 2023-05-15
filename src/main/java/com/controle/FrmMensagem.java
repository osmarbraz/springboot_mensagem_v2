package com.controle;

/**
 * Modelo do formulário de mensagem.
 *
 * @author osmar
 */
public class FrmMensagem {

    private String mensagem;

    public FrmMensagem() {
        this("");
    }

    public FrmMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}