package blue.starry.saya.endpoints

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import java.io.File

fun Route.getIndex() {
    get {
        call.respondFile(File("docs"), "index.html")
    }
}
