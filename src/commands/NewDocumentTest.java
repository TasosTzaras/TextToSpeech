package commands;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class NewDocumentTest {

private NewDocument test = new NewDocument();
	
	@Test
	void FileNotFoundError() {
		assertEquals(0, test.file("fileNotExists.txt"));
		assertEquals(1, test.file("testFileForCreate.txt"));
	}
	
}
