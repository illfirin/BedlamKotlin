package team.kramer.bedlam

import org.parse.ParseQuery

class ParseStorageImpl : ParseStorage {
     override fun getItemAsync(id : String): Item {
        val query = ParseQuery.getQuery(Item::class.kt)
        query.whereEqualTo("id", id)
        query.findInBackground { objects, e ->
            if(e == null) {
                for(item in objects {

                    Log.d("DEBUG", item.id)
                    return item
                })
            } else {
                Log.d("Error: " + e!!.message)
            }
        }
    }
    override fun refreshItemAsync(item: Item?){
        val outObject = item
        outObject.saveInBackground()
    }
    override fun saveItemAsync(item: Item?){
        item.saveInBackground()
    }
    override fun deleteItemAsync(item: Item)
    {
        item.deleteInBackground()
    }
}