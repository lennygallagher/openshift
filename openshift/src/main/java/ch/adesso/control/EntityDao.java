package ch.adesso.control;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EntityDao {

    private Logger logger = LogManager.getLogger(EntityDao.class);

    @Inject
    EntityManager entityManager;

    public void save(Entity entity) {
        logger.debug("Saving entity {}", entity);
        entityManager.persist(entity);
        logger.debug("Saved entity {}", entity);
    }

}
