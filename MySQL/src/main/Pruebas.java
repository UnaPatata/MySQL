package main;


import dao.AlumnosDAO;
import src.Conector;

public class Pruebas {

	public static void main(String[] args) {
//		Conector.conectar();
//		try {
//			Statement sentencia = Conector.getConexion().createStatement();
//			String sql = "SELECT * FROM alumnos";
//			ResultSet resultado = sentencia.executeQuery(sql);
//			
//			while (resultado.next()) {
//			    System.out.printf("%s, %s, %s , %f, %d  %n", 
//			    		resultado.getString(1), 
//			    		resultado.getString(2), 
//			    		resultado.getDate(3),
//			    		resultado.getFloat(4),
//			    		resultado.getInt(5));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		Conector.cerrarConexion();
//		ArrayList<Alumno> alumnos = AlumnosDAO.obtenerTodos();
//		alumnos = AlumnosDAO.obtenerTodos();
//		for (int i = 0; i < alumnos.size(); i++) {
//			System.out.println(alumnos.get(i).getNombre() );
//		}
		System.out.println(AlumnosDAO.getAlumnoId("A01").toString());
		Conector.cerrarConexion();
	}

} //class
