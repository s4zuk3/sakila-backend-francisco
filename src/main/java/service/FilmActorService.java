package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import facade.FilmActorFacade;
import model.FilmActor;

@Path("/filmactors")
public class FilmActorService {
	
	@EJB 
	FilmActorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(FilmActorService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<FilmActor> findAll(){
		return filmActorFacadeEJB.findAll();
	}
	

}
