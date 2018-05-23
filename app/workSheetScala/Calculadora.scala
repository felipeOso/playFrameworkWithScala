package workSheetScala

object Calculadora extends CalculadoraTrait {

  override def sumar(a: Int, b: Int): Int = {
    a + b;
  }

  override def restar(a: Int, b: Int): Int = {
    a - b;
  }

  println("la suma es " + Calculadora.sumar(4, 7))
  println("la resta es " + Calculadora.restar(5, 2))
}
