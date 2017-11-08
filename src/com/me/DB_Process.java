package com.me;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Just Me on 11/8/2017.
 */
public class DB_Process {

    private static PreparedStatement ps;
    private static String sql;

    public void saveCVS(List<Report2> report2){
        for (Report2 s:report2) {
//            sql = "insert into RAW_REPORT(DATE,IMPRESSIONS,CLICKS,EARNING) values (?,?,?,?)";
            sql ="insert into cvstodb values(?,?,?,?)";
            try {
                ps = DBUtil.getConnection().prepareStatement(sql);
                ps.setString(1, s.getDate());
                ps.setString(2, s.getImpressions());
                ps.setString(3, s.getClicks());
                ps.setString(4, s.getEarning());
                ps.executeUpdate();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
