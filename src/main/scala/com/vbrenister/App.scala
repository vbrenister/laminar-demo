package com.vbrenister

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

object App {
  def main(args: Array[String]): Unit = {
    lazy val appContainer = dom.document.getElementById("app")

    val app = {
      div(
        h1("Hello, world!"),
        p("This is a paragraph.")
      )
    }

    renderOnDomContentLoaded(appContainer, app)

  }
}
