package Q1_2013;
import java.util.ArrayList;
import java.util.List;

public class DownloadInfo {

	private String title;
	private int downloaded;

	/** Creates a new instance with the given unique title and sets
	 *  the number of times downloaded to 1;
	 *  @param title the unique title of the downloaded song.
	 */
	public DownloadInfo(String title) 
	{
		this.title = title;
		downloaded = 1;
	} 


	/** @return the title */
	public String getTitle() 
	{
		return title;
	} 

	/** Increment the number of times downloaded by 1 */
	public void incrementTimesDownloaded() 
	{
		downloaded++;
	} 

	public void printInfo()
	{
		System.out.println( getTitle() + " : " + downloaded);
	}

	public String getInfo()
	{
		return getTitle() + " : " + downloaded;
	}

	public int getDownloaded() {
		return downloaded;
	}
}
