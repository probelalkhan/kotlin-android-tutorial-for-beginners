class FileDownloader(private val file: String) : Downloader {
    override fun download() {
        println("$file Downloaded")
    }
}

class FilePlayer(private val file: String) : Player {
    override fun play() {
        println("$file Playing")
    }
}

class MediaFile(
        private val downloader: Downloader,
        private val player: Player
) : Downloader by downloader, Player by player


fun main() {
    val file: String = "File1.mkv"
    val mediaFile = MediaFile(FileDownloader(file), FilePlayer(file))
    mediaFile.download()
    mediaFile.play()
}
