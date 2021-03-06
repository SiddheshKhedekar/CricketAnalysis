package com.sahiljalan.cricket.Constants;

/**
 * Created by sahiljalan on 27/4/17.
 */
public class Constants {

    public static String CONSUMER_KEY = "";
    public static String CONSUMER_SECRET = "";
    public static String ACCESS_TOKKEN = "";
    public static String ACCESS_TOKKEN_SECRET = "";
    public static Boolean KeepTableAndViews = false;

    public static final String SerDeDriver = "org.openx.data.jsonserde.JsonSerDe";
    public static final String HiveDriver = "org.apache.hive.jdbc.HiveDriver";
    public static final String Team1Hashtags = "Team1_hashtagsView";
    public static final String Team2Hashtags = "Team2_hashtagsView";
    public static final String Team1Mentions = "Team1_mentionsView";
    public static final String Team2Mentions = "Team2_mentionsView";
    public static final String Team1_Temp = "Team1_Temp";
    public static final String TEAM1_VIEW = "Team1View";
    public static final String TEAM1_VIEWTABLE = "Team1viewtable";
    public static final String SABSE_BADA_FAN_TEAM_1 = "sabse_bada_fan_team1";
    public static final String Team2_Temp = "Team2_Temp";
    public static final String TEAM2_VIEW = "Team2View";
    public static final String TEAM2_VIEWTABLE = "Team2viewtable";
    public static final String SABSE_BADA_FAN_TEAM_2 = "sabse_bada_fan_team2";

    public static int Teams = 123;
    public static int year = 2017;
    public static String month = "04";
    public static String day = "20";
    public static int hour = 20;
    public static String HDFS_SERVER_LOCATION = "hdfs://localhost:9000/";
    public static String HDFS_POSTFIX_LOCATION = "/"+Teams+"/year="+year+"/month="+month+"/day="+day+"/hour="+hour;

    public static String TableName = "Match_Buzz_Default";
    public static String DictionaryTable = "dictionary";
    public static String TimeZoneTable = "timezone";
    public static String DataBaseName = "Project_Cricket_Defualt";
    public static String DataBaseAnalaysedResults = "Analaysed_Results";

    public static String TeamHashtags = "TeamHashtags_Sample";
    public static String TeamMentions = "TeamMentions_Sample";
    public static String TeamView = "Team_Sample";
    public static String TeamViewTable = "TeamViewTable_Sample";
    public static String SabseBadaFan = "sabsebadafan_Sample";
    public static int SBF_MAX_COUNT1 = 0;
    public static String SBF_MAX_COUNT_USERNAME1 = "";
    public static int SBF_MAX_COUNT2 = 0;
    public static String SBF_MAX_COUNT_USERNAME2 = "";
    public static String TeamViewTemp = "Team_Temp_Sample";

    public static String Team1Sentiments = "Team1_Sentiments";
    public static String Team2Sentiments = "Team2_Sentiments";
    public static String TeamSentiments = "TeamSentiments_Sample";

    public static String SentiViewT1V1 = "Sentiment_View_T1_V1";
    public static String SentiViewT1V2 = "Sentiment_View_T1_V2";
    public static String SentiViewT1V3 = "Sentiment_View_T1_V3";
    public static String SentiViewT2V1 = "Sentiment_View_T2_V1";
    public static String SentiViewT2V2 = "Sentiment_View_T2_V2";
    public static String SentiViewT2V3 = "Sentiment_View_T2_V3";

    public static String SentimentView1 = "SentimentView1_Sample";
    public static String SentimentView2 = "SentimentView2_Sample";
    public static String SentimentView3 = "SentimentView3_Sample";

    public static String PosHype1 = "PosHype1";
    public static String PosHype2 = "PosHype2";
    public static String PosHype = "poshype_sample";


    public static String DictionaryLocation = "/home/sahiljalan/IdeaProjects/CricketAnalysis/data/dictionary.tsv";
    public static String TimeZoneLocation = "/home/sahiljalan/IdeaProjects/CricketAnalysis/data/timezone.tsv";
    public static String TeamCodeLocation = "/home/sahiljalan/IdeaProjects/CricketAnalysis/data/TeamCodes.csv";
    public static String TeamCodeTable = "TeamCodes";
    public static int setStopHour;
    public static String USER_DEFINED_TIMEZONE = "IST";
    public static String FLUME_LOCAL_TIMEZONE = "IST";
    public static String FLUME_CONFIG_FILE_LOCATION = "/home/sahiljalan/flume/conf/";


    public static void setTableName(String TBName){
        TableName = TBName;
    }

    public static void setDBName(String DBName){
        DataBaseName = DBName;
    }

    public static void setTeamHashtags(String THName){
        TeamHashtags = THName;
    }

    public static void setTeamMentions(String TMName){
        TeamMentions = TMName;
    }

    public static void setTeamView(String TName){
        TeamView = TName;
    }

    public static void setTeamViewTable(String TName){
        TeamViewTable = TName;
    }

    public static void setSBFMaxCount1(int SBFCount){

        SBF_MAX_COUNT1 = SBFCount;
    }

    public static void setSBFMaxCountUserName1(String SBFCountUN){
        SBF_MAX_COUNT_USERNAME1 = SBFCountUN;
    }

    public static void setSBFMaxCount2(int SBFCount){

        SBF_MAX_COUNT2 = SBFCount;
    }

    public static void setSBFMaxCountUserName2(String SBFCountUN){
        SBF_MAX_COUNT_USERNAME2 = SBFCountUN;
    }

    public static void setSabseBadaFanTable(String TName){
        SabseBadaFan = TName;
    }

    public static void setTeamViewTemp(String TTame){
        TeamViewTemp = TTame;
    }


    public static void setLocation(int y,String m,String d){
        year = y;
        month = m;
        day = d;
    }

    public static void setLocation(String m,String d){
        month = m;
        day = d;
    }

    public static void setLocation(String d){
        day = d;
    }
    public static void setLocationWithOutHour(int battleCode, int year,String month,String day){
        HDFS_POSTFIX_LOCATION = "/"+battleCode+"/year="+year+"/month="+month+"/day="+day+"/";
    }

    public static void setLocation(int battleCode, int y,String m,String d,int h){
        Teams = battleCode;
        year = y;
        month = m;
        day = d;
        hour = h;
        HDFS_POSTFIX_LOCATION = "/"+Teams+"/year="+year+"/month="+month+"/day="+day+"/hour="+hour+"/";
    }

    public static void setsentimentView1(String SVName) {
        SentimentView1 = SVName;
    }

    public static void setsentimentView2(String SVName) {
        SentimentView2 = SVName;
    }

    public static void setsentimentView3(String SVName) {
        SentimentView3 = SVName;
    }

    public static void TeamSentiments(String TSName) {
        TeamSentiments = TSName;
    }

    public static void setPosHype(String PHName){
        PosHype = PHName;
    }
}