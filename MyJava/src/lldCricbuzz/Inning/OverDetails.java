package lldCricbuzz.Inning;

import java.util.ArrayList;
import java.util.List;

import lldCricbuzz.Team.Team;
import lldCricbuzz.Team.Player.PlayerDetails;

public class OverDetails {
	int overNumber;
	List<BallDetails> balls;
	int extraBallsCount;
	PlayerDetails bowledBy;
	public OverDetails(int overNumber, PlayerDetails bowledBy) {
		balls=new ArrayList<>();
		this.overNumber = overNumber;
		this.bowledBy = bowledBy;
	}
	public boolean startOver(Team battingTeam, Team bowlingTeam,int runsToWin) throws Exception{
		int ballCount=1;
		while(ballCount<=6) {
			BallDetails ball =new BallDetails(ballCount);
			ball.startBallDelivery(battingTeam, battingTeam, this);
			if(ball.ballType==BallType.NORMAL) {
				balls.add(ball);
				ballCount++;
				if(ball.wicket!=null) {
					battingTeam.chooseNextBatsman();
				}
				if(runsToWin!=-1 && battingTeam.getTotalRuns()>bowlingTeam.getTotalRuns()) {
					battingTeam.isWinner=true;
					return true;
				}
			}else {
				extraBallsCount++;
			}
		}
		return false;
	}
	
}
