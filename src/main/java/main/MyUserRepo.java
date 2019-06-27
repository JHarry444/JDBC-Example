package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyUserRepo implements CRUDRepo<User> {

	@Override
	public void create(List<User> toInsert) {
		try (Connection con = DriverManager.getConnection(DBConnection.URI, DBConnection.USER, DBConnection.PASS)) {
			String sql = "UPDATE users SET age = ?, gender = ?, occupation_id = ?, zip_code = ? WHERE id = ?;";
			PreparedStatement ps = con.prepareStatement(sql);
			for (User user : toInsert) {
				ps.setInt(1, user.getAge());
				ps.setString(2, user.getGender());
				ps.setInt(3, user.getOccupation_id());
				ps.setString(4, user.getZip_code());
				ps.setInt(5, user.getId());
				ps.execute();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	public List<User> read() {
		List<User> users = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(DBConnection.URI, DBConnection.USER, DBConnection.PASS)) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM users;");
			while (rs.next()) {
				users.add(new User(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5)));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return users;
	}

	@Override
	public void update(List<User> toUpdate) {
		try (Connection con = DriverManager.getConnection(DBConnection.URI, DBConnection.USER, DBConnection.PASS)) {
			String sql = "UPDATE users SET age = ?, gender = ?, occupation_id = ?, zip_code = ? WHERE id = ?;";
			PreparedStatement ps = con.prepareStatement(sql);
			for (User user : toUpdate) {
				ps.setInt(1, user.getAge());
				ps.setString(2, user.getGender());
				ps.setInt(3, user.getOccupation_id());
				ps.setString(4, user.getZip_code());
				ps.setInt(5, user.getId());
				ps.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Override
	public void delete(List<User> toDelete) {
		try (Connection con = DriverManager.getConnection(DBConnection.URI, DBConnection.USER, DBConnection.PASS)) {
			String sql = "DELETE FROM users WHERE id = ?;";
			PreparedStatement ps = con.prepareStatement(sql);
			for (User user : toDelete) {
				ps.setInt(1, user.getId());
				ps.execute();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
