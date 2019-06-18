package com.manuel.tecsup.productosapi.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.manuel.tecsup.productosapi.models.Noticia;

@Repository
public class NoticiaRepository {
	private static final Logger logger=LoggerFactory.getLogger(NoticiaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Noticia>listar(){
		logger.info("call listar()");
		
		String sql="select * from noticia";
		
		List<Noticia> noticias=jdbcTemplate.query(sql,new RowMapper<Noticia>() {
			public Noticia mapRow(ResultSet rs, int rowNum) throws SQLException{
				Noticia noticia=new Noticia();
				noticia.setId(rs.getInt("id"));
				noticia.setImagen(rs.getString("imagen"));
				noticia.setNombre(rs.getString("nombre"));
				noticia.setDescripcion(rs.getString("descripcion"));
				
				return noticia;
			}
		});
		logger.info("noticia: "+noticias);
		
		return noticias;
	}
}
