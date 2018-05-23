val f = (s:String) => s + "adios"
f("hola")

val pruebaMessage = (message:String) => message + " Felipe Osorio "
pruebaMessage("Hello")

val miTupla= ("hello", 27, true, "felipe")
println(miTupla._3)
println(miTupla.hashCode())
println(miTupla.copy())
println(miTupla.toString())
println(miTupla.getClass)

println(miTupla._4)

val objetoTupla = miTupla._4
println(objetoTupla)