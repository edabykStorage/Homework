
package Repository;

import Entity.Car;
import Entity.Dealership;
import Utility.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DealershipRepository implements ICRUD<Dealership>{

     
    
    @Override
    public void save(Dealership t) {
        String sql = "insert into dealership (id,name,country,city) values(?,?,?,?)";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setLong(1, t.getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getCountry());
            ps.setString(4, t.getCity());
            ps.executeUpdate();



        } catch (SQLException ex) {
            Logger.getLogger(DealershipRepository.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public void update(Dealership t, long id) {
        String sql = "Update dealership SET name=?,country=?,city=? where id=?;";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, t.getName());
            ps.setString(2, t.getCountry());
            ps.setString(3, t.getCity());
            ps.setLong(4, id);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    public void delete(long id) {
        String sql = "Delete FROM dealership where id=?";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setLong(1, id);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Dealership> findAll() {
        String sql = "SELECT * FROM dealership";
        List<Dealership> myDealerList=new ArrayList<>();
        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ResultSet allDealers = ps.executeQuery();

            while (allDealers.next() ){
                myDealerList.add(new Dealership(allDealers.getLong(1),allDealers.getString(2),allDealers.getString(3),
                        allDealers.getString(4)));
            }
         

        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myDealerList;
    }


    @Override
    public void saveAll(List<Dealership> t) {
        String sql = "insert into dealership (id,name,country,city) values(?,?,?,?)";
        t.forEach(s -> {

            try {
                PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
                ps.setLong(1, s.getId());
                ps.setString(2, s.getName());
                ps.setString(3, s.getCountry());
                ps.setString(4, s.getCity());
                ps.executeUpdate();


            } catch (SQLException ex) {
                Logger.getLogger(DealershipRepository.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }



    @Override
    public int findId() {
        String sql = "select count (*) FROM public.dealership";
        int result = 0;
        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.next();
            result = rs.getInt(1) + 1;

        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }

    public static void main(String[] args) {
        DealershipRepository dr=new DealershipRepository();
        dr.findAll();
    }
}

