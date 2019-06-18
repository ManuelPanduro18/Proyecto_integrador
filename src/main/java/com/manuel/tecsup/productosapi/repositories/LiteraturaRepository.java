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

import com.manuel.tecsup.productosapi.models.Literatura;

@Repository
public class LiteraturaRepository {
	private static final Logger logger = LoggerFactory.getLogger(LiteraturaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Literatura>listar(){
		logger.info("call listar()");
		
		String sql="select * from literatura";
		
		List<Literatura> literaturas=jdbcTemplate.query(sql, new RowMapper<Literatura>() {
			public Literatura mapRow(ResultSet rs,int rowNum) throws SQLException{
				Literatura literatura=new Literatura();
				
				literatura.setId(rs.getInt("id"));
				literatura.setImagen(rs.getString("imagen"));
				literatura.setNombre(rs.getString("nombre"));
				literatura.setDescripcion(rs.getString("descripcion"));
				
				return literatura;
			}
		});
		logger.info("literaturas: "+ literaturas);
		
		return literaturas;
	}

}
