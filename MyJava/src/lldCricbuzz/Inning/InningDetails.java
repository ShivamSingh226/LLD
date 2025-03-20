package lldCricbuzz.Inning;

import java.util.ArrayList;
import java.util.List;

import lldCricbuzz.MatchType;
import lldCricbuzz.Team.Team;
import lldCricbuzz.Team.Player.PlayerDetails;

public class InningDetails {
	Team battingTeam;
	Team bowlingTeam;
	MatchType matchType;
	List<OverDetails> overs;
	public InningDetails(Team battingTeam, Team bowlingTeam, MatchType matchType) {
		
		this.battingTeam = battingTeam;
		this.bowlingTeam = bowlingTeam;
		this.matchType = matchType;
		overs=new ArrayList<>();
	}
	public void start(int runsToWin) {
		try {
			battingTeam.chooseNextBatsman();
		}catch(Exception e) {
			
		}
		int noOfOvers=matchType.noOfOvers();
		for(int overNumber=1;overNumber<=noOfOvers;noOfOvers++) {
			bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());
			OverDetails overDetails=new OverDetails(overNumber,bowlingTeam.getCurrentBowler());
			overs.add(overDetails);
			try {
				boolean won=overDetails.startOver(battingTeam,bowlingTeam,runsToWin);
				if(won==true) {
					break;
				}
			}catch(Exception e) {
				break;
			}
			PlayerDetails temp=battingTeam.getStriker();
			battingTeam.setNonStriker(temp);
			battingTeam.setStriker(battingTeam.getNonStriker());
		}
	}
	public int getTotalRuns(){
	   return battingTeam.getTotalRuns();
	}

	
}
