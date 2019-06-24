package Service;

import java.util.List;

import dto.AddSuperHeroDto;
import dto.SuperTeam;
import dto.SuperHero;

public interface SuperHeroService {

    public SuperHero getSuperHeroById(int id);

    public SuperTeam getSuperTeamById(int id);

    public List<SuperHero> getAllSuperHeroes ();

    public List<SuperTeam> getAllSuperTeams();


  //  public SuperHero addSuperHero(AddSuperHeroDto SuperHeroData);
//
    //public List<SuperHero> findSuperHeroBySuperTeamName(String SuperTeamName);

    //public List<SuperHero> findAllSuperHero();

    //List<SuperTeam> getSuperTeam();



}