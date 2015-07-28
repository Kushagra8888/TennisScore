/**
 * Created by test on 7/28/2015.
 */

class TennisMatch() {
	var player1score: Int = 0
	var player2score: Int = 0
	var isMatchOngoing: Boolean = false
	var set: TennisSet

	def update(scoredBy: Char) = {
		if (!isMatchOngoing) {
			isMatchOngoing = true
			val set = new TennisSet()
			set.update(scoredBy)
		}
		else
		{
			set.update(scoredBy)
			if ( set.isSetOver() ) {
				isMatchOngoing = false
				var winner = set.getWinner()
				if (winner == 'D') {
					player1score += 1
				}
				else {
					player2score += 1
				}
			}
		}
	}
	def isMatchOver() 
	{
		if (Math.abs(player1score - player2Score) == 2) {
		  return true
		}
		else {
		  return false;
		}
	}
	def getWinner() : Char = {
		if ( isMatchOver() ) 
		{
			if (player1score > player2score) {
				'D'
			} else {
				'F'
			}
		}
		else {
			''
		}
	}
}
