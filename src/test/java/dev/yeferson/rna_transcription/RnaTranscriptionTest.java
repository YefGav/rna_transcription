package dev.yeferson.rna_transcription;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RnaTranscriptionTest {
    
    @Test

    public void testRnaClassExists() {

        RnaTranscription transcription = new RnaTranscription();
        assertNotNull(transcription);
        
    }

    @Test

    public void testConstructorAndGetterForDna () {

        String dna = "GCTA";
        RnaTranscription transcription = new RnaTranscription(dna);
       assertThat(transcription.getDna(), equalTo(dna));
        
    }

    @Test

    public void testSetDna () {

        RnaTranscription transcription = new RnaTranscription();
        transcription.setDna("GCTA");
        assertThat(transcription.getDna(), equalTo("GCTA"));
    }

    @Test
    public void testTranscriptionForG() {
        // Given
        String dna = "G";
        RnaTranscription transcription = new RnaTranscription(dna);
        // When
        transcription.transcribe();
        // Then
        assertThat(transcription.getRna(), equalTo("C"));
    }

    @Test
    public void testTranscriptionForC() {
        // Given
        String dna = "C";
        RnaTranscription transcription = new RnaTranscription(dna);
        // When
        transcription.transcribe();
        // Then
        assertThat(transcription.getRna(), equalTo("G"));
    }

    @Test
    public void testTranscriptionForT() {
        // Given
        String dna = "T";
        RnaTranscription transcription = new RnaTranscription(dna);
        transcription.transcribe();
        // Then
        assertThat(transcription.getRna(), equalTo("A"));
    }
}
