package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.FilmActorPKFacade;
import model.FilmActorPK;

@Stateless
public class FilmActorPKFacadeEJB extends AbstractFacade<FilmActorPK> implements FilmActorPKFacade {
	
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public FilmActorPKFacadeEJB() {
		super(FilmActorPK.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
