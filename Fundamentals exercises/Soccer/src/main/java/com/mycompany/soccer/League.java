/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src.main.java.com.mycompany.soccer;

/**
 *
 * @author eogieglo
 */
public class League {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.playerName="George Eliot";

        Player player2 = new Player();
        player2.playerName="Graham Greene";

        Player player3 = new Player();
        player3.playerName="Geoffrey Chaucer";

        Player [] thePlayers = {player1,player2,player3};

        Team team1 = new Team();
        team1.teamName = "The Greens";
        team1.playerArray = thePlayers;

        //Output
        for (Player thePlayer: team1.playerArray){
            System.out.println(thePlayer.playerName);
        }

    }
}
