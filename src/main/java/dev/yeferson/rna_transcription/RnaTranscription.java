package dev.yeferson.rna_transcription;

public class RnaTranscription {

    private String dna;
    private String rna;

    public RnaTranscription() {
    }

    public RnaTranscription(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public String getRna() {
        return rna;
    }

    public void transcribe() {
        if (dna == null) {
            throw new IllegalArgumentException("DNA sequence cannot be null");
        }
        
        StringBuilder rnaBuilder = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            char nucleotide = dna.charAt(i);
            switch (nucleotide) {
                case 'G':
                    rnaBuilder.append('C');
                    break;
                case 'C':
                    rnaBuilder.append('G');
                    break;
                case 'T':
                    rnaBuilder.append('A');
                    break;
                case 'A':
                    rnaBuilder.append('U');
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported nucleotide: " + nucleotide);
            }
        }
        rna = rnaBuilder.toString();
    }
    
}
