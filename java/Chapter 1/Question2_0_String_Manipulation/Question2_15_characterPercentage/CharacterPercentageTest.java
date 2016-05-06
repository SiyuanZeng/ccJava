package Question2_0_String_Manipulation.Question2_15_characterPercentage;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class CharacterPercentageTest {

    @Test
    public void testCharacterPercentage() throws Exception {
        assertEquals("In 'Tiger Runs @ The Speed Of 100 km/hour.' : Uppercase letters are 13.16% Lowercase letters are 52.63%Digits Are 7.89%Other Characters Are 26.32%-----------------------------",
                CharacterPercentage.characterPercentage("Tiger Runs @ The Speed Of 100 km/hour."));
        assertEquals("In 'My e-mail : eMail_Address321@anymail.com' : Uppercase letters are 7.5% Lowercase letters are 65%Digits Are 7.5%Other Characters Are 20%-----------------------------",
                CharacterPercentage.characterPercentage("My e-mail : eMail_Address321@anymail.com"));
        assertEquals("In 'AUS : 123/3, 21.2 Overs' : Uppercase letters are 17.39% Lowercase letters are 17.39%Digits Are 30.43%Other Characters Are 34.78%-----------------------------",
                CharacterPercentage.characterPercentage("AUS : 123/3, 21.2 Overs"));
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCharacterPercentageWithEmptyString() throws Exception {
        CharacterPercentage.characterPercentage("");
        CharacterPercentage.characterPercentage("");
        CharacterPercentage.characterPercentage("");
    }


    @Test(expected = IllegalArgumentException.class)
    public void testCharacterPercentageWithNull() throws Exception {
        CharacterPercentage.characterPercentage(null);
        CharacterPercentage.characterPercentage(null);
        CharacterPercentage.characterPercentage(null);
    }
}