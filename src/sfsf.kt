import java.util.*

class student{
    var name : String = ""
    var surname : String = ""
    var patronymic : String = ""
    var awards : MutableList<String> = mutableListOf()
    var birth: Date = Date()
    var history : String = ""

}
class group{
    var student : MutableList<student> = mutableListOf()
    var denomination : String = ""
}
class kvants{
    var cabinet : Int = 0
    var mess : Array<group> = arrayOf()
    var kvant : String = ""
}
class kvantorium{
    var community : Array<kvants> = arrayOf()
}


fun main(){

}
