/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLucene;

import Model.Document;

/**
 *
 * @author admin
 */
public class TestDocumentIndonesiaStemming {
    public static void main(String[] args) {
        Document doc = new Document(1,"Dia sedang pergi berbelanja di pusat perbelanjaan."
                + "Namun, ibunya melarangnya pergi kesana karena tempat itu sangat berbahaya.");
        doc.IndonesianStemming();
        System.out.println(doc);
    }
}
