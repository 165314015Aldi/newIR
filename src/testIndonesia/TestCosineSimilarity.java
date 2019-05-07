/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testIndonesia;

import Model.Document;
import Model.InvertedIndex;
import Model.Posting;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TestCosineSimilarity {
    public static void main(String[] args) {
        // seting dokumen
        Document doc1 = new Document(1, "Fahri Hamzah Usul Ibu Kota Pindah ke Kepulauan Seribu Kompas.com");
        Document doc2 = new Document(2, "Gaya Nyentrik Menteri Susi Saat Pimpin Penenggelaman 13 Kapal Vietnam di Kalbar");
        Document doc3 = new Document(3, "TNI AL: KRI Tjiptadi-381 Diprovokasi Kapal Pengawas Ikan Vietnam");

        // buat object invertedIndex
        InvertedIndex index = new InvertedIndex();
        //lakukan stemming untuk semua dokimen
        doc1.IndonesianStemming();
        doc2.IndonesianStemming();
        doc3.IndonesianStemming();
        // tmbahkan document ke index
        index.addNewDocument(doc1);
        index.addNewDocument(doc2);
        index.addNewDocument(doc3);
        // bikin dictionary
        index.makeDictionaryWithTermNumber();
        
        int IdDokumen = 1;
        System.out.println("ID Dokumen : "+IdDokumen);
        ArrayList<Posting> listDoc1 = index.makeTFIDF(IdDokumen);
        for(Posting temp:listDoc1){
            System.out.println(temp);
        }
        IdDokumen = 2;
        System.out.println("ID Dokumen : "+IdDokumen);
        ArrayList<Posting> listDoc2 = index.makeTFIDF(IdDokumen);
        for(Posting temp:listDoc2){
            System.out.println(temp);
        }
        IdDokumen = 3;
        System.out.println("ID Dokumen : "+IdDokumen);
        ArrayList<Posting> listDoc3 = index.makeTFIDF(IdDokumen);
        for(Posting temp:listDoc2){
            System.out.println(temp);
        }
        double Similarity12 = index.getCosineSimilarity(listDoc2, listDoc1);
        System.out.println("Similarity 1 dan 2 = "+Similarity12);
        double Similarity13 = index.getCosineSimilarity(listDoc3, listDoc1);
        System.out.println("Similarity 1 dan 3 = "+Similarity13);
        double Similarity23 = index.getCosineSimilarity(listDoc3, listDoc2);
        System.out.println("Similarity 2 dan 3 = "+Similarity23);
    }
}
