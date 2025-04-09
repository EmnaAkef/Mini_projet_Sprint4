package com.emna.films.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomFil", types = { Film.class }) 
public interface FilmProjection {

}
