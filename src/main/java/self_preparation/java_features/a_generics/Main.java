package self_preparation.java_features.a_generics;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beck = new SoccerPlayer("Beck");

        Team<FootballPlayer> adeliedCrows = new Team<>("Adelied Crows");
        adeliedCrows.addPlayer(joe);
//        adeliedCrows.addPlayer(pat);
//        adeliedCrows.addPlayer(beck);

        System.out.println(adeliedCrows.numPlayer());
    }
}
