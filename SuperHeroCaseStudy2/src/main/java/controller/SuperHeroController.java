package controller;

import dto.SuperHero;
import dto.SuperTeam;
import dto.AddSuperHeroDto;
import Service.SuperHeroService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SuperHeroController {
    private View.SuperHeroRunner frontEnd;
    private SuperHeroService service ;

    public SuperHeroController(View.SuperHeroRunner frontEnd, SuperHeroService service) {
        super();
        this.frontEnd = frontEnd;
        this.service = service;
        frontEnd.run(this);
    }
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

}

