package dataaccess;

import java.util.List;
import javax.persistence.EntityManager;
import models.Role;
/**
 *
 * @author Alex Tompkins - 821984
 */
public class RoleDB {
    public List<Role> getAll() throws Exception {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        
        try {
            List<Role> roleList = em.createNamedQuery("Role.findAll", Role.class).getResultList();
            return roleList;
        } finally {
            em.close();
        }
    }
}
