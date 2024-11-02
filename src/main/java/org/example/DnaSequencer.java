package org.example;

import java.util.ArrayList;
import java.util.List;

public class DnaSequencer {

    private static String gene = " 1 atggccactg gcggccaggt gcagctctca gctggggtgt tcagaggacg cctgtgtcct\n" +
            "61 cccctccccc atccctctgt cacccttgga ggcagagaac tttgcccgtc agtcccatgg\n" +
            "121 ggaatgtcaa caggcagggg cagcactgca gagatttcat catggtctcc caggccctca\n" +
            "181 ggctcctctg ccttctgctt gggcttcagg gctgcctggc tgcaggtgcg tccggggagg\n" +
            "241 ttttctccat aaacttggtg gaagggcagt gggcaaatcc aggagccagc ccgggcttcc\n" +
            "301 caaaccccgc ccttgctccg gacaccccca tccaccagga gggttttctg gcggctcctg\n" +
            "361 aaacacggga catgccgtgg aagccggggc ctcacagagg tgagcaggga ctgccactgg\n" +
            "421 ttttgtcctg gggcccagtg ggggcaacat cacctccttc ccctcccatg gcaaagagcc\n" +
            "481 agcccgcggg gtggctactg cagtgccccc caaggagggt gttccctgct cgagaggaag\n" +
            "541 tgaccgctcc agcttggcct tccctgggac tggggtgcag gcgattttat cttctttgct\n" +
            "601 ccattctgtt ccttccagat aatcgtgtgt tcttcatcag gttttcctca gttcttgaga\n" +
            "661 gcttttctga tgcaaatctg ctttcacccc agggcggtca ccggctctgc tcacaccagc\n" +
            "721 aaatggccac agcccatccc catgcaccag ggggtgaggt ggcaggtggt ggaaagggcc\n" +
            "781 tgaggggggc ttcttccttc caggcgagca cgacctcagc gagcacgacg gggatgagca\n" +
            "841 gagccggcgg gtggcgcagg tcatcatccc cagcacgtac gtcccgggca ccaccaacca\n" +
            "901 cgacatcgcg ctgctccgcc tgcaccagcc cgtggtcctc actgaccatg tggtgcccct\n" +
            "961 ctgcctgccc gaacggacgt tctctgagag gacgctggcc ttcgtgcgct tctcattggt\n" +
            "1021 cagcggctgg ggccagctgc tggaccgtgg cgccacggcc ctggagctca tggtcctcaa\n" +
            "1081 cgtgccccgg ctgatgaccc aggactgcct gcagcagtca cggaaggtgg gagactcccc\n" +
            "1141 aaatatcacg gagtacatgt tctgtgccgg ctactcggat ggcagcaagg actcctgcaa\n" +
            "1201 gggggacagt ggaggcccac atgccaccca ctaccggggc acgtggtacc tgacgggcat\n" +
            "1261 cgtcagctgg ggccagggct gcgcaaccgt gggccacttt ggggtgtaca ccagggtctc\n" +
            "1321 ccagtacatc gagtggctgc aaaagctcat gcgctcagag ccacgcccag gagtcctcct\n" +
            "1381 gcgagcccca tttccctagc ccagcagccc tggcctgtgg agagaaagcc aaggctgcgt\n" +
            "1441 cgaactgtcc tggcaccaaa tcccatatat tcttctgcag ttaatggggt agaggagggc\n" +
            "1501 atgggaggga gggagaggtg gggagggaga cagagacaga aacagagaga gacagagaca\n" +
            "1561 gagagagact gagggagaga ctctgaggac atggagagag actcaaagag actccaagat\n" +
            "1621 taatagagac acagagatgg aatagaaaag atgagaggca gaggcagaca";

