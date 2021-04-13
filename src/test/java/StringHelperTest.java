import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import java.io.FileNotFoundException;

import java.net.URL;
import java.util.List;

import org.extedo.helper.StringHelper;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;

@RunWith(JUnit4ClassRunner.class)
public class StringHelperTest {

	@Test
	public void shouldReturnStringList() {

		try {

			URL resource = getClass().getResource("sample.txt");
			
			StringHelper strHelper = new StringHelper(resource.getPath());
			List<String> allStrings = strHelper.getAllStrings();

			assertNotNull(allStrings);
			assertEquals(allStrings.size(), 7);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void shoudlReturnAllComments() {
	}

	public void shouldReturnTotalStringCounts() {

	}

	public void shouldReturnTotalCommentCoutnts() {

	}

}
