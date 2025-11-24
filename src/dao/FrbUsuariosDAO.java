/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FrbUsuarios;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u42977829873
 */
public class FrbUsuariosDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(FrbUsuarios.class);
        criteria.add(Restrictions.eq("frbIdUsuario", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public Object listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(FrbUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        FrbUsuariosDAO frbUsuariosDAO = new FrbUsuariosDAO();
        frbUsuariosDAO.listAll();
        System.out.println("Deu certo!");
    }
    
    public boolean autenticar(String frbnome, String frbsenha) {
        try {
            session.beginTransaction();

            String hql = "FROM FrbUsuarios WHERE frbNome = :nome AND frbSenha = :senha";
            org.hibernate.Query query = session.createQuery(hql);
            query.setParameter("nome", frbnome);
            query.setParameter("senha", frbsenha);

            FrbUsuarios usuario = (FrbUsuarios) query.uniqueResult();

            session.getTransaction().commit();

            if (usuario != null) {
                return true;
            }

        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FrbUsuariosDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        return false;
    }
}
