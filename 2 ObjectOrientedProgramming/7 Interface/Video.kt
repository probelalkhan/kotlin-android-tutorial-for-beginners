class Video(private val name: String) : Downloader, Player {

    override fun download() {
        println("Downloading Video $name")
    }

    override fun play() {
        println("Playing Video $name")
    }
}