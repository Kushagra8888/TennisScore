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
    for (c <- input) println(c)
  }
}