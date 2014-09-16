package io.github.lbn.scalatramaventemplate.servlets

import org.scalatra._
import io.github.lbn.scalatramaventemplate.entities._

class ExampleServlet extends ScalatraServlet {
  var age : Int = 7
  var people : List[Person] = List()
  var person : Person = null
  get("/hello/:name/:uage") {
    person = new Person(params("name"),params("uage").toInt)
    <html>
      <body>
        <h1>{ person.intro() }</h1>
      </body>
    </html>
  }
}
