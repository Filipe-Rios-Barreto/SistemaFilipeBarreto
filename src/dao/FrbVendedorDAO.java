package dao;

import bean.FrbVendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class FrbVendedorDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(FrbVendedor.class);
        criteria.add(Restrictions.eq("frbIdVendedor", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }


    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVendedor.class);
        criteria.add(Restrictions.like("frbNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }


    public Object listComissao(double comissao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVendedor.class);
        criteria.add(Restrictions.ge("frbComissao", comissao));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }


    public Object listNomeComissao(String nome, double comissao) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVendedor.class);
        criteria.add(Restrictions.like("frbNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("frbComissao", comissao));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbVendedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
