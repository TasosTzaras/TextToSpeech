package commands;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class OpenDocumentTest {
	
	private OpenDocument test = new OpenDocument();
	
	@Test
	void FileNotFoundError() {
		assertEquals(0, test.file("testFileForOpen.txt"));
		assertEquals(1, test.file("fileNotExists.txt"));
	}
}
