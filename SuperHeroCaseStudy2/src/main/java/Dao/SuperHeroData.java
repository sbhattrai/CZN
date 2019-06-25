package Dao;

import dto.SuperHero;
import dto.SuperTeam;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuperHeroData {
    private static SuperTeam JusticeLeague = new SuperTeam("JusticeLeague");
    private static SuperTeam Avengers = new SuperTeam ("Avengers");
    private static SuperTeam TeenTitans = new SuperTeam ( "TeenTitans");

    private static SuperHero SpiderMan = new SuperHero("SpiderMan", "Peter Parker", new ArrayList<String>(List.of("Super Speed","Super Strength", "Flight")), 23, 5.9,145,'m', JusticeLeague);
    private static SuperHero SuperMan = new SuperHero ( "SuperMan", "Clark Kent",new ArrayList<String>(List.of("Super Speed", "Flight", "Super Strength")),30, 6.3, 180,'m', Avengers );
    private static SuperHero Batman = new SuperHero ("Batman", "Bruce Wayne",new ArrayList<String>(List.of("Super Strength", "Physical Strength", "Super Speed")), 48,6.1, 150,'m', TeenTitans);

    public static Map <SuperTeam, List<SuperHero>> getProdData(){
        Map<SuperTeam, List<SuperHero>> proData = new HashMap<>();
        proData.put(JusticeLeague,new ArrayList<SuperHero>());
        proData.put(Avengers,new ArrayList<SuperHero>());
        proData.put(TeenTitans,new ArrayList<SuperHero>());

        proData.get(JusticeLeague).add(SpiderMan);
        proData.get(Avengers).add(SuperMan);
        proData.get(TeenTitans).add(Batman);

        return proData;

    }


}
