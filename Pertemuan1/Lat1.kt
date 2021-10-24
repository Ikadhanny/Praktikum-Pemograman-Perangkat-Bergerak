fun main(args: Array<String>) {
  
  //Variable static - tidak bisa diubah
  val variable = "Ini String"
  val valInt = 123

  //Variable dinamis - bisa diubah
  var varString = "Iki String"
  var varInt = 456

  //Tipe Data
  //secara manual
  var varMString : String = "sebuah teks"

  //tipe data referensi
  //var kelas : kelas

  var penggabunganStr = "Angka ${1 + 5}"
  println(penggabunganStr)

  var gabungStr = "Angka $varInt"
  println(gabungStr) 
 

  varString = "Ubah"

  println(varString)
  print("Hello world!")
  println("Hello world!")
}