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

import com.manuel.tecsup.productosapi.models.Politica;

@Repository
public class PoliticaRepository {
private static final Logger logger = LoggerFactory.getLogger(PoliticaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Politica>listar(){
		logger.info("call listar()");
		
		String sql="select * from politica";
		
		List<Politica> politicas=jdbcTemplate.query(sql, new RowMapper<Politica>() {
			public Politica mapRow(ResultSet rs,int rowNum) throws SQLException{
				Politica politica=new Politica();
				
				politica.setId(rs.getInt("id"));
				politica.setImagen(rs.getString("imagen"));
				politica.setNombre(rs.getString("nombre"));
				politica.setDescripcion(rs.getString("descripcion"));
				
				return politica;
			}
		});
		logger.info("pliticas: "+ politicas);
		
		return politicas;
	}

}
