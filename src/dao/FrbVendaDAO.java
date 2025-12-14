package dao;

import bean.FrbVenda;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class FrbVendaDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVenda.class);
        criteria.add(Restrictions.eq("frbIdVenda", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listCliente(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVenda.class, "v");
        criteria.createAlias("v.frbClientes", "c");
        criteria.add(Restrictions.like("c.frbNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVenda.class);
        criteria.add(Restrictions.ge("frbValorTotal", valor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listClienteValor(String nome, double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVenda.class, "v");
        criteria.createAlias("v.frbClientes", "c");
        criteria.add(Restrictions.like("c.frbNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("v.frbValorTotal", valor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVenda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
