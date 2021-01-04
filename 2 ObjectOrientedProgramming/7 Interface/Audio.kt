class Audio(private val name: String) :  Downloader, Player {

    override fun download() {
        println("Downloading Audio $name")
    }

    override fun play() {
        println("Playing Audio $name")
    }

}