package br.org.sistemafiep.cursojsfprimefacesessencial.erp.controller;

import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.model.Empresa;
import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.model.TipoEmpresa;
import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.repository.Empresas;
import br.org.sistemafiep.cursojsfprimefacesessencial.util.FacesMessages;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Inject
    private Empresas empresas;
    @Inject
    private FacesMessages messages;

    private List<Empresa> listaEmpresa;

    private String termoPesquisa;

    public void pesquisar() {
        listaEmpresa = empresas.pesquisar(termoPesquisa);

        if (listaEmpresa.isEmpty()) {
            messages.info("Sua consulta não retornou registros");

        }
    }

    public void todasEmpresas() {
        listaEmpresa = empresas.todas();
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public String getTermoPesquisa() {
        return termoPesquisa;
    }

    public void setTermoPesquisa(String termoPesquisa) {
        this.termoPesquisa = termoPesquisa;
    }

    public TipoEmpresa [] getTiposEmpresa(){
        return TipoEmpresa.values();
    }
}
