package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Darko Mikhailovich (mailto:sergey51979@mail.ru)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
	/**
	* Test echo.
	*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName(){
		String input = "Darko Mikhailovich";
		String expect = "Echo, echo, echo : Darko Mikhailovich"; 
		Calculate calc = new Calculate();
		String result = calc.echo(input);
		assertThat(result, is(expect));
	}
 
}