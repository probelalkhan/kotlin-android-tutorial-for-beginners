 class Downloader {

     var downloadListener: DownloadListener? = null

     fun downloadFile(file: String){
         downloadListener?.onDownloadStarted()
         for(i in 1..10){
             Thread.sleep(600)
             downloadListener?.onProgressUpdate(i * 10)
         }
         downloadListener?.onDownloadCompleted(file)
     }

 }