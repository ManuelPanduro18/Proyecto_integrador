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

import com.manuel.tecsup.productosapi.models.Gastronomia;

@Repository
public class GastronomiaRepository {
private static final Logger logger = LoggerFactory.getLogger(GastronomiaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Gastronomia>listar(){
		logger.info("call listar()");
		
		String sql="select * from gastronomia";
		
		List<Gastronomia> gastronomias=jdbcTemplate.query(sql, new RowMapper<Gastronomia>() {
			public Gastronomia mapRow(ResultSet rs,int rowNum) throws SQLException{
				Gastronomia gastronomia=new Gastronomia();
				gastronomia.setId(rs.getInt("id"));
				gastronomia.setTipo(rs.getString("tipo"));
				gastronomia.setImagen(rs.getString("imagen"));
				gastronomia.setNombre(rs.getString("nombre"));
				gastronomia.setDescripcion(rs.getString("descripcion"));
				
				return gastronomia;
			}
		});
		logger.info("gastronomias: "+ gastronomias);
		
		return gastronomias;
	}


}
