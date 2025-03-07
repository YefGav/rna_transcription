package dev.yeferson.rna_transcription;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {
    
    @Test

    public void testRnaClassExists() {

        RnaTranscription transcription = new RnaTranscription();
        assertNotNull(transcription);
        
    }
}
