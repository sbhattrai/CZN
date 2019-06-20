package dao;

import java.util.List;
import java.util.Map;
import java.util.Set;


import dto.SuperHero;
import dto.SuperTeam;

public interface SuperHeroDao {
    public Map<SuperTeam, List<SuperHero>> getAllSuperHero();

    public Set<SuperTeam> getAllSuperTeam();

    public List<SuperHero> getSuperHeroBySuperTeam(SuperTeam superTeam);

    public SuperTeam getSuperTeamByName(String name);

    public void addNewSuperHero(SuperHero p );







}

