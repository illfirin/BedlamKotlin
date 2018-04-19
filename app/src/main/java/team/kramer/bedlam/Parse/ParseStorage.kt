package team.kramer.bedlam
import java.util.*
import java.util.List
import android.os.AsyncTask

abstract interface ParseStorage{
    fun getItemAsync(id:String) : Item
    fun refreshItemAsync(item: Item)
    fun saveItemAsync(item : Item)
    fun deleteItemAsync(item: Item)  
}