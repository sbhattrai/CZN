package Service;

import dao.SuperHeroDao;
import dto.AddSuperHeroDto;
import dto.SuperHero;
import dto.SuperTeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SuperHeroService {
    SuperHeroDao dao;

    public SuperHeroService(SuperHeroDao dao){ this.dao = dao;}



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
}