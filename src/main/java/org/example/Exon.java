package org.example;

public class Exon {
    private String exon;
    private int start;
    private int end;

    public void setExon(String exon) {
        this.exon = exon;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    public String getExon() {
        return exon;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

}
