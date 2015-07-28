package tennis
/**
 * @author test
 */
object Scoreboard {
    def main(args: Array[String]) {
    println("Tennis ScoreBoard")
    var input : String = readLine("Enter input> ")
    input = input.map(_.toUpper)  
    println(input)
   parseInput(input); 
  }
    def parseInput(input : String) : Unit = {
       val tennisGame: TennisGame = new TennisGame()
    for (c <- input) tennisGame.update(c);
    }
}