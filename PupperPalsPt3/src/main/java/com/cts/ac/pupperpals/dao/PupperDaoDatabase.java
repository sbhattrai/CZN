package com.cts.ac.pupperpals.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cts.ac.pupperpals.dto.Breed;
import com.cts.ac.pupperpals.dto.Pupper;

public class PupperDaoDatabase implements PupperDao {
	
	JdbcTemplate jdbcTemplate;

    public PupperDaoDatabase() {

    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
    }
    
    //PREPARED STATEMENTS
    private static String GET_PUPPER_BY_ID 
    	= "SELECT * "
    	+ "FROM pupper "
    	+ "WHERE id = ? ";
    
    private static String GET_BREED_BY_ID
    	= "SELECT * "
    	+ "FROM breed "
    	+ "WHERE id = ? ";

	public Pupper getPupperById(int id) {
		Pupper p = jdbcTemplate.queryForObject(GET_PUPPER_BY_ID, new PupperMapper(), id);
		return p;
	}
	
	public Breed getBreedById(int id) {
		Breed b = jdbcTemplate.queryForObject(GET_BREED_BY_ID,  new BreedMapper(), id);
		return b;
	}
	
	private class BreedMapper implements RowMapper<Breed> {

		@Override
		public Breed mapRow(ResultSet rs, int rowNum) throws SQLException {
			Breed b = new Breed();
			b.setId(rs.getInt("id"));
			b.setName(rs.getString("name"));
			b.setTemperament(rs.getString("temperament"));
			b.setCoat(rs.getString("coat"));
			return b;
		}	
	}
	
	private class PupperMapper implements RowMapper<Pupper> {

		@Override
		public Pupper mapRow(ResultSet rs, int rowNum) throws SQLException {
			Pupper p = new Pupper();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setSex(rs.getString("sex").charAt(0));
			p.setWeight(rs.getDouble("weight"));
			p.setHeight(rs.getDouble("height"));
			p.setColor(rs.getString("color"));
			p.setDob(rs.getDate("date_of_birth").toLocalDate());
			int breedId = rs.getInt("breed_id");
			
			Breed b = getBreedById(breedId);
			p.setBreed(b);
			return p;
		}
		
	}

}

