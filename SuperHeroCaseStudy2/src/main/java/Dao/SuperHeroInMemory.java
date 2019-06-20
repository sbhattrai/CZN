package Dao;

import controller.SuperHeroController;
import dto.SuperHero;
import dto.SuperTeam;

import java.util.*;

public class SuperHeroInMemory  implements dao.SuperHeroDao {

    private Map<SuperTeam, List<SuperHero>> SuperHero;


    public SuperHeroInMemory(Map<SuperTeam, List<SuperHero>> SuperHero) {
        super();
        this.SuperHero = SuperHero;



    }

    @Override
    public Map<SuperTeam, List<SuperHero>> getAllSuperHero() {

        return new HashMap<SuperTeam, List<SuperHero>>(SuperHero);


    }

    public Set<SuperTeam> getAllSuperTeam() { return SuperHero.keySet();}

    @Override
    public List<SuperHero> getSuperHeroBySuperTeam(SuperTeam Superteam) {
        return SuperHero.get(Superteam);
    }

    public SuperTeam getSuperTeamByName(String name) {
        Set<SuperTeam> teams = SuperHero.keySet();
        return teams.stream()
                 .filter(b -> b.getTeamName().equals(name))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addNewSuperHero(SuperHero s){
        if(SuperHero.keySet().contains(s.getTeam())){
            SuperHero.get(s.getTeam()) .add(s);
        }
        else {
            SuperHero.put(s.getTeam(), new ArrayList<SuperHero>());
            SuperHero.get(s.getTeam()).add(s);
        }
    }


}
