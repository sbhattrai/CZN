package my.group.project.Service;

import my.group.project.Dao.SuperHeroDao;
import my.group.project.dto.AddSuperHeroDto;
import my.group.project.dto.SuperHero;
import my.group.project.dto.SuperTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

public class SuperHeroServiceImpl implements SuperHeroService {
    SuperHeroDao dao;
    
    @Inject
    public void setDao(SuperHeroDao dao) {
    	this.dao = dao;
    }
    	
    	public SuperHeroServiceImpl() {
    		System.out.println("Service Created");
    	}


    
    	public SuperHero addSuperHero(AddSuperHeroDto superheroData) {
    		return null;
    	}
    	
    	public List<SuperHero> findSuperHeroBySuperTeamName(String superteamName) {
    		return null;
    	}
    	
    	public List<SuperHero> findAllSuperHeros() {

    		return null;
    	}
    	
    	
    	
    	public List<SuperTeam> getSuperTeams() {
    		return dao.getAllSuperTeams();
    	}

    	
    	public SuperHero getSuperHeroById(int id) {
    		
    		return dao.getSuperHeroById(id);
    	}
    	

    	public SuperTeam getSuperTeamById(int id) {
    		
    		return dao.getSuperTeamById(id);
    	}
    	
    	

    public SuperHeroServiceImpl(SuperHeroDao dao){ this.dao = dao;}


   // public SuperHero getSuperHeroById(int id){return dao.getSuperHeroById(id);}
    //public SuperTeam getSuperTeamById(int id) {return dao.getSuperTeamById(id);}
    public List<SuperHero> getAllSuperHeroes() {return dao.getAllSuperHeroes();}
   // public List<SuperTeam> getAllSuperTeams(){return dao.getAllSuperTeams();}

@Override
public List<SuperHero> findSuperHerosBySuperTeam(String superteamName) {
	// TODO Auto-generated method stub
	return null;
}




/*
    public SuperHero addSuperHero(AddSuperHeroDto Dto) {
        SuperTeam team = dao.getSuperTeamByName(Dto.getTeamname());


        if (team == null) throw new service.InvalidSuperTeamNameException("Invalid Name");

        SuperHero hero = new SuperHero(Dto.getSupername(), Dto.getRealName(), Dto.getPowers(), Dto.getAge(), Dto.getHeight(), Dto.getWeight(), Dto.getSex(), team);

        dao.addNewSuperHero(hero);

        return hero;


    }

    public List<SuperHero> findAllSuperHerosByTeamName(String name) {
        SuperTeam team = dao.getSuperTeamByName(name);


        try {
            if (team == null) throw new service.InvalidSuperTeamNameException("Invalid Name");
        } catch (service.InvalidSuperTeamNameException e) {
            System.out.println("Invalid team name");
            // System.exit(0);
        }
        return dao.getSuperHeroBySuperTeam(team);

    }
/*
    public List<SuperHero> findAllSuperHero () {
        Map<SuperTeam, List<SuperHero>> SuperHeroMap = dao.getAllSuperHero();
        List<SuperHero> SuperHeros = new ArrayList<SuperHero>();

        for (List<SuperHero> s : SuperHeroMap.values()) {
            SuperHeros.addAll(s);
        }

        return SuperHeros;
    }


    public List<SuperTeam> getSuperTeams () {
        return new ArrayList <SuperTeam> (dao.getAllSuperTeam());
    }

    */
}