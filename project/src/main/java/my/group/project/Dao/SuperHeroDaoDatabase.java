
package my.group.project.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;
import javax.inject.Inject;
import my.group.project.dto.SuperHero;
import my.group.project.dto.SuperTeam;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SuperHeroDaoDatabase implements SuperHeroDao {

    JdbcTemplate jdbcTemplate;

    public SuperHeroDaoDatabase() {
    	System.out.println("DAO Created");
}

    @Inject
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println(jdbcTemplate.toString());
    }

    //PREPARED STATEMENTS
    private static String GET_SuperHero_BY_ID
            = "SELECT * "
            + "FROM superhero "
            + "WHERE id = ? ";

    private static String GET_SuperTeam_BY_ID
            = "SELECT * "
            + "FROM superteam "
            + "WHERE superTeamID = ? ";


    private static String GET_All_SuperHero
            = "SELECT * "
            + "FROM superhero";

    private static String GET_All_SuperTeam
            = "SELECT * "
            + "FROM superteam";

    public SuperHero getSuperHeroById(int id) {
        SuperHero s = jdbcTemplate.queryForObject(GET_SuperHero_BY_ID, new SuperHeroMapper(), id);
        return s;
    }

    public SuperTeam getSuperTeamById(int id) {
        SuperTeam b = jdbcTemplate.queryForObject(GET_SuperTeam_BY_ID, new SuperTeamMapper(), id);
        return b;
    }

    public List<SuperHero> getAllSuperHeroes() {
        List<SuperHero> s = jdbcTemplate.query(GET_All_SuperHero, new SuperHeroMapper());
        return s;
    }

    public List<SuperTeam> getAllSuperTeams() {
        List<SuperTeam> t = jdbcTemplate.query(GET_All_SuperTeam, new SuperTeamMapper());
        return t;

    }
/*
    @Override
    public Map<SuperTeam, List<SuperHero>> getAllSuperHero() {
        return null;
    }

    @Override
    public Set<SuperTeam> getAllSuperTeam() {
        return null;
    }

    @Override
    public List<SuperHero> getSuperHeroBySuperTeam(SuperTeam superTeam) {
        return null;
    }

    @Override
    public SuperTeam getSuperTeamByName(String name) {
        return null;
    }

    @Override
    public void addNewSuperHero(SuperHero p) {

    }


 */

    private class SuperTeamMapper implements RowMapper<SuperTeam> {

        @Override
        public SuperTeam mapRow(ResultSet rs, int rowNum) throws SQLException {
            SuperTeam b = new SuperTeam();
            b.setSuperTeamId(rs.getInt("superTeamID"));
            b.setTeamName(rs.getString("teamName"));
            b.setHeadQuarter(rs.getString("headQuarter"));

            return b;
        }
    }

    private class SuperHeroMapper implements RowMapper<SuperHero> {

        @Override
        public SuperHero mapRow(ResultSet rs, int rowNum) throws SQLException {
            SuperHero h = new SuperHero();
            h.setId(rs.getInt("id"));
            h.setSuperName(rs.getString("superName"));
            h.setRealName(rs.getString("realName"));
            h.setPowers(new ArrayList<String>(Arrays.asList(rs.getString("powers").split(" "))));
            h.setAge(rs.getInt("age"));
            h.setWeight(rs.getDouble("height"));
            h.setHeight(rs.getDouble("weight"));
            h.setSex(rs.getString("sex").charAt(0));


            int SuperTeamId = rs.getInt("superTeamID");

            SuperTeam b = getSuperTeamById(SuperTeamId);
            h.setTeam(b);
            return h;
        }

    }

}
