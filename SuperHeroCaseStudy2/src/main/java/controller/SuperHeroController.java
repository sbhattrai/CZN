package controller;

import Service.SuperHeroServiceImpl;
import dto.SuperHero;
import dto.SuperTeam;
import dto.AddSuperHeroDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperHeroController {
    private View.SuperHeroRunner frontEnd;
    private SuperHeroServiceImpl service ;

    public SuperHeroController(View.SuperHeroRunner frontEnd, SuperHeroServiceImpl service) {
        super();
        this.frontEnd = frontEnd;
        this.service = service;

        frontEnd.run(this);
    }

    public SuperHero getSuperHeroById(int id) {return service.getSuperHeroById(id);}
    public SuperTeam getSuperTeamById(int id) {return service.getSuperTeamById(id);}
    public List<SuperHero> getAllSuperHeroes () {return service.getAllSuperHeroes(); }
    public List<SuperTeam> getAllSuperTeams(){return service.getAllSuperTeams();}


    /*
    public SuperHero addSuperHero(AddSuperHeroDto hero) {
        return service.addSuperHero(hero);
    }

    public List<SuperHero> listSuperHero() {
        return service.findAllSuperHero();
    }

    public List<SuperHero> listSuperHero(String teamName) {
        return service.findAllSuperHerosByTeamName(teamName);
    }


    public List<String> getSuperTeam() {
        List<SuperTeam> SuperTeam = service.getSuperTeams();
        List<String> SuperTeamNames = new ArrayList<>();
        for(SuperTeam p: SuperTeam) {
            SuperTeamNames.add(p.getTeamName());
        }
        Collections.sort(SuperTeamNames);
        return  SuperTeamNames;
    }
*/
}

