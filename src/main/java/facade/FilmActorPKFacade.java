package facade;

import java.util.List;

import javax.ejb.Local;

import model.FilmActorPK;

@Local
public interface FilmActorPKFacade {

	public void create(FilmActorPK entity);

	public void edit(FilmActorPK entity);

	public void remove(FilmActorPK entity);

	public FilmActorPK find(Object id);

	public List<FilmActorPK> findAll();

	public List<FilmActorPK> findRange(int[] range);

	public int count();

}