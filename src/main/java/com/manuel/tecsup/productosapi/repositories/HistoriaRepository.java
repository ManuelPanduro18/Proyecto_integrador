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

import com.manuel.tecsup.productosapi.models.Historia;;

@Repository
public class HistoriaRepository {
private static final Logger logger = LoggerFactory.getLogger(HistoriaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Historia>listar(){
		logger.info("call listar()");
		
		String sql="select * from historia";
		
		List<Historia> historias=jdbcTemplate.query(sql, new RowMapper<Historia>() {
			public Historia mapRow(ResultSet rs,int rowNum) throws SQLException{
				Historia historia=new Historia();
				
				historia.setId(rs.getInt("id"));
				historia.setImagen(rs.getString("imagen"));
				historia.setNombre(rs.getString("nombre"));
				historia.setDescripcion(rs.getString("descripcion"));
				
				return historia;
			}
		});
		logger.info("historias: "+ historias);
		
		return historias;
	}

}
