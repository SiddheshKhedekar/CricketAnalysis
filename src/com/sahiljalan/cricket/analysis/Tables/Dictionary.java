package com.sahiljalan.cricket.analysis.Tables;

import com.sahiljalan.cricket.analysis.Constants.Constants;
import com.sahiljalan.cricket.analysis.CricketAnalysis.CricketAnalysis;
import com.sahiljalan.cricket.analysis.Main;
import com.sahiljalan.cricket.analysis.TeamData.TeamCodes;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by sahiljalan on 28/4/17.
 */
public class Dictionary extends TeamCodes{

    private Statement query = CricketAnalysis.getStatement();

    public Dictionary() throws SQLException {
        //First it calls the default constructor of TeamCodes than create Dictionary
        System.out.println("Running : Dictionary class");
        createDictionaryTable();
    }

    private void createDictionaryTable() throws SQLException {

        System.out.println("Running : creating Dictionary Table() IF NOT EXISTS");
        query.execute("CREATE EXTERNAL TABLE IF NOT EXISTS "+ Constants.DictionaryTable + "(" +
                "type string," +
                "length int," +
                "word string," +
                "pos string," +
                "stemmed string," +
                "polarity string" +
                ")" +
                "ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' ");
        query.execute("LOAD DATA LOCAL INPATH '"+Constants.DictionaryLocation+"' OVERWRITE INTO TABLE " +
                Constants.DictionaryTable);
    }
}
