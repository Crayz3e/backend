import scala.io.StdIn.readLine

object Calculator extends App {
  var state = States.ZeroState
  var sum = 0
  var num = 0
  var prev = "+"
  var dec = 1

  while (true) {
    val action = readLine()

    if (action == "=") {
      state = States.ComputedState
    } else if (action != "+" && action != "-" && action != "*" && action != "/" && action != "=" && (action < "0" || action > "9")) {
      state = States.ErrorState
    }

    if (state == States.ZeroState) {
      if (action > "0" && action <= "9") {
        state = States.AccumulatorState
      } else {
        state = States.ErrorState
      }
    }

    if (state == States.AccumulatorState) {
      if (action >= "0" && action <= "9") {
        num = num * dec + action.toInt
        dec = 10
      } else {
        dec = 1
        state = States.ComputedState
      }
    }

    if (state == States.ComputedState) {
      if (prev == "+") {
        sum += num
      } else if (prev == "-") {
        sum -= num
      } else if (prev == "*") {
        sum *= num
      } else if (prev == "/") {
        sum /= num
      }

      num = 0
      if (action == "=") {
        println(sum)
        prev = ""
      } else {
        prev = action
        state = States.AccumulatorState
      }
    }

    if (state == States.ErrorState) {
      num = 0
      if (action == "+" || action == "-" || action == "*" || action == "/") {
        println("Enter a number.")
      } else {
        println("Incorrect.")
      }

      state = States.AccumulatorState
    }
  }
}