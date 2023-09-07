package recfun
import common._

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /** Exercise 1
    */

  def pascal(c: Int, r: Int): Int = (c, r) match {
    case (c, r) if c < 0 || r < 0 => throw new NumberFormatException()
    case (0, _)                   => 1
    case (_, 0)                   => 1
    case (c, r) if c == r         => 1
    case (c, r)                   => pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /** Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def nextCount(char: Char, count: Int): Int = char match {
      case '(' => count + 1
      case ')' => count - 1
      case _   => count
    }

    @tailrec
    def isBalance(chars: List[Char], count: Int, flag: Boolean): Boolean =
      (chars, count) match {
        case (Nil, _)                                        => flag
        case (head :: _, count) if head == ')' && count <= 0 => false
        case (head :: tail, count) =>
          isBalance(
            tail,
            nextCount(head, count),
            nextCount(head, count) == 0
          )
      }

    isBalance(chars, 0, flag = false)
  }

  /** Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int =
    (money, coins) match {
      case (0, _) => 1
      case (money, head :: tail) if money > 0 =>
        countChange(money - head, coins) + countChange(money, tail)
      case _ => 0
    }
}
