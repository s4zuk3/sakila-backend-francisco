package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the film_actor database table.
 * 
 */
@Entity
@Table(name="film_actor")
@NamedQuery(name="FilmActor.findAll", query="SELECT f FROM FilmActor f")
public class FilmActor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//bi-directional many-to-one association to Actor
	//@ManyToOne
	@Column(name="actor_id")
	private int actor_id;
	
	//bi-directional many-to-one association to Film
	//@ManyToOne
	@Column(name="film_id")
	private int film_id;
	
	@EmbeddedId
	private FilmActorPK id;

	@Column(name="last_update")
	private Timestamp lastUpdate;

	

	

	public FilmActor() {
	}

	public FilmActorPK getId() {
		return this.id;
	}

	public void setId(FilmActorPK id) {
		this.id = id;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public int getActor() {
		return this.actor_id;
	}

	public void setActor(int actor) {
		this.actor_id = actor;
	}

	public int getFilm() {
		return this.film_id;
	}

	public void setFilm(int film) {
		this.film_id = film;
	}

}