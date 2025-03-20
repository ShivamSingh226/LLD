package lldCricbuzz.ScoreUpdater;

import lldCricbuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {
	public void update(BallDetails ballDetails);
}
