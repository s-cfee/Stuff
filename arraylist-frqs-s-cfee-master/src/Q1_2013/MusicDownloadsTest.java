package Q1_2013;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MusicDownloadsTest {

	@Test
	void testGetDownloadInfo() {
		MusicDownloads classics = new MusicDownloads();
		ArrayList<String> songs = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			songs.add("Hey Jude");
		}
		for (int i = 0; i < 3; i++) {
			songs.add("Soul Sister");
		}
		for (int i = 0; i < 10; i++) {
			songs.add("Aqualung");		
		}
		classics.updateDownloads(songs);
		assertAll("Testing getDownloadInfo",
				() -> assertEquals(5, classics.getDownloadInfo("Hey Jude").getDownloaded()),
				() -> assertEquals(3, classics.getDownloadInfo("Soul Sister").getDownloaded()),
				() -> assertEquals(10, classics.getDownloadInfo("Aqualung").getDownloaded())
		);
	}

	@Test
	void testUpdateDownloads() {
		MusicDownloads classics = new MusicDownloads();
		ArrayList<String> songs = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			songs.add("Hey Jude");
		}
		for (int i = 0; i < 3; i++) {
			songs.add("Soul Sister");
		}
		for (int i = 0; i < 10; i++) {
			songs.add("Aqualung");		
		}
		// Initialize the state of classics.
		classics.updateDownloads(songs);
		ArrayList<String> songTitles = new ArrayList<String>();
		String[] newTitles = {"Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"};
		for (String title : newTitles) {
			songTitles.add(title);
		}
		// Add the new songs
		classics.updateDownloads(songTitles);
		assertAll("Testing getDownloadInfo",
				() -> assertEquals(5, classics.getDownloadInfo("Hey Jude").getDownloaded()),
				() -> assertEquals(5, classics.getDownloadInfo("Soul Sister").getDownloaded()),
				() -> assertEquals(11, classics.getDownloadInfo("Aqualung").getDownloaded()),
				() -> assertEquals("Lights", classics.getList().get(3).getTitle()),
				() -> assertEquals(2, classics.getList().get(3).getDownloaded()),
				() -> assertEquals("Go Now", classics.getList().get(4).getTitle()),
				() -> assertEquals(1, classics.getList().get(4).getDownloaded())
		);
	}

}
