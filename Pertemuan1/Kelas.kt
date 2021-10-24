

class Kelas (nama : String, id : Int, nilai : Double) : Parent {
  
  private var nilaiC : Double

  init{
    nilaiC = nilai * 0.01
  }

  fun Prosedur (nilai : Double){
    //Logika
  }

  fun Fungsi (nilai : Double) : Double{
    return 1
  }

  fun Fungsi2 (nilai : Double) = "Sebuah kata $nilai" //return String
  
  fun Fungsi3 (nilai : Double) = nilai + nilaiC //return Double
  }
}