fun main() {
    val downloader = Downloader()
    downloader.downloadListener = object : DownloadListener {
        override fun onDownloadStarted() {
            println("Download Started...")
        }

        override fun onDownloadCompleted(file: String) {
            println("$file Downloaded.")
        }

        override fun onProgressUpdate(progress: Int) {
            println("$progress% Downloaded")
        }
    }
    downloader.downloadFile("FileA.mkv")
}

