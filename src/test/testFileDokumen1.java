/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Model.Document;
import Model.InvertedIndex;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class testFileDokumen1 {
    public static void main(String[] args) {
        File dir = new File("test");
        InvertedIndex index = new InvertedIndex();
        index.readDirectory(dir);
        ArrayList<Document> listDoc = index.getListOfDocument();
        for (int i = 0; i < listDoc.size(); i++) {
            Document doc = listDoc.get(i);
            System.out.println("Content : "+doc.getId());
            System.out.println(doc.getContent());
        }
    }
}