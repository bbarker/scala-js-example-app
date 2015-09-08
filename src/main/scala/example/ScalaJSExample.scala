package example

import scala.scalajs.js
import js.Dynamic.{literal => lit}
import js.annotation.JSExport
import org.scalajs.dom

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val paragraph = dom.document.createElement("p")
    paragraph.innerHTML = "<strong>It works!</strong>"
    dom.document.getElementById("playground").appendChild(paragraph)
  }

  /** Computes the square of an integer.
   *  This demonstrates unit testing.
   */
  def square(x: Int): Int = x*x

  val squareJS: js.Function1[Int, Int] = {x: Int => x * x}

  @JSExport
  def getObj(): js.Object = new js.Object{val square = squareJS}
  //def getObj(): js.Object = lit(square = squareJS)
}
