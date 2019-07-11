package my.group.project.Service;

import java.util.List;

import my.group.project.dto.AddSuperHeroDto;
import my.group.project.dto.SuperHero;
import my.group.project.dto.SuperTeam;



public interface SuperHeroService {

    public SuperHero getSuperHeroById(int id);

    public SuperTeam getSuperTeamById(int id);
    
    //public SuperHero addSuperHero(AddSuperHeroDto superheroData);

    public List<SuperHero> findSuperHerosBySuperTeam(String superteamName);
    
    public List<SuperTeam> getSuperTeams();
    
    List<SuperHero> findAllSuperHeros();

	public Object getAllSuperHeroes();
	

  //  public SuperHero addSuperHero(AddSuperHeroDto SuperHeroData);
//
    //public List<SuperHero> findSuperHeroBySuperTeamName(String SuperTeamName);

    //public List<SuperHero> findAllSuperHero();

    //List<SuperTeam> getSuperTeam();



}