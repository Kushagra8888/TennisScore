
object TennisGame {
	val scores = List("0", "15", "30", "40", "A", "W")
	var p1Index = 4
	var p2Index = 6
  /** Nested methods can use and even update everything 
   *  visible in their scope (including local variables or 
   *  arguments of enclosing methods). 
   */
  def update(pointWinner: Char) {
	if (pointWinner == 'D') {
			println("D")
            p1Index += 1;
        } else {
			println("F")
            p2Index += 1;
        }
		gameDone()
		/*
        if (gameDone()) {
            if (p1Index > p2Index) {
                    System.out.println("D wins the game");
                    return true;
            } else {
                    System.out.println("F wins the game");
                    return true;
            }
        } else if (p1Index == 4 && p2Index == 4) {
            
            p1Index = 3;
            p2Index = 3;
            System.out.println(scores[p1Index] + " : " + scores[p2Index]);
            return false;
            
        } else {
            System.out.println(scores[p1Index] + " : " + scores[p2Index]);
            return false;
        }
	*/
	def gameDone() {
        var gtThanForty = p1Index > 3 || p2Index > 3;
        var diffGtThanOne = Math.abs(p1Index - p2Index) >= 2;
		
        println(gtThanForty && diffGtThanOne)
    }
  }
	/*
  def println(ar: Array[Int]) {
    def print1 = {
      def iter(i: Int): String =
        ar(i) + (if (i < ar.length-1) "," + iter(i+1) else "")
      if (ar.length == 0) "" else iter(0)
    }
    Console.println("[" + print1 + "]")
  }
*/
  def main(args: Array[String]) {
    //val ar = Array(6, 2, 8, 5, 1)
    //println(ar)
    update('D')
    //println(ar)
  }

}