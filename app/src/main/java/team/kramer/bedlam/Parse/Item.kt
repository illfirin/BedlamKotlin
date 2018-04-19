package team.kramer.bedlam
//parse import
import com.parse.ParseObject
//data class that autogenerate getters, setters and some another methods
@ParseClassName("Item")
class Item: ParseObject()
{
    var id : Int?
        get() = getInt("id")
        set(value){
            put("id", value)
        }
    var Name : String?
        get() = getString("Name")
        set(value){
            put("id", value)
        }
   var Author: String?
        get() = getString("Author")
        set(value){
            put("Author", value)
        }   
    var rating: Int?
        get() = getInt("rating")
        set(value){
            put("rating", value)
        }     
}