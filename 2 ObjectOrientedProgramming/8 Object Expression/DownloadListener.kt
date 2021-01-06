 interface DownloadListener {
     fun onDownloadStarted()
     fun onDownloadCompleted(file: String)
     fun onProgressUpdate(progress: Int)
 }