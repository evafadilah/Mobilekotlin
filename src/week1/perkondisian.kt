package week1

fun main(){
    val nilai = 70

    if(nilai > 60){
        println(" lulus")
    }else{
        println("tidak lulus")
    }

    //if didalam if
    if (nilai > 70){
        println('A')
    }else if (nilai > 60){
        println('B')
    }else{
        println('C')
    }

    //WHEN EXPRESION
    val number = 5
    val hasil = when (number){
        1 -> "satu"
        2 -> "dua"
        3 -> "tiga"
        else -> "tidak valid"
    }
    println(hasil)
}
