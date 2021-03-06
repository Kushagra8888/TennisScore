/**
 * Created by test on 7/28/2015.
 */

class TennisSet() {
  var player1score: Int = 0
  var player2score: Int = 0
  var isMatchOngoing: Boolean = false
  var winner: Char
  //var isSetFinished: Boolean = false
  var game : TennisGame

  def update( scoredBy: Char) = {
    if (!isMatchOngoing) {
      isMatchOngoing = true
      val game = new TennisGame()
      game.update(scoredBy)
    }
    else{
      game.update(scoredBy)
      if (game.gameDone()) {
        isMatchOngoing = false
        var winner = game.getWinner()
        if (winner == 'D') {
          player1score += 1
        }
        else {
          player2score += 1
        }
      }
    }
  }

  def getWinner(): Char = {
    if (isSetOver()) {
      if (player1score > player2score) {
        return 'D'
      }
      else {
        return 'F'
      }
    }
  }

  def isSetOver(): Boolean = {
    var higherScore = Math.max(player1score, player2score)
    var lowerScore = Math.min(player1score, player2score)
    if (higherScore >= 6 && higherScore - lowerScore >= 2) {
      return true
    }
    else{
      return false;
    }
  }

  def printScore(): String = {
    return "Player 1: " + player1score + "\n" + "Player 2: " + player2score
  }

  def getPlayer1Score(): Int = {
    return player1score
  }

  def getPlayer2Score(): Int = {
    return player2score
  }

}