    private static String cdna = "1 catcatggtc tcccaggccc tcaggctcct ctgccttctg cttgggcttc agggctgcct\n" +
            "61 ggctgcaggc gagcacgacc tcagcgagca cgacggggat gagcagagcc ggcgggtggc\n" +
            "121 gcaggtcatc atccccagca cgtacgtccc gggcaccacc aaccacgaca tcgcgctgct\n" +
            "181 ccgcctgcac cagcccgtgg tcctcactga ccatgtggtg cccctctgcc tgcccgaacg\n" +
            "241 gacgttctct gagaggacgc tggccttcgt gcgcttctca ttggtcagcg gctggggcca\n" +
            "301 gctgctggac cgtggcgcca cggccctgga gctcatggtc ctcaacgtgc cccggctgat\n" +
            "361 gacccaggac tgcctgcagc agtcacggaa ggtgggagac tccccaaata tcacggagta\n" +
            "421 catgttctgt gccggctact cggatggcag caaggactcc tgcaaggggg acagtggagg\n" +
            "481 cccacatgcc acccactacc ggggcacgtg gtacctgacg ggcatcgtca gctggggcca\n" +
            "541 gggctgcgca accgtgggcc actttggggt gtacaccagg gtctcccagt acatcgagtg\n" +
            "601 gctgcaaaag ctcatgcgct cagagccacg cccaggagtc ctcctgcgag ccccatttcc\n" +
            "661 ctag";

 static {
        gene = gene.replaceAll("[\\d\\s]+", "");
        cdna = cdna.replaceAll("[\\d\\s]+", "");
      }

    static String getSense(String antiSense){
        char[] sense = antiSense.toCharArray();
        char[] antiSenseChar = new char[antiSense.length()];
        for (int i = 0; i < sense.length; i++) {
            antiSenseChar[i] = getComplementaryChar(sense[i]);
        }
        return new String(antiSenseChar);
    }

    static char getComplementaryChar(char antiSense){
        switch(antiSense){
            case 'a': return 't';
            case 't': return 'a';
            case 'c': return 'g';
            case 'g': return 'c';
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Exon> exons = new ArrayList<>();
        List<Exon> refinedExons = new ArrayList<>();
      for (int i = 0; i < cdna.length(); i++) {
          for (int j = i ; j < cdna.length() - i;) {
              j++;
              int k = j;
              String exonString = cdna.substring(i, k);
              if (gene.contains(exonString)) {
                  Exon exon = new Exon();
                  exon.setExon(exonString);
                  exon.setStart(i);
                  exon.setEnd(j);
                  exons.add(exon);
              }
          }
      }
        Exon exon = null;
      for (int i = 1; i < exons.size(); i++) {

          if (exons.get(i).getExon().contains(exons.get(i - 1).getExon())) {
              exon = exons.get(i);
          } else {
              refinedExons.add(exon);
              exon = null;
          }
      }
        refinedExons =  screen(refinedExons);
        System.out.println(" Exons size " + refinedExons.size());
        System.out.println("                                  ");
      for (Exon a : refinedExons) {
          if (a.getExon() != null)
              display(a.getStart(), a.getEnd(), a.getExon());
      }
   }

   private static List<Exon> screen(List<Exon> raw) {
     List<Exon> screen = new ArrayList<>();
       screen.add(raw.get(0));
       for (int i = 1; i < raw.size(); i++) {
           if (toAdd(raw.get(i), screen)) {
             screen.add(raw.get(i));
           }
       }
       return screen;
   }

   private static boolean toAdd(Exon exon, List<Exon> prod) {
     for (Exon a : prod) {
         if (a.getExon().contains(exon.getExon()) && a.getExon().length() > exon.getExon().length()) {
             return false;
         }
     }
     return true;
   }

    private static void display(int i, int k, String exon) {
        int exonLength = exon.length();
        System.out.println(" Begin index on gene is : " + gene.indexOf(cdna.substring(i, k)));
        int endIndex = gene.indexOf(cdna.substring(i, k)) + cdna.substring(i, k).length();
        System.out.println(" End index on gene is : " + endIndex);
        System.out.println(" The exon is  " + exon);
        System.out.println(" Begin index on cdna is : " + cdna.indexOf(exon));
        endIndex = cdna.indexOf(exon) + exonLength;
        System.out.println(" End index on cdna is : " + endIndex);
        System.out.println("                                         ");
    }
}
