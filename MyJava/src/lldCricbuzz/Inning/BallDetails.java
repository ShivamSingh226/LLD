package lldCricbuzz.Inning;

import java.util.ArrayList;
import java.util.List;

import lldCricbuzz.ScoreUpdater.BattingScoreUpdater;
import lldCricbuzz.ScoreUpdater.BowlingScoreUpdater;
import lldCricbuzz.ScoreUpdater.ScoreUpdaterObserver;
import lldCricbuzz.Team.Team;
import lldCricbuzz.Team.Wicket;
import lldCricbuzz.Team.WicketType;
import lldCricbuzz.Team.Player.PlayerDetails;

public class BallDetails {
	public int ballNumber;
	public BallType ballType;
	public RunType runType;
	public PlayerDetails playedBy;
	public PlayerDetails bowledBy;
	public Wicket wicket;
	List<ScoreUpdaterObserver> scoreUpdaterObserverList = new ArrayList<>();
	public BallDetails(int ballNumber) {
		this.ballNumber=ballNumber;
		scoreUpdaterObserverList.add(new BowlingScoreUpdater());
		scoreUpdaterObserverList.add(new BattingScoreUpdater());
	}
	public void startBallDelivery(Team battingTeam, Team bowlingTeam, OverDetails overDetails) {
		playedBy=battingTeam.getStriker();
		this.bowledBy=bowlingTeam.getCurrentBowler();
		ballType=BallType.NORMAL;
		if(isWicketTaken()) {
			runType=RunType.ZERO;
			wicket=new Wicket(WicketType.BOWLED,bowlingTeam.getCurrentBowler(),overDetails,this);
			battingTeam.setStriker(null);
		}else {
			runType=getRunType();
			if(runType==RunType.ONE || runType==RunType.THREE) {
				PlayerDetails temp=battingTeam.getStriker();
				battingTeam.setStriker(battingTeam.getNonStriker());
				battingTeam.setNonStriker(temp);
			}
		}
		notifyUpdaters(this);
	}
	
	private void notifyUpdaters(BallDetails ballDetails){

        for(ScoreUpdaterObserver observer : scoreUpdaterObserverList) {
            observer.update(ballDetails);
        }
    }

	private RunType getRunType() {

        double val = Math.random();
        if (val <= 0.2) {
            return RunType.ONE;
        } else if (val >= 0.3 && val <= 0.5) {
            return RunType.TWO;
        } else if (val >= 0.6 && val <= 0.8) {
            return RunType.FOUR;
        } else {
            return RunType.SIX;
        }
    }

	 private boolean isWicketTaken() {
	        //random function return value between 0 and 1
	        if (Math.random() < 0.2) {
	            return true;
	        } else {
	            return false;
	        }
	    }

}
