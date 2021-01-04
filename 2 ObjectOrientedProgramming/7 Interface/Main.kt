fun main() {
    val audioDownloader = Audio("Audio1.mp3")
    val videoDownloader = Video("Video1.mkv")

    audioDownloader.download()
    audioDownloader.play()
    audioDownloader.playerInfo()
    audioDownloader.downloaderInfo()

    videoDownloader.download()
    videoDownloader.play()
    videoDownloader.playerInfo()
    videoDownloader.downloaderInfo()
}