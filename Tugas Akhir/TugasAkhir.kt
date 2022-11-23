fun arimatika(){

  print("Masukan bilangan pertama :")
  val a = readLine()!!.toInt()
  
  print("Masukan bilangan pertama :")
  val b = readLine()!!.toInt()
  
  print("List Operator ( +, -, * or / ):")
  val operator = readLine()
 
    when (operator) {
        "+" -> println("$a + $b = ${a + b}")
        "-" -> println("$a - $b = ${a - b}")
        "*" -> println("$a * $b = ${a * b}")
        "/" -> println("$a / $b = ${a / b}")
        else -> println("Operator ( $operator ) Tidak Ada Di List")
    }
}

fun biodata(){
  println("========INPUT========")
  
  print("Siapa Nama Kamu : ")
  val nama = readLine()
  
  print("Berapa Usia Kamu : ")
  val umur = readLine()
  
  print("Apa Pekerjaan Kamu : ")
  val job = readLine()

  println("========OUTPUT========")
  val biografi = """
  Nama Saya : $nama
  Usia Saya : $umur
  Pekerjaan Saya : $job
  """.trimIndent()
  print(biografi)
}


fun pencarian() 
  {          
  val produk = arrayOf("Beras Lahap 10kg", "Sarden Jumbo", "1 dus Mie Sakura", "1 Tabak Telor", "Gula 1kg", "Minyak Goreng Bimoli 1 ltr", "Teh Sari Murni", "Kopi Kapal Api", "Bawang Merah 1kg", "Bawang Putih 1kg") 
  println("=========Data yang ada didalam array=======")
  for (i in 0..produk.size-1) {  
    println(" "+produk[i])   
  }
  
  print("Masukkan produk Brand Sembako : ")
  val value = readLine()
  
  var ada = false
    for (i in produk) {
      if (i == value) {
          ada = true
          break
      } 
    } 
    println("maka data dari $value ditemukan $ada") 
  }


fun programNilai(){
      println("========INPUT========")
    print("Nilai IPS : ")
    val ips = Integer.valueOf(readLine())
    
    print("Nilai Matematika : ")
    val mtk = readLine()!!.toInt()
    
    print("Nilai Agama : ")
    val agama = Integer.valueOf(readLine())

    println("========OUTPUT========")
    val total = ips+mtk+agama
    
    print("Total Nilai : $total")
}


fun main() {
  println("=======================================================");
  println("|                 Pilihan Instruksi                   |");
  println("=======================================================");
  println("[1] Aritmatika                                         ");        
  println("[2] Input Biodata                                      ");
  println("[3] Pencarian data barang                              ");
  println("[4] Program Nilai                                      ");
  println("=======================================================");
  
  print("Masukan Pilihan Menu :")
  val hari = readLine()
  
  val pilih = when (hari){
      "1" -> {
        arimatika()
      }
      "2" -> {biodata()
      }
      "3" -> {pencarian()
      }
      "4" -> {programNilai()
      }
      else -> "Tidak valid"
  }
}