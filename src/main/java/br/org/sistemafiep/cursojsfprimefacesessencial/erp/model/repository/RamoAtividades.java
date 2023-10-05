package br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.repository;

import br.org.sistemafiep.cursojsfprimefacesessencial.erp.model.model.RamoAtividade;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import javax.inject.Inject;
import java.util.List;

public class RamoAtividades {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public RamoAtividades() {

    }

    public RamoAtividades(EntityManager manager) {
        this.manager = manager;
    }

    public List<RamoAtividade> pesquisar(String descricao) {
        CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

        CriteriaQuery<RamoAtividade> criteriaQuery = criteriaBuilder.createQuery(RamoAtividade.class);
        Root<RamoAtividade> root = criteriaQuery.from(RamoAtividade.class);
        criteriaQuery.select(root);
        criteriaQuery.where(criteriaBuilder.like(root.get("descricao"), descricao + "%"));

        TypedQuery<RamoAtividade> query = manager.createQuery(criteriaQuery);

        return query.getResultList();
    }
}
