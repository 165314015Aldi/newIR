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
public class TestDocumentWithoutStopWord {
    public static void main(String[] args) {
        Document doc = new Document(1,"He was a man with gun");
        System.out.println("With Stop Word");
        System.out.println(doc);
        System.out.println("Without Stop word");
        doc.removeStopWord();
        System.out.println(doc);
    }
}
