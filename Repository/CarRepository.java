
package Repository;

import Entity.Car;
import Utility.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CarRepository implements ICRUD<Car> {
    @Override
    public void save(Car t) {
        String sql = "insert into car (id,brand,car_model,model_year,dealership_id) values( ?,?,?,?,? )";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setLong(1, t.getId());
            ps.setString(2, t.getBrand());
            ps.setString(3, t.getCarModel());
            ps.setString(4, t.getModelYear());
            ps.setLong(5, t.getDealershipId());

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public void update(Car t, long id) {
        String sql = "Update car SET brand=?,car_model=?,model_year=?,dealership_id=? where id=?;";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setString(1, t.getBrand());
            ps.setString(2, t.getCarModel());
            ps.setString(3, t.getModelYear());
            ps.setLong(4, t.getDealershipId());
            ps.setLong(5, id);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(long id) {
        String sql = "Delete FROM car where id=?";

        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ps.setLong(1, id);

            ps.executeUpdate();


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @Override
    public List<Car> findAll() {
        String sql = "SELECT * FROM car";
        List<Car> myCarList=new ArrayList<>();
        try {
            PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
            ResultSet allCars = ps.executeQuery();

           while (allCars.next() ){
              myCarList.add(new Car(allCars.getLong(1),allCars.getString(2),allCars.getString(3),
                      allCars.getString(4),allCars.getLong(5)));
           }


        } catch (SQLException ex) {
            Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return myCarList;
    }

    @Override
    public void saveAll(List<Car> t) {
        String sql = "insert into car (brand,car_model,model_year,dealership_id,id) values( ?,?,?,?,?)";
        t.forEach(s -> {

            try {
                PreparedStatement ps = DbConnection.getInstance().getConnection().prepareStatement(sql);
                ps.setString(1, s.getBrand());
                ps.setString(2, s.getCarModel());
                ps.setString(3, s.getModelYear());
                ps.setLong(4, s.getDealershipId());
                ps.setLong(5, s.getId());
                ps.executeUpdate();


            } catch (SQLException ex) {
                Logger.getLogger(CarRepository.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    @Override
    public int findId() {
        String sql = "select count (*) FROM public.car";
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
}
    