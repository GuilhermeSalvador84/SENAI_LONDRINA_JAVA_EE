package br.org.sistemafiep.cursojsfprimefacesessencial.erp.controller;

import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.model.Empresa;
import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.model.TipoEmpresa;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class GestaoEmpresasBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Empresa empresa = new Empresa();

    public void salvar() {
        System.out.println("Razão social: " + empresa.getRazaoSocial()
                + " Nome Fantasia: " + empresa.getNomeFantasia()
                + " Tipo: " + empresa.getTipo());
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public TipoEmpresa[] getTiposEmpresa() {
        return TipoEmpresa.values();
    }





}
