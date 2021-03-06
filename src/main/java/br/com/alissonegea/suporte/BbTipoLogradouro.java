package br.com.alissonegea.suporte;

import br.com.alissonegea.model.dao.HibernateDAO;
import br.com.alissonegea.model.dao.InterfaceDAO;
import br.com.alissonegea.model.entity.TipoLogradouro;
import br.com.alissonegea.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name="bbTipoLogradouro")
@RequestScoped
public class BbTipoLogradouro  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<TipoLogradouro> getTipoLogradouros() {
        Session session = FacesContextUtil.getRequestSession();
        InterfaceDAO<TipoLogradouro> tipoLogradouroDAO = new HibernateDAO<TipoLogradouro>(TipoLogradouro.class, session);
        return tipoLogradouroDAO.getEntities();
    }
}
