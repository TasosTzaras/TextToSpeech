package commands;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class EditDocumentTest {
	
	private EditDocument test = new EditDocument();
	
	@Test
	void FileNotFoundError() {
		assertEquals(0, test.file("testFileForEdit.txt"));
		assertEquals(1, test.file("fileNotExists.txt"));
	}
}
