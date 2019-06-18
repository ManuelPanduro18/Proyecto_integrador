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

import com.manuel.tecsup.productosapi.models.Tema;

@Repository
public class TemaRepository {
	private static final Logger logger = LoggerFactory.getLogger(TemaRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Tema> listar(){
		logger.info("call listar()");
		
		String sql="select * from tema";
		
		List<Tema> temas=jdbcTemplate.query(sql, new RowMapper<Tema>() {
			public Tema mapRow(ResultSet rs, int rowNum) throws SQLException{
				Tema tema=new Tema();
				
				tema.setIdtema(rs.getInt("idtema"));
				tema.setImagen(rs.getString("imagen"));
				tema.setNombre(rs.getString("nombre"));
				tema.setDescripcion(rs.getString("descripcion"));
				
				return tema;
			}
		});
		
		logger.info("temas: "+temas);
		
		return temas;
	}

}
