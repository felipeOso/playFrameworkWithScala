package controllers

import javax.inject.{Inject, Singleton}
import play.api.Logger
import play.api.mvc.{AbstractController, ControllerComponents}

@Singleton
class HolaMundoController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def holaMundo = Action {
    Logger.debug("Prueba de Logger en controlador HolaMundo funcion holaMundo")
    Ok(views.html.holaMundo())
  }

  def holaConParam(name:String) = Action {
    Logger.debug("Prueba de Logger en controlador HolaMundo funcion holaConParam")
    Ok(views.html.holaParam(name))
  }
  def otroHola(n:String)= Action{
    Logger.debug("Prueba de Logger en controlador HolaMundo funcion otroHola")
    Ok(views.html.otroHola(n))
  }
  def redirectOtraPage=Action{
    Redirect("/holaMundo")
  }
}
