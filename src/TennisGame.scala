
object TennisGame {
	val scores = List("0", "15", "30", "40", "A", "W")
	var p1Index = 0
	var p2Index = 0
  
	def update(pointWinner: Char) {
		if (pointWinner == 'D') {
			println("D")
			p1Index += 1
		} else {
			println("F")
			p2Index += 1
		}
			
			
		if (gameDone()) {
			if (p1Index > p2Index) {
					println("D wins the game")
			} else {
					println("F wins the game")
			}
		} else if (p1Index == 4 && p2Index == 4) {
			
			p1Index = 3
			p2Index = 3
			println(scores(p1Index) + " : " + scores(p2Index))
			
		} else {
			println(scores(p1Index) + " : " + scores(p2Index))
		}
	}
	
	def gameDone() : Boolean = {
        var gtThanForty = p1Index > 3 || p2Index > 3
        var diffGtThanOne = Math.abs(p1Index - p2Index) >= 2
		
        gtThanForty && diffGtThanOne
    }
	def main(args: Array[String]) {
		var input : String = readLine("Enter input> ")
		input = input.map(_.toUpper)  
		println(input)
		parseInput(input);
	}
	def parseInput(input : String) : Unit = {
		for (c <- input) update(c);
	}
}