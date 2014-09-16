package io.github.lbn.scalatramaventemplate

import org.scalatra._
import javax.servlet.ServletContext
import io.github.lbn.scalatramaventemplate.servlets._

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new ExampleServlet, "/*")
  }
}