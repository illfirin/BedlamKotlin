import android.app.Application
//import parse
class BedlamApp: Application(){
    override fun onCreate(){
        super.onCreate()
        //maybe class.kt??
        ParseObject.registerSubclass(Item::class.java)

        Parse.initialize(Parse.Configuration.Builder(this)
                .applicationId("")
                .clientKey("")
                .server("")
                .build()
    }
}