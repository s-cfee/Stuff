package Q1_2013;
import java.util.ArrayList;
import java.util.List;

public class MusicDownloads {
	/** The list of downloaded information.
	 *  Guaranteed not to be null and not to contain duplicate titles.
	 */
	 private List<DownloadInfo> downloadList; 
	 
	 
	 /** Creates the list of downloaded information. */
	 public MusicDownloads() 
	 { 
	   downloadList = new ArrayList<DownloadInfo>(); 
	 } 

	 /** Returns a reference to the DownloadInfo object with the requested title if it exists.
	  * 
	  * @param title the requested title
	  * @return a reference to the DownloadInfo object with the 
	  * 		  requested title if it exists;
	  * 		  null otherwise. 
	  *  Postcondition:
	  *   - No changes were made to downloadList
	  */
	 public DownloadInfo getDownloadInfo(String title) 
	 {
		/* to be implemented in part (a) */
		 return null;
	 } 
	 
	 
	 /** Updates downloadlist with information from titles.
	  * @param titles a list of song titles
	  * Postcondition:
	  *  - there are no duplicate titles in downloadlist
	  *  - no entries were removed from downloadlist.
	  *  - all songs in titles are represented in downloadlist.
	  *  - for each existing entry in downloadlist, the download count is increased by
	  *       the number of times its title appeared in titles.
	  *  - the order of the existing entries in downloadlist is not changed.
	  *  - the first time an object with a title from titles is added to downloadlist, it
	  *    is added to the end of the list.
	  *  - new entries in downloadlist appear in the same order in which they first appear in titles.
	  *  - for each new entry in downloadlist, the download count is equal to
	  *        the number of times its title appeared in titles.
	  */
	 public void updateDownloads(List<String> titles) 
	 {  
		/* to be implemented in part (b) */
	 } 
	 
	 public void printList()
	 {
		for( DownloadInfo each : downloadList )
		{
			each.printInfo();
		}
	 }
	 
	 public List<DownloadInfo> getList()
	 {
	  return downloadList;
	 }

}
