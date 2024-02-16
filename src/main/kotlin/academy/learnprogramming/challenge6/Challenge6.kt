package academy.learnprogramming.challenge6

import academy.learnprogramming.javacode.Employee

fun main(args: Array<String>) {

  val employee = Employee("Jane", "Smith", 2002)

  // 1. Make this code compile
  employee.lastName = "Jones"
  employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)

  println(employee.lastName)
  println(employee.salaryLast3Years[0])
  println(employee.salaryLast3Years[1])
  println(employee.salaryLast3Years[2])
}