package week1

fun main() {
    //Ubahlah Tipe Data String Menjadi Integer / Double Sesuai Yang Di Butuhkan =)
    println("Masukkan nilai Tugas:")
    val tugas = readln().toInt()

    println("Masukkan nilai UAS:")
    val uts  = readln().toInt()

    println("Masukkan nilai UAS:")
    val uas  = readln().toInt()

    //Pastikan Nilai Tipe Datanya Sama => Jika Menggunakan Int maka semuanya Harus Int
    val rataRata =(tugas+uts+uas)/3

    val (grade, status)  = when (rataRata){
        in 75..100 -> "A" to "Selamat Anda Lulus"
        in 65..74 -> "B" to "Selamat Anda Lulus"
        in 55..64 -> "C" to "Selamat Anda Lulus"
        in 45..54 -> "D" to "Mohon Maaf Anda Tidak lulus"
        else -> "E" to "Mohon Maaf Anda Tidak lulus"
    }
    println("$status!! Dengan Mendapatkan Nilai Sebesar $rataRata dan Grade $grade")
}