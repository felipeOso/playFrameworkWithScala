package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class pruebaActionsController @Inject()(cc: ControllerComponents) extends AbstractController(cc){
  def pruebaActionRequest = Action{
    implicit request => Ok("Got Request con Implicit ["+request +"]")
  }
}
