/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.util.ArrayList;
import java.util.List;
import model.Bed;
import model.Patient;
import model.Room;

/**
 *
 * @author DUCLONG
 */
public class RoomDAO extends DBContext{
    
    public List<Room> getListRoom() {
        List<Room> list = new ArrayList<>();
        String sql = "select * from dbo.tbl_room";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Room room = new Room();
                room.setId(rs.getLong(1));
                room.setName(rs.getString(2));
                room.setFloor(rs.getInt(3));
                list.add(room);
            }
            return list;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }

    }
    public void addNewRoom(String name,int floor){
        String sql ="Insert into dbo.tbl_room values (?,?)";
        try {
          ps = conn.prepareStatement(sql);
          ps.setString(1, name);
          ps.setInt(2, floor);
          ps.executeUpdate();
        } catch (Exception e) {
            
        }
        
    }
    public static void main(String[] args) {
        RoomDAO room_dao = new RoomDAO();
        List<Room> list_room = room_dao.getListRoom();
        for(Room room : list_room){
            System.out.println(room.getName());
        }
    }
    
}
